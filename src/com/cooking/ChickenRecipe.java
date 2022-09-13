package com.cooking;

public class ChickenRecipe extends CookingRecipe{

    public void makeCuisine(){

        System.out.println("치킨 만들기 시작");
        cleanHands();       //부모 클래스 메서드 호출
        turnOnFryMachine();

        cleanHands();
        doughCoating();

        cleanHands();
        inputChicken();

        cleanHands();
        waiting();

        cleanHands();
        turnOffFryMachine();

        cleanHands();
        wrap();             //부모 클래스 메서드 호출
        System.out.println("치킨 완성~");
    }

    public void turnOnFryMachine(){
        System.out.println("튀김기를 켭니다(예열중)");
    }
    public void doughCoating(){
        System.out.println("치킨을 반죽에 코팅합니다");
    }
    public void inputChicken() {
        System.out.println("치킨을 튀김기에 넣습니다");
    }
    public void waiting(){
        System.out.println("튀겨질때까지 기다립니다");
    }
    public void turnOffFryMachine(){
        System.out.println("치킨을 꺼내고 튀김기를 끕니다");
    }

}
