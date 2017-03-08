package com.codeclan.com.javaproject;

import java.util.ArrayList;

import static android.R.attr.name;

/**
 * Created by user on 05/03/2017.
 */

public abstract class Enclosure {

     String name;
     ArrayList<Beast> beasts;



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

    public void removeBeast(Beast beasts){
        this.beasts.remove(beasts);
    }


    }



