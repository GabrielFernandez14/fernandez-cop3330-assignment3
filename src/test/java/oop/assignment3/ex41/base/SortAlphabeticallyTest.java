/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex41.base;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class SortAlphabeticallyTest {
    @Test
    void sortAlphabetical_return_an_alphabetically_sorted_arraylist_from_a_given_arraylist_set1() {
        SortAlphabetically sa = new SortAlphabetically();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual;

        names.add("Thomas, Jefferson");
        names.add("Steve, Jobs");
        names.add("Rachel, Adams");

        expected.add("Rachel, Adams");
        expected.add("Steve, Jobs");
        expected.add("Thomas, Jefferson");

        actual = sa.sortAlphabetical(names);

        assertEquals(expected, actual);
    }

    @Test
    void sortAlphabetical_return_an_alphabetically_sorted_arraylist_from_a_given_arraylist_set2() {
        SortAlphabetically sa = new SortAlphabetically();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual;

        names.add("Thomas, Jefferson");
        names.add("Thomas, Jefferson");
        names.add("Steve, Jobs");
        names.add("Barney, Dinosaur");
        names.add("abraham, Lincoln");
        names.add("Rachel, Adams");

        expected.add("abraham, Lincoln");
        expected.add("Barney, Dinosaur");
        expected.add("Rachel, Adams");
        expected.add("Steve, Jobs");
        expected.add("Thomas, Jefferson");
        expected.add("Thomas, Jefferson");

        actual = sa.sortAlphabetical(names);

        assertEquals(expected, actual);
    }

    @Test
    void sortAlphabetical_return_an_alphabetically_sorted_arraylist_from_a_given_arraylist_set3() {
        SortAlphabetically sa = new SortAlphabetically();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual;

        names.add("Thomas, Jefferson");
        names.add("Thomas, Jefferson");
        names.add("Steve, Jobs");
        names.add("Billy, A., Joseph");
        names.add("Barney, Dinosaur");
        names.add("abraham, Lincoln");
        names.add("Rachel, Adams");
        names.add("Ella, Fitzgerald");

        expected.add("abraham, Lincoln");
        expected.add("Barney, Dinosaur");
        expected.add("Billy, A., Joseph");
        expected.add("Ella, Fitzgerald");
        expected.add("Rachel, Adams");
        expected.add("Steve, Jobs");
        expected.add("Thomas, Jefferson");
        expected.add("Thomas, Jefferson");

        actual = sa.sortAlphabetical(names);

        assertEquals(expected, actual);
    }

    @Test
    void sortAlphabetical_return_an_alphabetically_sorted_arraylist_from_a_given_arraylist_set4() {
        SortAlphabetically sa = new SortAlphabetically();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual;

        names.add("Thomas, Jefferson");
        names.add("Thomas, Jefferson");
        names.add("Steve, Jobs");
        names.add("Billy, A., Joseph");
        names.add("johnny, silverhand");
        names.add("abe, lincoln");
        names.add("Barney, Dinosaur");
        names.add("abraham, Lincoln");
        names.add("Rachel, Adams");
        names.add("Ella, Fitzgerald");
        names.add("johnny, silverhand");

        expected.add("abe, lincoln");
        expected.add("abraham, Lincoln");
        expected.add("Barney, Dinosaur");
        expected.add("Billy, A., Joseph");
        expected.add("Ella, Fitzgerald");
        expected.add("johnny, silverhand");
        expected.add("johnny, silverhand");
        expected.add("Rachel, Adams");
        expected.add("Steve, Jobs");
        expected.add("Thomas, Jefferson");
        expected.add("Thomas, Jefferson");

        actual = sa.sortAlphabetical(names);

        assertEquals(expected, actual);
    }
}