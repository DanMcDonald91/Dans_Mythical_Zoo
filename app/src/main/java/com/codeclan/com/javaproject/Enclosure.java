package com.codeclan.com.javaproject;

import java.util.ArrayList;

/**
 * Created by user on 05/03/2017.
 */

public class Enclosure {

    private String name;
    private ArrayList<Beast> beasts;

    public Enclosure(String name) {
        this.name =name;
        this.beasts = new ArrayList<Beast>();
    }

    public String getName() {
        return name;
    }

    public void addBeast(Beast beasts) {
        this.beasts.add(beasts);
    }

    public int getNumberOfBeasts(){
        return beasts.size();
    }


}
