/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex42.base;

public class Solution42 {
    // Main function
    public static void main(String[] args) {
        String output;

        // Print initial table lines
        printInitial();

        // Parse through the data while ignoring ","
        ParseData parse = new ParseData();
        output = parse.getTable();

        // Print correctly formatted table
        System.out.println(output);
    }

    public static void printInitial() {
        System.out.printf("%s %10s %10s\n", "Last", "First", "Salary");
        System.out.println("--------------------------");
    }
}
