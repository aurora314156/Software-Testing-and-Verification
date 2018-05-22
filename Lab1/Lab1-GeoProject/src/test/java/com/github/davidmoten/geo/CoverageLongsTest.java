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
    public void getHashes() throws Exception{
        long hashes[] = new long[10];
        hashes[0] = 15;
        int count = 10;
        double ratio = 3.0;
        CoverageLongs cl = new CoverageLongs(hashes,count,ratio);
        assertEquals(15,cl.getHashLength());

    }
    @Test
    public void getRatio() throws Exception{
        long hashes[] = new long[10];
        hashes[0] = 15;
        int count = 10;
        double ratio = 3.0;
        CoverageLongs cl = new CoverageLongs(hashes,count,ratio);
        assertEquals("3.0",Double.toString(cl.getRatio()));

    }
    @Test
    public void getCount() throws Exception{
        long hashes[] = new long[10];
        int count = 10;
        double ratio = 3.0;
        CoverageLongs cl = new CoverageLongs(hashes,count,ratio);
        assertEquals(10,cl.getCount());

    }
}