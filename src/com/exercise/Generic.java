package com.exercise;

public class Generic {

    public <T> T method1(T t){
        Member s = t instanceof Member ? ((Member) t) : null;
        s.printLog();

        return t;
    }
}
