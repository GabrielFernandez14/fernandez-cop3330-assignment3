package oop.assignment3.ex45.base;

import org.junit.jupiter.api.Test;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {
    public final String givenPath =
            "src/test/java/oop/assignment3/ex45/base/exercise45_input_test.txt";

    @Test
    void getFile_check_if_given_test_case_input_is_correctly_modified() {
        try {
            Path path = Paths.get(givenPath);
            Charset charset = StandardCharsets.UTF_8;

            //          Read the contents of the file and replace
            //          All instances of "utilize" with "use"
            String content = Files.readString(path, charset);

            assertEquals("""
                    One should never utilize the word "utilize" in writing. Use "use" instead.
                    For example, "She uses an IDE to write her Java programs" instead of "She
                    utilizes an IDE to write her Java programs".""", content);

            content = content.replaceAll("utilize", "use");
            Files.writeString(path, content, charset);

            assertEquals("""
                    One should never use the word "use" in writing. Use "use" instead.
                    For example, "She uses an IDE to write her Java programs" instead of "She
                    uses an IDE to write her Java programs".""", content);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*@Test
    void createOutput() {
    }

    @Test
    void printToOutput() {
    }*/
}