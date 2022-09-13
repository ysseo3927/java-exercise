package com.example;

import com.cooking.ChickenRecipe;
import com.cooking.CookingRecipe;
import com.cooking.PepperoniPizzaRecipe;
import com.cooking.PineapplePizzaRecipe;

import java.io.IOException;

public class Example {

    public static void main(String[] args) throws IOException {

        CookingRecipe chicken = new ChickenRecipe();
        chicken.makeCuisine();
        System.out.println("-----------------");

        CookingRecipe PepperoniPizza = new PepperoniPizzaRecipe();
        PepperoniPizza.makeCuisine();

        System.out.println("-----------------");
        CookingRecipe pineapplePizze = new PineapplePizzaRecipe();
        pineapplePizze.makeCuisine();
    }

}