package com.github.davidmoten.geo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LatLongTest {

    @Before
    public void setUp() throws Exception {

    }
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void positiveAdd() throws Exception{
        LatLong ll = new LatLong(2.0,3.0);
        LatLong llAdd = ll.add(1.0,1.0);
        assertEquals("LatLong [lat=3.0, lon=4.0]",llAdd.toString());
    }
    @Test
    public void zeroAdd() throws Exception{
        LatLong ll = new LatLong(0,0);
        LatLong llAdd = ll.add(0,0);
        assertEquals("LatLong [lat=0.0, lon=0.0]",llAdd.toString());
    }
    @Test
    public void negativeAdd() throws Exception{
        LatLong ll = new LatLong(2.0,3.0);
        LatLong llAdd = ll.add(-3.0,-5.0);
        assertEquals("LatLong [lat=-1.0, lon=-2.0]",llAdd.toString());
    }

}