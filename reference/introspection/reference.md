# `introspection` reference

## General description

The section `introspection` includes all the utilities created to be able to access meta-properties of a ngc class. An example of such properties is count of the *number of elements in a class* and their indexing.

## `__ngc_member_count__`

Class `__ngc_member_count__`includes utilities to count the number of objects in a class and to index them. Consider the following example:

```c++
class my_class
{
public:
  int i;
  double j;
}
```

After parsing the user can explicit the number of elements in the class with `__ngc_member_count__` by simply writing:

```c++
__ngc_member_count__ <myclass> :: value // Result: 2
```
Moreover members can be accessed via their name through the following getter:

```c++
myclass object;
object[`i`] = 3;
object[`j`] = 2.238;
```

### Implementation details

For each member in the class, the parser introduces the following structure, so that
```c++
public:
int i;
```
gets parsed into
```c++
public:
    template <size_t, bool> struct __ngc_member__;

private:
    int i;

public:
    template <bool dummy> struct __ngc_member__ <0, dummy>
    {
        typedef int type;
        typedef ngc :: string <'i'> name;

        static inline type & get(myclass & that)
        {
            return that.i;
        }

        static inline const type & get(const myclass & that)
        {
            return that.i;
        }
    };

public:
    inline __ngc_member__ <0, false> :: type & operator [] (__ngc_member__ <0, false> :: name)
    {
        return __ngc_member__ <0, false> :: get(*this);
    }

    inline const __ngc_member__ <0, false> :: type & operator [] (__ngc_member__ <0, false> :: name) const
    {
        return __ngc_member__ <0, false> :: get(*this);
    }
```
In particular, any class member is by default set to `private`, and a new public service class `__ngc_member__ <0, dummy>` is introduced. In this case the number `0` is an incremental index that grows with every member of the class. Notice that in spite of being public, this struct cannot be accessed by the user since its name starts with `__ngc` which will be recognized as forbidden code by the parser.

This class contains the definition of the member type and name, i.e.:
```c++
typedef int type;
typedef ngc :: string <'i'> name;
```
and a const and non-const getter.

Finally, two overloads (one is const and one is not) of the operator `[]` are added to the main class. These overloads have the same label `public:`, `private:` or `protected:` as the original user-declared member of the class. They allow the user to simply write:
```c++
my_class_object[`i`] = 3;
```
When referring to variable `i`.
