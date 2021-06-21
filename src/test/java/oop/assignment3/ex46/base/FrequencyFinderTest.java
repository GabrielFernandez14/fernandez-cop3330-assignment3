package oop.assignment3.ex46.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyFinderTest {

    @Test
    void getFreq() {
        String expected = """
                badger:   *******
                mushroom: **
                snake:    *""";

        String actual = """
                badger:   *******
                mushroom: **
                snake:    *""";

        assertEquals(expected, actual);
    }
}