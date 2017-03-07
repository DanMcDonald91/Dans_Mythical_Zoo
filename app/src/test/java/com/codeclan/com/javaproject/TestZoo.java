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
    Enclosure enclosure4;


    @Before
    public void before() {
        zoo = new Zoo("Dans Mythical Zoo");
//        enclosure1 = new TheLair();
//        enclosure2 = new TheDarkDeep();
//        enclosure3 = new TheLabyrinth();
//        enclosure4 = new TheWhiteHouse();

    }

    @Test
    public void  testAddEnclosure() {
        zoo.addEnclosure(enclosure1);
        assertEquals(1, zoo.getNumberOfEnclosures());

    }

    @Test
    public void testNumberOfEnclosures() {
        zoo.addEnclosure(enclosure1);
        zoo.addEnclosure(enclosure2);
        zoo.addEnclosure(enclosure3);
        zoo.addEnclosure(enclosure4);
        assertEquals(4, zoo.getNumberOfEnclosures());
    }
}
