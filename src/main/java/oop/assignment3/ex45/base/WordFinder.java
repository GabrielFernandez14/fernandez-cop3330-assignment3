/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex45.base;

import java.util.Scanner;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordFinder {
    public final String pathName =
            "src/main/java/oop/assignment3/ex45/base/exercise45_input.txt";
    public File outputName;

    public void getFile() throws Exception {
        //      Use a try catch to ensure the file exists
        try {
            Path path = Paths.get(pathName);
            Charset charset = StandardCharsets.UTF_8;

            //          Read the contents of the file and replace
            //          All instances of "utilize" with "use"
            String content = Files.readString(path, charset);
            content = content.replaceAll("utilize", "use");
            Files.writeString(path, content, charset);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //      Now that input has been successfully modified...
        if (!createOutput().equals("An error occurred.")) {
            File updatedFile = new File(pathName);
            printToOutput(updatedFile, outputName);
        }
    }

    //          Create the output file
    public String createOutput() {
        //              Use a try catch to make sure file was created
        try {
            //              Prompt the user for the name
            System.out.println("What is the output file's name?:");
            Scanner in = new Scanner(System.in);

            String outputFile = in.next();

            File output = new File(outputFile + ".txt");
            outputName = output;


            if (output.createNewFile()) {
                return outputFile;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return "An error occurred.";
    }

    //          Copy the modified input file into the output file
    public void printToOutput(File updatedFile, File output) throws Exception {
        try (FileInputStream fin = new FileInputStream(updatedFile);
             FileOutputStream fout = new FileOutputStream(output)) {
            int n;

            while ((n = fin.read()) != -1) {
                fout.write(n);
            }
        }
    }
}
