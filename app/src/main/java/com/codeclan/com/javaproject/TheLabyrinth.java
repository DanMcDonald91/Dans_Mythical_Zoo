package com.codeclan.com.javaproject;

import java.util.ArrayList;

/**
 * Created by user on 06/03/2017.
 */

public class TheLabyrinth extends Enclosure {

    public TheLabyrinth(String name) {
        super(name);
        this.beasts = new ArrayList<Beast>();
    }

    @Override
    public void addBeast(Beast beast) {
        if (beast instanceof Swimmable) {
            beasts.add(beast);
            System.out.println("The water is great!");
        }else{
            System.out.println("Swim at your own peril");
        }

    }

    }

