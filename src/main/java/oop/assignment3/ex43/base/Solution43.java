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

    public static void main(String[] args) {
        String siteName = getInput(promptSite);
        String author = getInput(promptAuthor);
        String js = getInput(promptJS);
        String css = getInput(promptCSS);

        WebsiteGenerator wg = new WebsiteGenerator();
        String output = wg.createWebsite(siteName, author, js, css);

        in.close();

        System.out.println(output);
    }

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }
}
