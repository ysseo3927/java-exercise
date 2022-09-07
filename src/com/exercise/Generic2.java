package com.exercise;

public class Generic2<T extends Member> {

    private T t;

    public T getT(){
        return t;
    }

    public void setT(T t){
        this.t = t;
    }

    public void getLog(){
        t.printLog();
    }
}
