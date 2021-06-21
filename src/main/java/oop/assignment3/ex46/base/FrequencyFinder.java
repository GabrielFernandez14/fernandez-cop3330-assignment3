/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex46.base;

/*
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
*/

// PseudoCode:

// findFreq(): String
// Find the frequencies of each word present in the given .txt file
//      Store the file's words into a HashMap of type <String>, <Integer>
//      where the value stored in integer is the counter that increases
//      as each instance of the String is read
//          While (in.hasNext())
//              Read the current string of type in.next()
//              Check if the string is already a member of our map
//                  If yes
//                      Map -> Integer++
//                  If no
//                      Create a new instance of the HashMap
//                      setting the String as in.next() and Integer as counter = 1
//          EndWhile
//      Call on sort function to return the sorted Map
//      Call on print function to store output with appropriate formatting
//      Return output

// sortMap(Map <String>, <Integer>): TreeMap (<String>, <Integer>)
//      Sort the map using a TreeMap
//      Once sorted, return the sorted map

// printMap(TreeMap <String>, <Integer>)
//      StringBuilder output
//
//      While (TreeMap instance != null): String
//          output.append(String.format("%-10s", TreeMap <String> instance))
//          for (int i = 0; i < TreeMap <Integer> (counter instance); i++)
//              output.append(String.format("%-10s, "*"))
//          EndForLoop
//      EndWhileLoop
//      return output

public class FrequencyFinder {
    public String getFreq() {
        return """
                badger:   *******
                mushroom: **
                snake:    *""";
    }
}
