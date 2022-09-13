package com.cooking;

public abstract class CookingRecipe {

    public abstract void makeCuisine(); //추상 메서드

    public void cleanHands(){
        System.out.println("손을 씻습니다");
    }
    public void wrap(){
        System.out.println("제품을 포장합니다.");
    }
}
