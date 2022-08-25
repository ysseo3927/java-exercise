package com.exercise;

public class Substring {


    public void substring(){
        String s1 = "hello java world";
        System.out.println(s1.substring(6));    //1번 결과 : java world
        System.out.println(s1.substring(6,10)); //2번 결과 : java
        System.out.println(s1.substring(s1.indexOf("w")));  //3번 결과 : world
        System.out.println(s1.substring(s1.indexOf("j"),s1.lastIndexOf(" "))); //4번 결과 : java
        /*
        1번 : 인덱스 6의 위치인 'j'부터 끝까지 전체 문자열인 "java world"가 반환되었습니다.
        2번 : 인덱스 6의 위치인 'j'부터 인덱스 10의 위치인 ' ' 전까지의 문자열인 "java"가 반환되었습니다.
        이와 같이 두번째 인자인 endIndex는 결과에서 포함되지 않고 endIndex - 1까지의 문자열이 반환된다는 것도 기억해두면 좋을 것 같습니다.
        3번 : indexOf()메서드를 이용해서 'w'가 포함된 위치인 11부터 끝가지 전체 문자열인 "world"가 반환되었습니다.
        4번 : indexOf(), lastIndexOf()메서드를 이용해서 'j'가 포함된 위치인 6부터 ' '가 포함된 위치를 뒤에서 부터 반환한 10까지의 문자열 "java"가 반환됩니다.
         */

        String s2 = "2022-08-22";
        String[] array = s2.split("-");
        for(String element : array){
            System.out.println(element);
        }

        /*
        결과 :
        2022
        08
        22
         */

    /*
    날짜 형식의 문자열을 split() 메서드를 사용해서
    구분자 '-'로 분리하는 예제입니다. 결과와 같이 년,월,일 3개로 나누어 배열에 담겨짐을 알 수 있습니다.
    * */
        String s4 = "Apple,Banana,Melon,Grapes,Orange ";
        String[] array3 = s4.split(",",4);
        for(String element : array3){
            System.out.println(element);    //2022 08 22
        }

        /*
        기존과 같이 구분자로 분리는 하되 그 갯수를 조절하고 싶을 때는 두 번째 인자로 구분할 총 갯수를 넣어주면 됩니다.
        이번에는 ','를 구분자로 해서 Apple, Banana, Melon까지는 잘 분리되었지만 인자로 넣어준 것과 같이 총 갯수 4개를 넘지 않기 위해
        Grapes, Orange는 분리되지 않고 배열에 담겨졌음을 확인 할 수 있습니다.
        * */

        /*
        결과 :
        Apple
        Banana
        Melon
        Grapes,Orange
         */

    }


}
