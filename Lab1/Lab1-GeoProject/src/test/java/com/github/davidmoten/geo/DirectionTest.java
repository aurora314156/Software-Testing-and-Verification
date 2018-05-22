package com.github.davidmoten.geo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void create()throws  Exception{
        Direction di = Direction.BOTTOM;
        assertEquals(1,di.opposite().ordinal());
    }
}