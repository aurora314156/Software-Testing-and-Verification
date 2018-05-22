package com.github.davidmoten.geo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoverageLongsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void positiveRatio() throws Exception{
        long hashes[] = new long[10];
        hashes[0] = 15;
        int count = 10;
        double ratio = 3.0;
        CoverageLongs cl = new CoverageLongs(hashes,count,ratio);
        assertEquals(3.0,cl.getRatio(), 0.01);

    }
    @Test
    public void zeroRatio() throws Exception{
        long hashes[] = new long[10];
        hashes[0] = 15;
        int count = 10;
        double ratio = 0;
        CoverageLongs cl = new CoverageLongs(hashes,count,ratio);
        assertEquals(0.0,cl.getRatio(),0.01);
    }
    @Test
    public void negativeRatio() throws Exception{
        long hashes[] = new long[10];
        hashes[0] = 15;
        int count = 10;
        double ratio = -1.0;
        CoverageLongs cl = new CoverageLongs(hashes,count,ratio);
        assertEquals(-1.0,cl.getRatio(),0.01);
    }
    @Test
    public void getEqualHash() throws Exception{
        long hashes[] = new long[10];
        hashes[0] = 15;
        long hashes2[] = new long[10];
        hashes2[0] = 15;
        int count = 10;
        double ratio = -1.0;
        CoverageLongs cl = new CoverageLongs(hashes,count,ratio);
        assertArrayEquals(hashes2,cl.getHashes());
    }
    @Test
    public void getNotEqualHash() throws Exception{
        long hashes[] = new long[10];
        hashes[0] = 15;
        long hashes2[] = new long[10];
        hashes2[0] = 14;
        int count = 10;
        double ratio = -1.0;
        CoverageLongs cl = new CoverageLongs(hashes,count,ratio);
        assertNotEquals(hashes2,cl.getHashes());
    }

}