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
    public void adjacentHashThreePar()throws Exception{
        String s = "aaa";
        int step = 10;
        Direction direction = Direction.TOP;
        assertEquals("zzz",GeoHash.adjacentHash(s,direction,step));
    }
    @Test
    public void adjacentHashThreePar1()throws Exception{
        String s = "aaa";
        int step = 0;
        Direction direction = Direction.TOP;
        assertEquals("aaa",GeoHash.adjacentHash(s,direction,step));
    }
    @Test
    public void positiveEncodeHash ()throws Exception{
        assertEquals("s065k",GeoHash.encodeHash(2,3,5));
    }
    @Test
    public void zeroEncodeHash ()throws Exception{
        assertEquals("s0000",GeoHash.encodeHash(0, 0,5));
    }
    @Test
    public void negativeEncodeHash ()throws Exception{
        assertEquals("7ztue",GeoHash.encodeHash(-2,-3,5));
    }
    @Test
    public void positiveEncodeHashOnePar ()throws Exception{
        LatLong ll = new LatLong(2,3);
        assertEquals("s065kk0dc540",GeoHash.encodeHash(ll));
    }
    @Test
    public void ZeroEncodeHashOnePar ()throws Exception{
        LatLong ll = new LatLong(0,0);
        assertEquals("s00000000000",GeoHash.encodeHash(ll));
    }
    @Test
    public void negativeEncodeHashOnePar ()throws Exception{
        LatLong ll = new LatLong(-2,-3);
        assertEquals("7ztueezmnuvz",GeoHash.encodeHash(ll));
    }
    @Test
    public void fromLongToString() throws Exception{
        long hash = 2;
        assertEquals("00",GeoHash.fromLongToString(hash));
    }
    @Test(expected = IllegalArgumentException.class)
    public void fromLongToStringErr() throws Exception{
        long hash = 0;
        GeoHash.fromLongToString(hash);
    }

    @Test
    public void right() throws Exception{
        String s = "rrrr";
        assertEquals("rrrx",GeoHash.right(s));
    }
    @Test
    public void top() throws Exception{
        String s = "qqqq";
        assertEquals("qqqr",GeoHash.top(s));
    }

}