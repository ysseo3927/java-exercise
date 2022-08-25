package com.exercise;

import java.util.Arrays;
import java.util.Collections;

public class Array {

    public void example(){
        //1.배열의 선언
        int[] array = new int[5];
        //int array[] = new int[5];

        Double[] doubleArray = new Double[5];
        String[] stringArray = new String[3];

        int[] array5 = new int[5];
        array5[0] = 1;
        array5[1] = 2;
        array5[2] = 3;
        array5[3] = 4;
        array5[4] = 5;


        //2)배열 선언과 동시에 데이터 삽입
        int[] array6 = new int[]{1,2,3,4,5};
        int[] array7 = {1,2,3,4,5};

        //3.배열 데이터 조회
        //1)개별 요소 조회
        String[] beverageArray = {"Cola","Coffee","Tea","Water"};

        String beverage1 = beverageArray[1];
        String beverage2 = beverageArray[3];

        System.out.println(beverage1);
        System.out.println(beverage2);
        //결과
        /*
        Coffee
        Water
         */

        //2) 전체 요소 조회
        String[] colorArray = new String[]{"Red","Blue","Green"};
        for(int index=0; index < colorArray.length; index++){
            String color = colorArray[index];
            System.out.println(color);
        }
        //결과
        /*
        Red
        Blue
        Green
        */

        //3)전체 요소를 문자열로 조회
        String colorArrayString = Arrays.toString(colorArray);
        System.out.println(colorArrayString);
        //결과
        /*
        [Red, Blue, Green]
         */

        //4. 배열 복사
        //1) 배열 데이터 전체를 복사
        int[] array9 = new int[]{1,3,5,7,9};
        int[] array10 = array9;
        int[] array11 = array9.clone();
        System.out.println("array9.hashCode() : "+array9.hashCode());
        System.out.println("array10.hashCode() : "+array10.hashCode());
        System.out.println("array11.hashCode() : "+array11.hashCode());
        //결과
        /*
        array9.hashCode() : 284720968
        array10.hashCode() : 284720968
        array11.hashCode() : 122883338
         */

        //1) 배열 데이터 전체를 복사 또 다른 방법
        int[] array13 = Arrays.copyOf( array9, array9.length );
        System.out.println(Arrays.toString(array13));
        //결과
        /*
        [1, 3, 5, 7, 9]
        */
        int[] array55 = {1,4,2,5,3};
        Arrays.sort(array55);
        System.out.println(Arrays.toString(array55));
        //결과
        /*
        [1, 2, 3, 4, 5]
        */

        //2)내림차순 정렬 : Arrays.sort(Collections.reverseOrder()) 큰값부터 작은값 순으로 내림차순 정렬 시
        Integer[] array66 = {1,4,2,5,3};
        Arrays.sort(array66, Collections.reverseOrder());
        System.out.println(Arrays.toString(array66));
        /*
        [5, 4, 3, 2, 1]
         */

        String[] a = {"a","b","c","d","e"};
        String[] b = {"a","b","c","d","e"};

        if(a == b)
            System.out.println("a == b : same");

        if(a.equals(b))
            System.out.println("a.equals(b) : same");

        if(Arrays.deepEquals(a, b))
            System.out.println("Arrays.deepEquals(a, b) : same");
        /*
        결과 :
        Arrays.deepEquals(a, b) : same
         */

        int[] aa = new int[]{1,2,3,4,5};
        System.out.println(aa[5]);

        //결과
        /*
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        at com.example.Example.main(Example.java:127)
         */

    }
}
