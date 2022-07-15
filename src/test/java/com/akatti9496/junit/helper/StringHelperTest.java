package com.akatti9496.junit.helper;

import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;


class StringHelperTest {

    StringHelper stringHelper = new StringHelper();

    @org.junit.jupiter.api.Test
    void turncateAInFirst2PositionsTest() {
        assertAll("Truncate in the first should return the proper string",()->assertEquals("CD",stringHelper.turncateAInFirst2Positions("AACD")),
                ()->assertEquals("CD",stringHelper.turncateAInFirst2Positions("ACD")),
                ()->assertNotEquals("Hello",stringHelper.turncateAInFirst2Positions("ACD")),
                ()->assertEquals("CDEF",stringHelper.turncateAInFirst2Positions(("CDEF"))));

        // the first one is the expected and the second one is the received/actual value
    }

    @org.junit.jupiter.api.Test
    void areFaLTCTSTest() {
        assertEquals(stringHelper.areFaLTCTS("Ab"),true);

    }
}