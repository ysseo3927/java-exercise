package com.cooking;

//추상 클래스
public abstract class PizzaRecipe extends CookingRecipe{

    public void makeCuisine(){
        System.out.println("피자 만들기 시작");
        cleanHands();   //부모 클래스의 메서드 호출
        bakeDough();

        cleanHands();
        addIngredent(); //추상 메서드 호출

        cleanHands();
        addCheese();

        cleanHands();
        wrap();         //부모 클래스의 메서드 호출
        System.out.println("피자 완성~");
    }


    public abstract void addIngredent();        //추상 메서드

    public void bakeDough(){
        System.out.println("도우를 굽습니다.");
    }

    public void addCheese(){
        System.out.println("치즈를 얹습니다.");
    }

}
