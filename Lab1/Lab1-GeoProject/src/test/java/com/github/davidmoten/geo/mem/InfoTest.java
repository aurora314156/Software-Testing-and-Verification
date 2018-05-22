package com.github.davidmoten.geo.mem;

import com.google.common.base.Optional;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InfoTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void createInfoWithToString() throws  Exception{
        int i = 10;
        long k = i;
        Info info = new Info(0.2,0.3,k,10, Optional.of(10));
        assertEquals("Info [lat=0.2, lon=0.3, time=10, value=10, id=Optional.of(10)]",info.toString());
    }
}