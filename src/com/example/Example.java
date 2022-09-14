package com.example;

import java.io.IOException;

public class Example {

    public static void main(String[] args) throws IOException {
        //Example<확정 타입> a = new Example<확정 타입>();
        GenericExample<String> b = new GenericExample<String>();
        b.setT("Hello Generic");
        String t1 = b.getT();
        System.out.println(t1);

        GenericExample c = new GenericExample(); //Example<Object> c = new Example<Object>();와 동일한 표현
        c.setT("Hello Generic");
        String t2 = (String)c.getT();
        System.out.println(t2);

    }

}