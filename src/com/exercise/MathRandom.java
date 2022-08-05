package com.exercise;

public class MathRandom {

    public void random(){

        double randomValue = Math.random();

        //0 ~ 0.99999999 즉, 0 <= X < 1
        System.out.println("Math.random() : " + randomValue);

        //0 ~ 9.999999999 즉, 0 <= X < 10;
        randomValue = Math.random() * 10;
        System.out.println("Math.random() * 10 : " + randomValue);

        //0 ~ 9
        int randomIntValue = (int)(Math.random() * 10);
        System.out.println("(int)(Math.random() * 10) : " + randomIntValue);

        //1 ~ 10
        randomIntValue = (int)(Math.random() * 10) + 1;
        System.out.println("(int)(Math.random() * 10) + 1 : " + randomIntValue);

        //randomIntValue = (INT)(Math.random() * (상한값 - 하한값 + 1)) + 상한값;

        int min = 5;
        int max= 15;
        randomIntValue = (int)(Math.random() * (15 - 5 + 1)) + 5;  // 5 ~ 15
        System.out.println(randomIntValue);


        double actualRandomValue = (double)Math.round(((Math.random() *( 150 - 50 + 1)) + 50) * 100) / 100.0;
        System.out.println(actualRandomValue);


    }

}
