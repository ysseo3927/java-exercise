package com.exercise;

public class IndexOf {

    public void indexOfSample(){

        String s1 = "dive into code universe!";
        System.out.println(s1.indexOf("t")); //7
        System.out.println(s1.indexOf("code"));//10
        System.out.println(s1.indexOf("z")); //-1
        System.out.println(s1.indexOf("i",2));//5
        System.out.println(s1.indexOf(101)); //3 e
        System.out.println(s1.indexOf(101,4)); //13

        System.out.println();
        String s2 = "no news is good news";

        System.out.println(s2.lastIndexOf("e")); //17
        System.out.println(s2.lastIndexOf("news"));//16
        System.out.println(s2.lastIndexOf("o",4));//1
        System.out.println(s2.lastIndexOf(101)); //17 e
        System.out.println(s2.lastIndexOf(101,3)); //-1

    }
}