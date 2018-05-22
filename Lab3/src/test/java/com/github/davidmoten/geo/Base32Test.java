package com.github.davidmoten.geo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Base32Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void encodePositiveBase32OnePar() throws Exception {
        String encode = Base32.encodeBase32(1);
        assertEquals("000000000001", encode);
    }
    @Test
    public void encodeZeroBase32OnePar() throws Exception {
        String encode = Base32.encodeBase32(0);
        assertEquals("000000000000", encode);
    }
    @Test
    public void encodeNegativeBase32OnePar() throws Exception {
        String encode = Base32.encodeBase32(-1);
        assertEquals("-000000000001", encode);
    }


    @Test(expected = IllegalArgumentException.class)
    public void getCharIndexNull() throws  Exception{
        char a = 'a';
        Base32.getCharIndex(a);
    }
    @Test
    public void getCharIndex() throws Exception{
        char c = 'c';
        assertEquals(11,Base32.getCharIndex(c));
    }


    //***
    @Test
    public void padLeftWithZerosToLength() throws Exception{
        String s = Base32.padLeftWithZerosToLength("kkk",12);
        assertEquals("000000000kkk",s);
    }
    @Test
    public void encodeBase32() throws Exception {
        String encode = Base32.encodeBase32(75324, 4);
        assertEquals("29jw", encode);
    }
    @Test
    public void decodeBase32() throws Exception{
        long decode = Base32.decodeBase32("29jw");
        assertEquals(75324, decode, 0.01);
    }

}
