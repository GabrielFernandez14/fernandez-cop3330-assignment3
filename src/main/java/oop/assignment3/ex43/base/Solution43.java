/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex43.base;

import java.util.Scanner;

public class Solution43 {
    public static final String promptSite = "Site name: ";
    public static final String promptAuthor = "Author: ";
    public static final String promptJS = "Do you want a folder for JavaScript? ";
    public static final String promptCSS = "Do you want a folder for CSS? ";
    public static final Scanner in = new Scanner(System.in);

    // Main function
    public static void main(String[] args) {
        // Get input from the user
        String siteName = getInput(promptSite);
        String author = getInput(promptAuthor);
        String js = getInput(promptJS);
        String css = getInput(promptCSS);

        // Generate the required files
        WebsiteGenerator wg = new WebsiteGenerator();
        String output = wg.createWebsite(siteName, author, js, css);

        // Print the appropriate output
        System.out.println(output);
    }

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }
}
