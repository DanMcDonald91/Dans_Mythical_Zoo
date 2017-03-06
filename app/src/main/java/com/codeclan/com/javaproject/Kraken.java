package com.codeclan.com.javaproject;

/**
 * Created by user on 05/03/2017.
 */

public class Kraken extends Beast implements Swimmable {

    public Kraken(String name, int age) {
        super(name, age);
    }

    public String makeNoise() {
        return "Let me hug you";
    }

    public String swim() {
        return "It's tentacles slice through the water";

    }
}