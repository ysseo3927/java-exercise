package com.wildcard;


class A{}
class B extends A{}
class C extends B{}

class Item<E>{
    private E e;

    public void setT(E e){
        this.e = e;
    }

    public E getT(){
        return e;
    }
}

class BoundedGeneric{
    public void case1(Item<?> item){}
    public void case2(Item<? extends B> item){}
    public void case3(Item<? super B> item){}

    public <K,V> String method(K k, V v){
        String text = k + ":" + v;
        return text;
    }
}

public class Example {

    public static void main(String[] args){
        BoundedGeneric boundedGeneric = new BoundedGeneric();
        String text1 = boundedGeneric.<String,Double>method("온도",28.5);
        String text2 = boundedGeneric.method("온도",28.5);

        //Item<?> 모든 클래스 대입 가능
        boundedGeneric.case1(new Item<A>());
        boundedGeneric.case1(new Item<B>());
        boundedGeneric.case1(new Item<C>());

        //Item<? extends B> B클래스와 B의 자식 클래스만 대입 가능
        //boundedGeneric.case2(new Item<A>());
        boundedGeneric.case2(new Item<B>());
        boundedGeneric.case2(new Item<C>());

        //Item<? super B> B클래스와 B의 부모 클래스만 대입 가능
        boundedGeneric.case3(new Item<A>());
        boundedGeneric.case3(new Item<B>());
        //boundedGeneric.case3(new Item<C>());

    }
}