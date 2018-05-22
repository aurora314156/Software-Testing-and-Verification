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
    public void getLat() throws  Exception{

        LatLong ll = new LatLong(1.0,2.0);
        assertEquals("1.0",Double.toString(ll.getLat()));
    }
    @Test
    public void getLon() throws  Exception{

        LatLong ll = new LatLong(1.0,2.0);
        assertEquals("2.0",Double.toString(ll.getLon()));
    }
    @Test
    public void add() throws Exception{

        LatLong ll = new LatLong(1.0,2.0);
        LatLong newll = ll.add(1.0,2.0);
        assertEquals("LatLong [lat=2.0, lon=4.0]",newll.toString());
    }
    @Test
    public void tostring() throws Exception{

        LatLong ll = new LatLong(1.0,2.0);
        assertEquals("LatLong [lat=1.0, lon=2.0]",ll.toString());
    }
}