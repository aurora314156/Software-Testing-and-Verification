package com.github.davidmoten.geo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeoHashTest {


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void adjacentHash() throws Exception{
        String hashes = "hello world";
        Direction di = Direction.BOTTOM;
        String s = GeoHash.adjacentHash(hashes,di);
        assertEquals("hello worl6",s);
    }
    @Test
    public void encodeHash() throws Exception{

        assertEquals("s0591u2vh6wn",GeoHash.encodeHash(0.2,5));
    }
    @Test
    public void decodeHash() throws Exception{
        String s = "hello world";
        LatLong ll = GeoHash.decodeHash(s);
        assertEquals("-67.50146113336086",Double.toString(ll.getLat()));
        assertEquals("33.748619332909584",Double.toString(ll.getLon()));
    }
}