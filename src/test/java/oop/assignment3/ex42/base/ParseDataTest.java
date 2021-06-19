/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex42.base;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ParseDataTest {
    @Test
    void getTable_for_given_test_case() {
        ParseData pd = new ParseData();

        String actual = pd.getTable();

        assertEquals("""
                Ling      Mai       55900    \s
                Johnson   Jim       56500    \s
                Jones     Aaron     46000    \s
                Jones     Chris     34500    \s
                Swift     Geoffrey  14200    \s
                Xiong     Fong      65000    \s
                Zarnecki  Sabrina   51500    \s
                """, actual);
    }

    @Test
    void getTable_for_alternative_test_case_set1() {
        StringBuilder output = new StringBuilder();

        try {
            BufferedReader in = new BufferedReader
                    (new FileReader("src/test/java/oop/assignment3/ex42/base/exercise42_test_input1.txt"));

            String curData;

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

        String actual = output.toString();

        assertEquals("""
                Difo      God       15124    \s
                Sadness   Happy     12412    \s
                Pain      OOPClass  12314    \s
                Cry       YouUtterFool12441    \s
                FirstName LastName  19231    \s
                Dr.       Hollander 12933    \s
                lower     case      23134    \s
                """, actual);
    }

    @Test
    void getTable_for_alternative_test_case_set2() {
        StringBuilder output = new StringBuilder();

        try {
            BufferedReader in = new BufferedReader
                    (new FileReader("src/test/java/oop/assignment3/ex42/base/exercise42_test_input2.txt"));

            String curData;

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

        String actual = output.toString();

        assertEquals("""
                supercallifragillisticexpialadociousdangthat'salongword12345    \s
                a         b         1        \s
                wowee     ClAP      23467    \s
                ISureLove Testing   19234    \s
                I'mGoingInsaneWEEEEEEEEEEEEE21345    \s
                """, actual);
    }
}