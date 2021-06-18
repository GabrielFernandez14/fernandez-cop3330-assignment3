/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex41.base;

// Import required libraries
import org.jetbrains.annotations.NotNull;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution41 {
    public static int counter;

    // Main function
    public static void main(String[] args) {
        // Declare variables
        ArrayList<String> names;
        ArrayList<String> sortedNames;

        // Scan in strings from input file
        names = getNames();

        // Sort strings in alphabetical order
        SortAlphabetically sort = new SortAlphabetically();
        sortedNames = sort.sortAlphabetical(names);

        // Create output file
        if (createOutput()) {
            // Print correctly formatted sorted strings to output file
            printToOutput(sortedNames);
        }
    }

    @NotNull
    public static ArrayList<String> getNames() {
        ArrayList<String> names = new ArrayList<>();

        //      Use a try catch to make sure file exists
        try {
            File inputFile = new File("src/main/java/oop/assignment3/ex41/base/exercise41_input.txt");
            Scanner reader = new Scanner(inputFile);

            while (reader.hasNextLine()) {
                names.add(reader.nextLine());
                //      Use a counter to count the number of names as they're being scanned
                counter++;
            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return names;
    }

    public static boolean createOutput() {
        //      Use a try catch to make sure file was created
        try {
            File output = new File("exercise41_output.txt");

            if (output.createNewFile()) {
                return true;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void printToOutput (ArrayList<String> output) {
        //      Use a try catch to make sure file exists
        try {
            FileWriter writer = new FileWriter("exercise41_output.txt");
            writer.write("Total of " + counter + " names\n");
            writer.write("-----------------\n");

            for (int i = 0; i < counter; i++) {
                writer.write(output.get(i) + "\n");
            }

            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}