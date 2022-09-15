package com.example;

import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        GenericExample a = new GenericExample();
        int sumValue = a.<Number, Number>sum(10,5.0);
        System.out.println(sumValue);
    }
}