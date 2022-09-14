package com.example;

public class Beverage { }
class Coffee extends Beverage{ }
class Tea extends Beverage{ }

class GenericExample<T>{
    private T t;

    public void setT(T t){
        this.t = t;
    }
    public T getT(){
        return t;
    }
}