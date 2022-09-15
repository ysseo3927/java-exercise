package com.example;

class GenericExample {
    public <K extends Number, V extends  Number> int sum(K k, V v){
        int sumValue =  k.intValue() + v.intValue();
        return sumValue;
    }
}