package com.exercise;

import java.security.SecureRandom;
import java.util.Random;

public class RandomAndSecureRandom {

    public void getRandom(){

        //Random 객체 생성
        Random random = new Random();   //seed값 지정을 생략할 경우
        //Random random = new Random(5); //seed값을 지정하여 생성할 경우

        random.setSeed(System.currentTimeMillis());

        System.out.println(random.nextInt());   //int형의 범위인 -2,147,483,648 ~ 2,147,483,647 사이의 난수 출력
        System.out.println(random.nextInt(10)); // 0~9까지의 난수 출력
        System.out.println(random.nextInt(10)+1); // 1~10까지의 난수 출력
        /*
        System.out.println(random.nextLong());
        System.out.println(random.nextFloat());
        System.out.println(random.nextDouble());
        System.out.println(random.nextBoolean());
        */

        for(int i=0; i<5; i++) {
            System.out.println(random.nextInt()); //1~5까지의 난수 생성
        }

        //특정 범위 난수 구하기(8 ~ 35까지)
        //System.out.println(random.nextInt(상한값-하한값)+하한값);
        System.out.println(random.nextInt(35-8)+8); //0~ 25 + 10 = 10 ~ 35

        //균등분포와 정규분포
        System.out.println(random.nextGaussian());

       /*
       random.nextLong() // 무작위 long 값
        random.nextFloat() //무작위 float 값
        random.nextDouble() //무작위 double 값
        random.nextBoolean() // 무작위 boolean 값
        random.nextGaussian() //무작위 정규 분포의 난수 값
        */

        SecureRandom secureRandom = new SecureRandom();

        secureRandom.setSeed(System.currentTimeMillis());
        secureRandom.nextBoolean();
    }
}
