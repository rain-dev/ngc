class myclass
{
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

protected:

    inline __ngc_member__ <0, false> :: type & operator [] (__ngc_member__ <0, false> :: name)
    {
        return __ngc_member__ <0, false> :: get(*this);
    }

    inline const __ngc_member__ <0, false> :: type & operator [] (__ngc_member__ <0, false> :: name) const
    {
        return __ngc_member__ <0, false> :: get(*this);
    }

private:

    double j;

public:

    template <bool dummy> struct __ngc_member__ <1, dummy>
    {
        typedef double type;
        typedef ngc :: string <'j'> name;

        static inline type & get(myclass & that)
        {
            return that.j;
        }

        static inline const type & get(const myclass & that)
        {
            return that.j;
        }
    };

private:

    inline __ngc_member__ <1, false> :: type & operator [] (__ngc_member__ <1, false> :: name)
    {
        return __ngc_member__ <1, false> :: get(*this);
    }

    inline const __ngc_member__ <1, false> :: type & operator [] (__ngc_member__ <1, false> :: name) const
    {
        return __ngc_member__ <1, false> :: get(*this);
    }

private:

    char k;

public:

    template <bool dummy> struct __ngc_member__ <2, dummy>
    {
        typedef char type;
        typedef ngc :: string <'k'> name;

        static inline type & get(myclass & that)
        {
            return that.k;
        }

        static inline const type & get(const myclass & that)
        {
            return that.k;
        }
    };

public:

    inline __ngc_member__ <2, false> :: type & operator [] (__ngc_member__ <2, false> :: name)
    {
        return __ngc_member__ <2, false> :: get(*this);
    }

    inline const __ngc_member__ <2, false> :: type & operator [] (__ngc_member__ <2, false> :: name) const
    {
        return __ngc_member__ <2, false> :: get(*this);
    }
};
