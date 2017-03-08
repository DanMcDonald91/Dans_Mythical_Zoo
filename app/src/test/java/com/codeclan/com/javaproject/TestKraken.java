package com.codeclan.com.javaproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/03/2017.
 */

public class TestKraken {


    Kraken kraken;

    @Before
    public void before() {
        kraken = new Kraken("Wully", 2000);
    }

    @Test
    public void testMakeNoise() {
        assertEquals("Let me hug you", kraken.makeNoise());
    }

    @Test
    public void swim() {
        assertEquals("It's tentacles slice through the water", kraken.swim());

    }

    @Test
    public void testBellyContent() {
        assertEquals(0, kraken.foodCount());
    }

    @Test
    public void testCanEatChicken(){

        Chicken chicken = new Chicken();
        kraken.eat(chicken);
        assertEquals(1, kraken.foodCount());
    }
}