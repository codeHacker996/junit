package com.akatti9496.junit.helper;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    @org.junit.jupiter.api.Test
    void turncateAInFirst2Positions() {
        StringHelper stringHelper = new StringHelper();
        assertAll(()->assertEquals("CD",stringHelper.turncateAInFirst2Positions("AACD")),
                ()->assertEquals("CD",stringHelper.turncateAInFirst2Positions("ACD")));

        // the first one is the expected and the second one is the received/actual value
    }

    @org.junit.jupiter.api.Test
    void areFaLTCTS() {
    }
}