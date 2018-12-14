package com.example.mathlib;

public class MyMath {

    public static int add(int x, int y){
        return x+y;
    }

    public static int substitute(int x, int y){
        return x-y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static float divide(int x, int y){
        if (y ==0){
            throw new IllegalArgumentException("divide by zero not allowed.!");
        }
        else {
            return x / y;
        }
    }
}