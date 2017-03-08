package com.codeclan.com.javaproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/03/2017.
 */

public class TestMinotaur {

    Minotaur minotaur;

    @Before
    public void before(){
        minotaur = new Minotaur("Tam", 200);
    }

    @Test
    public void testMakeNoise() {
        assertEquals("BLARGH, FOOLISH HUMAN", minotaur.makeNoise());
    }

}
