package com.example;

import java.util.Random;

public class Example {

    public static void main(String[] args) {

        Random random = new Random();

        //정규분포로 난수 생성
        System.out.println(random.nextGaussian());

    }
}