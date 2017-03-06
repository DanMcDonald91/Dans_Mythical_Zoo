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
    Enclosure enclosure3;


    @Before
    public void before() {
        zoo = new Zoo("Dans Mythical Zoo");
        enclosure1 = new Enclosure("The Lair");
        enclosure2 = new Enclosure("The Dark Deep");
        enclosure3 = new Enclosure("The Labyrinth");

    }

    @Test
    public void  testAddEnclosure() {
        zoo.addEnclosure(enclosure1);
        assertEquals(1, zoo.getNumberOfEnclosures());

    }

    @Test
    public void testEnclosures() {
        zoo.addEnclosure(enclosure1);
        zoo.addEnclosure(enclosure2);
        zoo.addEnclosure(enclosure3);
        assertEquals(3, zoo.getNumberOfEnclosures());
    }
}
