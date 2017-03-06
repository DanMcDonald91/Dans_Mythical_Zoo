package com.codeclan.com.javaproject;

import org.junit.Before;
import org.junit.Test;

import static  org.junit.Assert.assertEquals;

/**
 * Created by user on 05/03/2017.
 */

public class TestZoo {

    Zoo zoo;
    Enclosure enclosure1;
    Enclosure enclosure2;


    @Before
    public void before() {
        zoo = new Zoo("Dans Mythical Zoo");
        enclosure1 = new Enclosure("Dragon Lair");
        enclosure2 = new Enclosure("The Dark Deep");

    }
}
