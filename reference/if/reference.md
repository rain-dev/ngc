# `if <>` reference

## General description

An `if <>` construct allows the user to make compile-time if statements to selectively compile portions of the code, depending on compile-time kwnown boolean variables.

As an example, the following:

```c++
template <bool value, typename type> void f(type item)
{
  if <value>
  {
    item.hello();
  }
  std :: cout << item << std :: endl;
}
```

Will compile to

```c++
void f(type item)
{
  item.hello();
  std :: cout << item << std :: endl;
}
```

if `value` is `true`, and to

```c++
void f(type item)
{
  std :: cout << item << std :: endl;
}
```

if `value` is `false`. This has both advantages from a performance point of view (everything that is known at compile time will spare runtime checks), and also allows the programmer to be more flexible in terms of selectively using features that are not uniformly present in the objects the function is working on.

Following from the previous example, if `type` is `int` but `value` is `false`, the program will successfully compile even if `int` does not expose a `hello()` method. Using a classical `if()` statement, the above would not compile, even if `value` is known at compile time and, therefore, only one branch of the `if()` will be visited.

## Implementation details

### `__ngc_container__` declaration

As functions can be declared and implemented in different places, we wanted to avoid having to inject classes and other pieces of code in particular spots that would require contrived scope resolution. (Please note that, when making use of template, scope resolution can be made so complicated that only a full-fledged compiler would be able to resolve them.)

To address this issue, every `class`, `struct` or `namespace` opening will be followed by the following forward declaration:

```c++
template <unsigned long, bool> struct __ngc_container__;
```

This will allow us to later inject classes anywhere, since a `__ngc_container__` will always exist in that namespace. The two template arguments for `__ngc_container__` are a progressive number that we will use to distinguish between different containers (that will always be specialized when implementing a container), and a dummy boolean value, that will never be specialized so as to avoid the issue `Explicit specialization of __ngc_container__ in class scope.`

A container will wrap any other C <> structure that will need to be injected anywhere in the code. When implementing a container, the dummy parameter will be called with a containing the progressive index, so as to avoid template parameter shadowing when using nested templates.

```c++
template <bool __ngc_0_dummy__> struct __ngc_container__ <0, __ngc_0_dummy__>
{
  // Something awesome happens here.
};
```

The only exception to `__ngc_container__` declaration will be in an `__ngc_container__`. Please note that any nested class to an `__ngc_container__` will still have the declaration injected:

```c++`
template <unsigned long, bool> struct __ngc_container__;

/* ... */

template <bool __ngc_0_dummy__> struct __ngc_container__ <0, __ngc_0_dummy__>
{
  struct __ngc_conditional_true__ // See later
  {
    template <unsigned long, bool> struct __ngc_container__;
  };
};
``

### Injection point

We will make use of only one injection points for C++ code, called **pre-function container injection point**.

The **pre-function container injection point** will be immediately before the implementation of the function, where the `if <>` clause is specified.

Please note how the injection point is uniquely determined.

### The conditional structures

The C++ implementation of `if <>` will rely on two non-template structures, `__ngc_conditional_true__` and `__ngc_conditional_false__`, both wrapped in the same `struct __ngc_container__ <id, __ngc_id_dummy__>` where `id` is the global progressive id for C <> container structures.

Both `conditional` structures will wrap a `static inline` `execute` method in which the instructions in the `if <>` and `else` clauses will be wrapped, respectively.

### Pre-function injection

Both the conditional structures will be implemented in the pre-function injection point, before the opening of the function.

#### Declaration scope

The declaration relative scope for the classes will be deduced from the function declaration. The function declaration will consist of a sequence of `template <>` keywords, followed by the function properties (as `static` or `inline`), followed by a return type, followed by a sequence of `::`-separated scopes, some of which will have a template specification `<>` attached, followed by the function name and the function arguments.

We will not be able to contextually determine wether those scopes refer to namespaces or classes, but thanks to the `__ngc_container__` declaration at the beginning of every namespace and class this will not matter.

The declaration scope will be introduced by all the `template <>` specifications in the function declaration, **except** for the last in case the function is a template function. This can be contextually diagnosed by the fact that the number of `template <>` constructs is greater by one than the `<>` specifications.

Here are a few examples:

```c++
/* Empty */
template <bool __ngc_id_dummy__> struct __ngc_container__ <id, __ngc_id_dummy__> { /* ... */ };
void f() { /* ... */ }

/* Scoped */
template <bool __ngc_id_dummy__> struct a :: b :: __ngc_container__ <id, __ngc_id_dummy__> { /* ... */ };
void a :: b :: f() { /* ... */ }

/* Scoped, with function properties */
template <bool __ngc_id_dummy__> struct a :: b :: __ngc_container__ <id, __ngc_id_dummy__> { /* ... */ };
static inline void a :: b :: f() { /* ... */ }

/* Scoped, with templates */
template <typename t> template <bool __ngc_id_dummy__> struct a :: b <t> :: __ngc_container__ <id, __ngc_id_dummy__> { /* ... */ };
template <typename t> void a :: b <t> :: f() { /* ... */ }

/* Scoped, with multiple templates */
template <typename t> template <typename q> struct a <t> :: b <q> :: __ngc_container__ <id, __ngc_id_dummy__> { /* ... */ };
template <typename t> template <typename q> void a <t> :: b <q> :: f() { /* ... */ }

/* Scoped, with templates, function is a template */
template <typename t> template <bool __ngc_id_dummy__> struct a :: b <t> :: __ngc_container__ <id, __ngc_id_dummy__> { /* ... */ };
template <typename t> template <typename q> void a :: b <t> :: f() { /* ... */ }

/* Scoped, with templates, some of which specialized*/
template <> template <typename t> template <bool __ngc_id_dummy__> struct a <int> :: b <t> :: __ngc_container__ <id, __ngc_id_dummy__> { /* ... */ };
template <> template <typename t> void a <int> :: b <t> :: f() { /* ... */ }

/* Scoped, with templates, function is a specialized template*/
template <typename t> template <typename q> template <bool __ngc_id_dummy__> struct a <t> :: b <q> :: __ngc_container__ <id, __ngc_id_dummy__> { /* ... */ };
template <typename t> template <typename q> template <> class a <t> :: b <q> :: f() { /* ... */ }
```

#### `execute()` template parameters

If the function is an unspecialized template, then both the `execute()` methods will be templates with the same parameters as the function. As we earlier showed, the function being a template can be contextually deduced by the number of `template <>` specifications being greater by one than the number of `<>` specifications.

The parameters contained in the `template <>` specification will therefore be used as template parameters for `execute()`, **if and only if** the `template <>` is not empty. Otherwise, the function is a template specialization and `execute()` will just be normal static methods.

Here are a few examples:

```c++
/* Not a template */
class __ngc_conditional_true__
{
  static inline void execute() { /* ... */ }
};

class __ngc_conditional_false__
{
  static inline void execute() { /* ... */ }
};

void f() { /* ... */ }

/* Unspecialized template */
template <bool __ngc_0_dummy__> struct __ngc_container__ <0, __ngc_0_dummy__>
{
  struct __ngc_conditional_true__
  {
    template <size_t index, typename type, bool> static inline void execute() { /* ... */ }
  };

  struct __ngc_conditional_false__
  {
    template <size_t index, typename type, bool> static inline void execute() { /* ... */ }
  };
};

template <size_t index, typename type, bool> void f() { /* ... */ }

/* Specialized template */
template <bool __ngc_1_dummy__> struct __ngc_container__ <1, __ngc_1_dummy__>
{
  struct __ngc_conditional_true__
  {
    static inline void execute() { /* ... */ }
  };

  struct __ngc_conditional_false__
  {
    static inline void execute() { /* ... */ }
  };
};

template <> void g <0, int, false> () { /* ... */ }
```

For examples, see `showcase/basic_templates.ngc` and `showcase/basic_templates.cpp`.

#### `execute()` arguments

The instructions inside the `if <>` clause need to be able to access the same variables as a regular `if()` statement would. Since the code is now wrapped inside an `execute()` function, it is necessary that all the variables that are used in either branch of the `if <>` clause will be passed by reference to both the `execute()` statements.

**Remark**: please note that it is necessary to make the arguments for both `execute()` methods identical. As we will later see, `__ngc_conditional_true__` and `__ngc_conditional_false__` are selected with an `std :: conditional`, and their `execute` statement is called with an identical call.

Will be passed **as a reference** all and only the variables that are used in either branch of the `if <>` clause and that:

 * Were passed as arguments to the function.
 * Were defined in any scope in the function that contains the `if <>` clause.

#### Inside the `execute()`

The body of the `execute()` method will be as follows:

```c++
execute()
{
  /* Templates and using (see later) */

  {
    /* if <> branch code */
  }
}
```

The `execute()` body is introduced by a set of `using` statements and `constexpr` declarations (see later for further reference). Then, an headless scope is introduced to separate the inner code of the `if <>` branch from the `using` statements and `constexpr` declarations.

The additional headless scope is necessary to allow for redeclaration of variables whose name collide with a constexpr declaration without incurring in a redeclaration error.

#### `using` statements

It is necessary to make the namespace used uniform inside and outside the `if <>` clause. This is achieved by placing the `__ngc_conditional_true__` and `__ngc_conditional_false__` structs within the parent function scope. However, the accessible scope can be modified with an `using` statement.

Therefore, **all** `using` statements in any scope of the function that contain the `if <>` clause will be copied at the beginning of the `execute()` method in the same order as they appear in the code.

This will ensure that all the scopes accessible outside the code of the `if <>` will also be accessible inside it.

For examples, see `showcase/using.ngc` and `showcase/using.cpp`.

#### `constexpr` declarations

All `constexpr` declarations that were defined within the scope of the function need to be accessible from within the `if <>` clause. However, passing those `constexpr`s as arguments to `execute()` will lose their `constexpr` status, so that for example it will be impossible to use them as template arguments.

All the `constexpr` declarations whose value is used within the scope of the `if <>` will be therefore copied at the beginning of the `execute()` method with the following conditions:

* They will appear in the same order as they do in the function.
* The order will also be mantained with **`using` statements**. This will ensure that if a `constexpr` declaration relies on an `using` statement, its validity will not be affected.
* If more than one `constexpr` is declared with the same name in different scopes in which the `if <>` is contained, then **only** the last one will be added at the beginning of the `execute()` method, as the previous will be hidden by the last one.

For examples, see `showcase/constexpr.ngc` and `showcase/constexpr.cpp`.

### `if <>` substitution

We saw how all the code in the branches of an `if <>` statement are wrapped in two `execute` methods in two `__ngc_conditional_true__` and `__ngc_conditional_false__` structs, which are in turn wrapped in an appropriate `__ngc_container__`. Now all the `if <>` code needs to be substituted with proper C++ code.

We will distinguish two cases: if the function lies in the global scope or not.

The following:

```c++
if <condition>
{
  /* ... */
}
else
{
  /* ... */
}
```

in the first case (global scope) will be substituted with an appropriate:

```c++
std :: conditional <condition, typename :: __ngc_container__ <id, false> :: __ngc_conditional_true__, typename :: __ngc_container__ <id, false> :: __ngc_conditional_false__> :: type :: template execute <condition> (n, k, j);
```

while in the second case (class or namespace scope), it will be substituted with an appropriate:

```c++
std :: conditional <condition, typename :: __ngc_container__ <id, false> :: __ngc_conditional_true__, typename :: __ngc_container__ <id, false> :: __ngc_conditional_false__> :: type :: template execute <condition> (n, k, j);
```
### Nested `if <>`

It is important to remark of, being `execute` just an inline function in an `__ngc_conditional_true__` or `__ngc_conditional_false__` struct (in which, as we saw, the container declaration still takes place), it is subject itself to a pre-function injection.

Therefore, all the above rules extend immediately to the case of nested `if <>` statements.

For examples, see `showcase/nested.ngc` and `showcase/nested.cpp`.
