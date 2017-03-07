package com.codeclan.com.javaproject;

import org.junit.Before;

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
        enclosure = new TheDarkDeep();
        minotaur = new Minotaur("Tam", 200);
        dragon = new Dragon("Big Rab", 600);
        kraken = new Kraken("Wully", 2000);
        donaldTrump = new DonaldTrump("Donald Trump",70);

    }
}
