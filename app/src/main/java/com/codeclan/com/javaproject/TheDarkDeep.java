package com.codeclan.com.javaproject;

import java.util.ArrayList;

/**
 * Created by user on 06/03/2017.
 */

public class TheDarkDeep extends Enclosure implements Swimmable {

    Kraken kraken;



    public TheDarkDeep(String name) {
        super(name);

    }

    @Override
    public void addBeast( Beast beast){
        if (beast instanceof Swimmable) {
            beasts.add(beast);
            System.out.println("The water is great!");
        }else{
            System.out.println("Swim at your own peril");
        }
    }



}
