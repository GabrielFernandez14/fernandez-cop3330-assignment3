/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex43.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {
    // Please run these test cases individually,
    // since a new file is being created each time.
    // Also, for the final test case, it will not work
    // if the test cases are run as a class, they must
    // be ran individually, with the first "given" case
    // being ran before the if file already exists case
    @Test
    void createWebsite_create_files_for_when_js_is_not_selected() {
        WebsiteGenerator wg = new WebsiteGenerator();

        String actual = wg.createWebsite("ripjs", "Big Sad", "n", "y");

        assertEquals("""
                Created ./website/ripjs
                Created ./website/ripjs/index.html
                Created ./website/ripjs/css/
                """, actual);
    }

    @Test
    void createWebsite_create_files_for_when_css_is_not_selected() {
        WebsiteGenerator wg = new WebsiteGenerator();

        String actual = wg.createWebsite("ripcss", "Big Sad", "y", "n");

        assertEquals("""
                Created ./website/ripcss
                Created ./website/ripcss/index.html
                Created ./website/ripcss/js/
                """, actual);
    }

    @Test
    void createWebsite_create_files_for_when_neither_js_or_css_is_selected() {
        WebsiteGenerator wg = new WebsiteGenerator();

        String actual = wg.createWebsite("rip", "Naughty boy", "n", "n");

        assertEquals("""
                Created ./website/rip
                Created ./website/rip/index.html
                """, actual);

    }

    // Please run this first
    @Test
    void createWebsite_create_files_for_the_given_test_case() {
        WebsiteGenerator wg = new WebsiteGenerator();

        String actual = wg.createWebsite("awesomeco", "Max Power", "y", "y");

        assertEquals("""
                Created ./website/awesomeco
                Created ./website/awesomeco/index.html
                Created ./website/awesomeco/js/
                Created ./website/awesomeco/css/
                """, actual);
    }

    // Then run this one
    @Test
    void createWebsite_create_files_for_when_file_already_exists() {
        WebsiteGenerator wg = new WebsiteGenerator();

        String actual = wg.createWebsite("awesomeco", "Ruh Roh Raggy", "n", "n");

        assertEquals("""
                An error occurred.""", actual);
    }
}