package com.github.davidmoten.geo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class CoverageTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void positiveRatio () throws  Exception{
        Set<String> set = new HashSet<String>();
        Coverage co = new Coverage(set,0.2);
        assertEquals(0.2,co.getRatio(),0.01);
    }
    @Test
    public void zeroRatio () throws  Exception{
        Set<String> set = new HashSet<String>();
        Coverage co = new Coverage(set,0);
        assertEquals(0.0,co.getRatio(),0.01);
    }
    @Test
    public void negativeRatio () throws  Exception{
        Set<String> set = new HashSet<String>();
        Coverage co = new Coverage(set,-0.2);
        assertEquals(-0.2,co.getRatio(),0.01);
    }



}