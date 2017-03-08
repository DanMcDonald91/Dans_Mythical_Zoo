package com.codeclan.com.javaproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/03/2017.
 */

public class TestEnclosure {

    Enclosure enclosure;

    Dragon dragon;
    Minotaur minotaur;
    Kraken kraken;
    DonaldTrump donaldTrump;

    @Before
    public void before(){
        enclosure = new TheDarkDeep("The Dark Deep");
        minotaur = new Minotaur("Tam", 200);
        dragon = new Dragon("Big Rab", 600);
        kraken = new Kraken("Wully", 2000);
        donaldTrump = new DonaldTrump("Donald Trump",70);

    }

    @Test
    public void testGetName(){
        assertEquals("The Dark Deep", enclosure.getName());
    }

    @Test
    public void testNumberOfBeasts(){
        enclosure.addBeast(kraken);
        assertEquals(1, enclosure.getNumberOfBeasts());
    }

    @Test
    public void testRemoveBeast(){
        enclosure.addBeast(kraken);
        enclosure.removeBeast(kraken);
        assertEquals(0, enclosure);


    }
}

