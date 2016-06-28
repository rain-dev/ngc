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

### Function parent scope

An `if <>` will only appear in the scope of a function or a method. We will refer to **function parent scope** as the scope in which the function is defined. That will either be a `class` / `struct` or a `namespace` (that can be the `global` namespace as well).

The function parent scope will be determined from the full scope of the point where the function is first defined. That will be a sequence of nested namespaces rooted in the `global` namespace, followed by a sequence of nested classes, some of which will be template classes.

### Injection points

We will make use of two injection points for C++ code, the first called **forward injection point**, the second **pre-function injection point**.

The **forward injection point** lies at the opening of the function parent scope. This means:

 * At the beginning of the signature of the class containing the method, if the function is a class method.
 * At the beginning of the first definition of the namespace in which the function lies, if the function lies in a namespace.
 * At the beginning of the code, if the function lies in the global namespace.

The **pre-function injection point** will be immediately before the implementation of the function, where the `if <>` clause is specified.

Please note how both injection points are uniquely determined.

### The conditional structures

The C++ implementation of `if <>` will rely on two non-template structures, `__ngc_id_conditional_true__` and `__ngc_id_conditional_false__`, where `id` is the global progressive id for C <> service structures.

Both structures will wrap a `static inline` `execute` method in which the instructions in the `if <>` and `else` clauses will be wrapped, respectively.

The forward injection point will just contain a forward declaration for both the conditional structures:

```c++
class __ngc_id_conditional_true__;
class __ngc_id_conditional_false__;
```

### Pre-function implementation

Both the conditional structures will be implemented in the pre-function injection point, before the opening of the function.

#### Declaration scope

The declaration relative scope for the classes will be deduced from the function declaration. The function declaration will consist of a sequence of `template <>` keywords, followed by the function properties (as `static` or `inline`), followed by a return type, followed by a sequence of `::`-separated scopes, some of which will have a template specification `<>` attached, followed by the function name and the function arguments.

We will not be able to contextually determine wether those scopes refer to namespaces or classes, but thanks to the forward declaration injection this will not matter.

The declaration scope will be introduced by all the `template <>` specifications in the function declaration, **except** for the last in case the function is a template function. This can be contextually diagnosed by the fact that the number of `template <>` constructs is greater by one than the `<>` specifications.

Here are a few examples:

```c++
/* Empty */
class __ngc_id_conditional_true__ { /* ... */ };
class __ngc_id_conditional_false__ { /* ... */ };
void f() { /* ... */ }

/* Scoped */
class a :: b :: __ngc_id_conditional_true__ { /* ... */ };
class a :: b :: __ngc_id_conditional_false__ { /* ... */ };
void a :: b :: f() { /* ... */ }

/* Scoped, with function properties */
class a :: b :: __ngc_id_conditional_true__ { /* ... */ };
class a :: b :: __ngc_id_conditional_false__ { /* ... */ };
static inline void a :: b :: f() { /* ... */ }

/* Scoped, with templates */
template <typename t> class a :: b <t> :: __ngc_id_conditional_true__ { /* ... */ };
template <typename t> class a :: b <t> :: __ngc_id_conditional_false__ { /* ... */ };
template <typename t> void a :: b <t> :: f() { /* ... */ }

/* Scoped, with multiple templates */
template <typename t> template <typename q> class a <t> :: b <q> :: __ngc_id_conditional_true__ { /* ... */ };
template <typename t> template <typename q> class a <t> :: b <q> :: __ngc_id_conditional_false__ { /* ... */ };
template <typename t> template <typename q> void a <t> :: b <q> :: f() { /* ... */ }

/* Scoped, with templates, function is a template */
template <typename t> class a :: b <t> :: __ngc_id_conditional_true__ { /* ... */ };
template <typename t> class a :: b <t> :: __ngc_id_conditional_false__ { /* ... */ };
template <typename t> template <typename q> void a :: b <t> :: f() { /* ... */ }

/* Scoped, with templates, some of which specialized*/
template <> template <typename t> class a <int> :: b <t> :: __ngc_id_conditional_true__ { /* ... */ };
template <> template <typename t> class a <int> :: b <t> :: __ngc_id_conditional_false__ { /* ... */ };
template <> template <typename t> void a <int> :: b <t> :: f() { /* ... */ }

/* Scoped, with templates, function is a specialized template*/
template <typename t> template <typename q> class a <t> :: b <q> :: __ngc_id_conditional_true__ { /* ... */ };
template <typename t> template <typename q> class a <t> :: b <q> :: __ngc_id_conditional_false__ { /* ... */ };
template <typename t> template <typename q> template <> class a <t> :: b <q> :: f() { /* ... */ }
```

#### `execute()` template parameters

If the function is an unspecialized template, then both the `execute()` methods will be templates with the same parameters as the function. As we earlier showed, the function being a template can be contextually deduced by the number of `template <>` specifications being greater by one than the number of `<>` specifications.

The parameters contained in the `template <>` specification will therefore be used as template parameters for `execute()`, **if and only if** the `template <>` is not empty. Otherwise, the function is a template specialization and `execute()` will just be normal static methods.

Here are a few examples:

```c++
/* Not a template */
class __ngc_id_conditional_true__
{
  static inline void execute() { /* ... */ }
};

class __ngc_id_conditional_false__
{
  static inline void execute() { /* ... */ }
};

void f() { /* ... */ }

/* Unspecialized template */
class __ngc_id_conditional_true__
{
  template <size_t index, typename type, bool> static inline void execute() { /* ... */ }
};

class __ngc_id_conditional_false__
{
  template <size_t index, typename type, bool> static inline void execute() { /* ... */ }
};

template <size_t index, typename type, bool> void f() { /* ... */ }

/* Specialized template */
class __ngc_id_conditional_true__
{
  static inline void execute() { /* ... */ }
};

class __ngc_id_conditional_false__
{
  static inline void execute() { /* ... */ }
};

template <> void f <0, int, false> () { /* ... */ }
```
