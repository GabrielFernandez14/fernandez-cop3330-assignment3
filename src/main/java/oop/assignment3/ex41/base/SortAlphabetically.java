/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex41.base;

import java.util.ArrayList;

public class SortAlphabetically {
    public ArrayList<String> sortAlphabetical(ArrayList<String> names) {
        names.sort(String.CASE_INSENSITIVE_ORDER);

        return names;
    }
}
