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
    public void getRatio() throws  Exception{
        Set<String> set = new HashSet<String>();
        Coverage co = new Coverage(set,0.2);
        String ans = Double.toString(co.getRatio());
        assertEquals("0.2",ans);

    }
    @Test
    public void getHashLength() throws Exception{
        Set<String> set = new HashSet<String>();
        set.add("asd");
        set.add("sdsd");
        set.add("qweqwe");
        Coverage co = new Coverage(set,0.2);
        assertEquals(6,co.getHashLength());
    }
    @Test
    public void tostring() throws  Exception{
        Set<String> set = new HashSet<String>();
        set.add("asd");
        set.add("sdsd");
        set.add("qweqwe");
        Coverage co = new Coverage(set,0.2);
        assertEquals("Coverage [hashes=[qweqwe, asd, sdsd], ratio=0.2]",co.toString());
    }

}