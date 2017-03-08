package com.codeclan.com.javaproject;

/**
 * Created by user on 06/03/2017.
 */

public class DonaldTrump extends Beast implements Edible {
    public DonaldTrump(String name, int age) {

        super(name, age);
    }


    public String makeNoise() {
        return " We're going to make Dans Zoo great again";

    }
}
