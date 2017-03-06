package com.codeclan.com.javaproject;

import java.util.ArrayList;

/**
 * Created by user on 05/03/2017.
 */

public class Enclosure {

    private String name;
    private ArrayList<Animal> animals;

    public Enclosure(String name) {
        this.name =name;
        this.animals = new ArrayList<Animal>();
    }
}
