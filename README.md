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
