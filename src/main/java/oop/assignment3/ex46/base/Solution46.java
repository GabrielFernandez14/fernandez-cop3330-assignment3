/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

// Spent too much time on exercise 44 and didn't have time for this one :(

package oop.assignment3.ex46.base;

import java.io.IOException;

public class Solution46 {
    // Main function
    public static void main(String[] args) throws IOException {
        String output;

        // Print output gained from Frequency Class
        FrequencyFinder ff = new FrequencyFinder();
        output = ff.getFreq();

        System.out.println(output);
    }
}
