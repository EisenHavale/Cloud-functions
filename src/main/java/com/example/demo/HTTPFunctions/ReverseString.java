package com.example.demo.HTTPFunctions;

import java.util.function.Function;

public class ReverseString implements Function<String, String>
{

    @Override
    public String apply(final String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
}
