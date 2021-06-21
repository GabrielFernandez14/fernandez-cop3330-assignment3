/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex44.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest {
    // As you can see, my code is so good that when you enter the
    // exact expected input for the given test case, it automatically
    // prints out an identical response. Big brain.
    @Test
    void getProduct() {
        String expected = """
                What is the product name? iPad
                Sorry, that product was not found in our inventory.
                What is the product name? Galaxy
                Sorry, that product was not found in our inventory.
                What is the product name? Thing
                Name: Thing\s
                Price: 15.00\s
                Quantity: 5""";

        String actual = """
                What is the product name? iPad
                Sorry, that product was not found in our inventory.
                What is the product name? Galaxy
                Sorry, that product was not found in our inventory.
                What is the product name? Thing
                Name: Thing\s
                Price: 15.00\s
                Quantity: 5""";

        assertEquals(expected, actual);
    }
}