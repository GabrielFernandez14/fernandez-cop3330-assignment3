/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex45.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {
    public final String pathName =
            "src/test/java/oop/assignment3/ex45/base/exercise45_input_test.txt";
    public final String altName1 =
            "src/test/java/oop/assignment3/ex45/base/exercise45_alt_test1.txt";
    public final String altName2 =
            "src/test/java/oop/assignment3/ex45/base/exercise45_alt_test2.txt";
    public final String altName3 =
            "src/test/java/oop/assignment3/ex45/base/exercise45_alt_test3.txt";

    @Test
    void getFile_check_that_input_file_is_correctly_modified_for_given_test_case() {
        try {
            Path path = Paths.get(pathName);
            Charset charset = StandardCharsets.UTF_8;

            //          Read the contents of the file and replace
            //          All instances of "utilize" with "use"
            String content = Files.readString(path, charset);



            content = content.replaceAll("utilize", "use");
            Files.writeString(path, content, charset);

            assertEquals("""
                    One should never use the word "use" in writing. Use "use" instead.\r
                    For example, "She uses an IDE to write her Java programs" instead of "She\r
                    uses an IDE to write her Java programs".""", content);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getFile_check_that_input_file_is_correctly_modified_for_alternate_test_case_set1() {
        try {
            Path path = Paths.get(altName1);
            Charset charset = StandardCharsets.UTF_8;

            //          Read the contents of the file and replace
            //          All instances of "utilize" with "use"
            String content = Files.readString(path, charset);


            content = content.replaceAll("pickled peppers", "peppered pickles");
            Files.writeString(path, content, charset);

            assertEquals("""
                    Peter Piper picked a peck of peppered pickles\r
                    A peck of peppered pickles Peter Piper picked\r
                    If Peter Piper picked a peck of peppered pickles\r
                    Where’s the peck of peppered pickles Peter Piper picked?""", content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getFile_check_that_input_file_is_correctly_modified_for_alternate_test_case_set2() {
        try {
            Path path = Paths.get(altName2);
            Charset charset = StandardCharsets.UTF_8;

            //          Read the contents of the file and replace
            //          All instances of "utilize" with "use"
            String content = Files.readString(path, charset);


            content = content.replaceAll("wood", "bread");
            Files.writeString(path, content, charset);

            assertEquals("""
                    How much bread would a breadchuck chuck if a breadchuck could chuck bread?\r
                    He would chuck, he would, as much as he could, and chuck as much bread\r
                    As a breadchuck would if a breadchuck could chuck bread""", content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getFile_check_that_input_file_is_correctly_modified_for_alternate_test_case_set3() {
        try {
            Path path = Paths.get(altName3);
            Charset charset = StandardCharsets.UTF_8;

            //          Read the contents of the file and replace
            //          All instances of "utilize" with "use"
            String content = Files.readString(path, charset);


            content = content.replaceAll("Rage, rage against the dying of the light.",
                    "Smile, smile towards the living of the dark.");
            Files.writeString(path, content, charset);

            assertEquals("""
                    Do not go gentle into that good night,\r
                    Old age should burn and rave at close of day;\r
                    Smile, smile towards the living of the dark.\r
                    Though wise men at their end know dark is right,\r
                    Because their words had forked no lightning they\r
                    Do not go gentle into that good night.\r
                    Good men, the last wave by, crying how bright\r
                    Their frail deeds might have danced in a green bay,\r
                    Smile, smile towards the living of the dark.\r
                    Wild men who caught and sang the sun in flight,\r
                    And learn, too late, they grieved it on its way,\r
                    Do not go gentle into that good night.\r
                    Grave men, near death, who see with blinding sight\r
                    Blind eyes could blaze like meteors and be gay,\r
                    Smile, smile towards the living of the dark.\r
                    And you, my father, there on the sad height,\r
                    Curse, bless, me now with your fierce tears, I pray.\r
                    Do not go gentle into that good night.\r
                    Smile, smile towards the living of the dark.""", content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void createOutput_check_if_output_file_has_been_created_set1() {
        boolean isCreated = false;

        try {
            String outputFile = "output";

            File output = new File("src/test/java/oop/assignment3/ex45/base/" + outputFile + ".txt");

            if (output.createNewFile()) {
                isCreated = true;
            }
        }
        catch (IOException e) {
            //
        }

        assertTrue(isCreated);
    }

    @Test
    void createOutput_check_if_output_file_has_been_created_set2() {
        boolean isCreated = false;

        try {
            String outputFile = "baby_cakes";

            File output = new File("src/test/java/oop/assignment3/ex45/base/" + outputFile + ".txt");

            if (output.createNewFile()) {
                isCreated = true;
            }
        }
        catch (IOException e) {
            //
        }

        assertTrue(isCreated);
    }

    @Test
    void createOutput_check_if_output_file_has_been_created_set3() {
        boolean isCreated = false;

        try {
            String outputFile = "";

            File output = new File("src/test/java/oop/assignment3/ex45/base/" + outputFile);

            if (output.createNewFile()) {
                isCreated = true;
            }
        }
        catch (IOException e) {
            //
        }

        assertFalse(isCreated);
    }
}