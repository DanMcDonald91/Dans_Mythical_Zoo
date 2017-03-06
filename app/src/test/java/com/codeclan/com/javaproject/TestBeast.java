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
//        minotaur = new Minotaur("Tam" , 200);
//        kraken = new Kraken("Wully", 2000);
    }

    @Test
    public void testGeDragontName() {
        assertEquals("Big Rab", dragon.getName());
    }

    @Test
    public void testSetDragonName() {
        dragon.setName("Big Rab");
        assertEquals("Big Rab" , dragon.getName());
    }

    @Test
    public void testGetDragonAge(){
        assertEquals(600, dragon.getAge());
    }

    @Test
    public void testSetDragonAge(){
        dragon.setAge(700);
        assertEquals(700, dragon.getAge());
    }
}
