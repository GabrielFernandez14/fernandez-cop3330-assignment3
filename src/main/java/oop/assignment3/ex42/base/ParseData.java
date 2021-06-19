/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex42.base;

import java.io.*;

public class ParseData {
    // Get table function
    public String getTable() {
        // Initialize variables
        StringBuilder output = new StringBuilder();

        // Try catch statement to check if the file exists
        try {
            //      Find file and store inside a variable
            BufferedReader in = new BufferedReader
                    (new FileReader("src/main/java/oop/assignment3/ex42/base/exercise42_input.txt"));

            String curData;

            //      Loop through each string and format appropriately
            while ((curData = in.readLine()) != null) {
                String [] arrSplit = curData.split(",");

                for (String s : arrSplit) {
                    output.append(String.format("%-10s", s));
                }

                output.append("\n");
            }

            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Return output statement
        return output.toString();
    }
}
