package oop.assignment3.ex41.base;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

//www.java67.com/2016/07/how-to-read-text-file-into-arraylist-in-java.html#ixzz6y3TtGOsX

public class Solution41 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        try {
            File input = new File("exercise41_input.txt");
            Scanner reader = new Scanner(input);

            while (reader.hasNextLine()) {
                names.add(reader.nextLine());
            }

            reader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Sort the names in the ArrayList


    // Print out the sorted names with proper formatting
}