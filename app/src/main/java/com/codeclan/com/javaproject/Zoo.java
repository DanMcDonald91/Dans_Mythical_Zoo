package com.codeclan.com.javaproject;

import java.util.ArrayList;

/**
 * Created by user on 05/03/2017.
 */

public class Zoo {

    public String name;
    private ArrayList<Enclosure> enclosures;

    public Zoo(String name){
        this.name = name;
        this.enclosures = new ArrayList<Enclosure>();
    }

    public void addEnclosure(Enclosure enclosure){
        this.enclosures.add(enclosure);

    }

    public int getNumberOfEnclosures() {
        return enclosures.size();
    }
}
