package com.codeclan.com.javaproject;

import java.util.ArrayList;

/**
 * Created by user on 05/03/2017.
 */

public class Dragon extends Beast implements Flyable{

    public Dragon(String name, int age) {

        super(name, age);
    }


    public String makeNoise(){
        return "ROAR, WHO DISTURBS MY SLUMBER";
    }

    public String fly() {
        return "Standing up tall, beating wings, lift off!";

    }

    public String breathe(){
        return "The Beast breathes";
    }

    public int foodCount(){
        return belly.size();
    }

    @Override
    public void eat(Edible food){
        if (food instanceof Steak || food instanceof Chicken) {
            belly.add(food);
            System.out.println("Ah tasty!");
        }else{
            System.out.println("What is this garbage?");
        }

}







}
