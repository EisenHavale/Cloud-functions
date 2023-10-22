package com.example.demo.HTTPFunctions;

import java.util.function.Function;

public class Greeter implements Function<String, String>
{

    @Override
    public String apply(final String s)
    {
        return "Hello "+s+" and welcome to my party";
    }
}
