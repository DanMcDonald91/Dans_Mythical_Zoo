package com.codeclan.com.javaproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 05/03/2017.
 */

public class TestDragon {

    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("Big Rab", 600);
    }

    @Test
    public void testMakeNoise() {
        assertEquals("ROAR, WHO DISTURBS MY SLUMBER", dragon.makeNoise());
    }

    @Test
    public void testFly() {
        assertEquals("Standing up tall, beating wings, lift off!", dragon.fly());
    }

    @Test
    public void testDragonBreathes(){
        assertEquals("The Beast breathes", dragon.breathe());
    }

    @Test
    public void testBellyContent(){
        assertEquals(0, dragon.foodCount());
    }

    @Test
    public void testCanEatSteak(){
        Steak steak = new Steak();
        dragon.eat(steak);
        assertEquals(1, dragon.foodCount());
    }



}

