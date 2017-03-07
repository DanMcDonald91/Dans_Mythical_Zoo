package com.codeclan.com.javaproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/03/2017.
 */

public class TestBeast {

    Dragon dragon;
    Minotaur minotaur;
    Kraken kraken;

    @Before
    public void Before(){
        dragon = new Dragon("Big Rab", 600);
        minotaur = new Minotaur("Tam" , 200);
        kraken = new Kraken("Wully", 2000);

    }

    @Test
    public void testGetName() {
        assertEquals("Big Rab", dragon.getName());
    }

    @Test
    public void testSetName() {
        dragon.setName("Big Rab");
        assertEquals("Big Rab" , dragon.getName());
    }

    @Test
    public void testGetAge(){
        assertEquals(200, minotaur.getAge());
    }

    @Test
    public void testSetAge(){
        dragon.setAge(200);
        assertEquals(200, minotaur.getAge());
    }

    @Test
    public void testDragonFlys(){
        assertEquals("Standing up tall, beating wings, lift off!", dragon.fly());
    }

    @Test
    public void testBreathes(){
        assertEquals("The Beast breathes", dragon.breathe());
    }

    @Test
    public void testBellyContent(){
        assertEquals(0, dragon.foodCount());
    }


}
