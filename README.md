# C <> - Angular C

**Angular C** is an *open source*, C++ derived programming language that makes it easier to work with templates and adds several advanced functionalities to standard C++.

**C <>** is nearly as simple to write as other modern programming languages, but enabling the user to effortlessly write structured compile-time code, it is often *faster* than C++ itself at runtime.

## Highlights

**C <>** extends C++ with a collection of new, awesome features. The core template features are focused on runtime performance and simplicity, allowing the programmer to easily master techniques that would require an extremely verbose, difficult to mantain, and hard to read code in C++. **C <>** also brings to C++ several fresh new constructs inspired from more modern programming languages like Javascript, Swift, but making them as performant as any other C++ construct.

**C <>** is *fast* and *simple*. Here are some of its strong points.

### Core template features

#### Compile-time if

C++ templates are awesome. With a boolean template parameter, a support double-specialized class you can get your code to be compiled depending on conditions on your template parameters.

It's like an *if clause*, but its value is determined at *compile time*. It's awesome! <sup> 1 </sup>

```c++

template <int number> void even_only()
{
  if <number % 2 == 0>
  {
    // Do something awesome!
  }
  else
  {
    // We don't serve your kind here!
  }
}

```

```c++

template <bool enable> class conditional_even_executor;

template <> class conditional_even_executor <true>
{
public:
  static inline void execute();
};

template <> class conditional_even_executor <false>
{
public:
  static inline void execute();
};

template <> inline void conditional_even_executor <true> :: execute()
{
  // Do something awesome!
}

template <> inline void conditional_even_executor <false> :: execute()
{
  // We don't serve your kind here!
}

template <int number> void even_only()
{
  conditional_even_executor <number % 2 == 0> :: execute();
}

```

<sup> 1 </sup> And it is not only about performance. Consider the following example:

```c++

template <bool> class my_class;

template <> class my_class <true>
{
public:
  int i;
};

template <> class my_class <false>
{
public:
  int j;
};

template <bool bvalue> void print(my_class <bvalue> my_object)
{
  if(bvalue)
    std :: cout << my_object.i << std :: endl;
  else
    std :: cout << my_object.j << std :: endl;
}

```

This example will yield an error when compiling, even we already known which branch of the classic if clause will be visited.

#### Compile-time for

We love *for*. It's all about saying how many times you want something done and getting it done *that many times*! Wow, machines are so patient.

Non-type template parameters make it possible to do some operation on an object depending on the value of the parameters, at compile time. This means that you can do something for `0` and something completely different for `1`.

Take `std :: tuple`, for example. `std :: get <0>` and `std :: get <1>` don't even have to return the same value. Now, what if we wanted to *loop* on something like `std :: get`? With templates, we can do that!

```c++
template <typename... types> void hello(std :: tuple <types...> everyone)
{
  for <size_t i = 0; i < sizeof...(types); i + 1>
  {
    std :: get <i> (everyone).hello();
  }
}
```

```c++
template <size_t index, bool next> class hello_conditional_next;

template <size_t index> class hello_conditional_next <index, true>
{
public:
  template <typename... types> static inline void next(std :: tuple <types...>);
};

template <size_t index> class hello_conditional_next <index, false>
{
public:
  template <typename... types> static inline void next(std :: tuple <types...>);
};

template <size_t index> class hello_iterator;

template <size_t index> class hello_iterator
{
public:
  template <typename... types> static inline void hello(std :: tuple <types...>);
};

template <size_t index> template <typename... types> inline void hello_conditional_next <index, true> :: next(std :: tuple <types...> everyone)
{
  hello_iterator <index + 1> :: hello(everyone);
}

template <size_t index> template <typename... types> inline void hello_conditional_next <index, false> :: next(std :: tuple <types...> everyone)
{
}

template <size_t index> template <typename... types> inline void hello_iterator <index> :: hello(std :: tuple <types...> everyone)
{
  std :: get <index> (everyone).hello();
  hello_conditional_next <index, (index < sizeof...(types) - 1)> :: next(everyone);
}

template <typename... types> void hello(std :: tuple <types...> everyone)
{
  hello_iterator <0> :: hello(everyone);
}

```

#### The `has` construct

<b>S</b>*ubstitution* <b>F</b>*ailure* <b>I</b>*s* <b>N</b>*ot* <b>A</b>*n* <b>E</b>*rror* is a powerful, powerful tool. It allows you to inspect a class at compile time, and behave consequently. You can get to know if a class has a member, a method, you can find out what what does a method return, anything, basically. <sup>2</sup>

SFINAE constructs, however, are *so* unreadable. With the `has` construct, we made things much easier.

```c++
template <typename type> void optionally_walk(type walker)
{
  walk_if_you_can <type has void walk()> ();
}
```

```c++
template <typename type> class has_walk_method
{
    template <typename wtype, void (wtype :: *) ()> class has_walk_method_sfinae
    {
    };

    template <typename wtype> static int8_t test(has_walk_method_sfinae <wtype, &wtype :: walk> *);
    template <typename size_type> static int32_t test(...);

  public:
    static constexpr bool value = sizeof(test <type> (0)) == sizeof(int8_t);
};

template <typename type> void optionally_walk(type walker)
{
  walk_if_you_can <has_walk_method <type> :: value> (walker);
}

```

The `has` construct lets you specify a wide variety of conditions. In the previous example, all the following would have been accepted:

```c++
walk_if_you_can <type has legs> (walker);
walk_if_you_can <type has int legs> (walker);
walk_if_you_can <type has static int legs> (walker);
walk_if_you_can <type has static void walk()> (walker);
walk_if_you_can <type has walk(int, double, char)> (walker);
```

<sup>2</sup> The only thing you cannot do is to *list* all members, methods, and so on in a class. But we thought about that as well. Read on!
