/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex43.base;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Locale;

public class WebsiteGenerator {
    public final String yes = "YES";

    public String createWebsite(String name, String author, String js, String css) {
        String output = "";

        String curDir = System.getProperty("user.dir");
        curDir += "\\" + name;

        File site = new File(curDir);
        boolean isCreated = site.mkdir();

        if (isCreated) {
            output += "Created ./website/" + name + "\n";

            try {
                output += createHtml(curDir, name, author);
                output += createJS(curDir, name, js);
                output += createCSS(curDir, name, css);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("An error occurred.");
        }

        return output;
    }

    public String createHtml(String curDir, String name, String author) throws IOException {
        FileWriter writer = new FileWriter(curDir + "\\index.html");

        writer.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
        writer.write("\t<meta author=\"" + author + "\">\n");
        writer.write("\t<title>" + name + "</title>\n");
        writer.write("</head>\n<body>\n\n</body>\n</html>");
        writer.close();

        return "Created ./website/" + name + "/index.html" + "\n";
    }

    public String createJS(String curDir, String name, @NotNull String js) {
        if (js.equals("y") || js.equals("Y") || js.equals(yes.toLowerCase(Locale.ROOT))) {
            File jsFile = new File(curDir + "\\js");
            boolean jsExists = jsFile.mkdir();

            if (jsExists) {
                return "Created ./website/" + name + "/js/" + "\n";
            }
            else {
                return "No JavaScript folder was created.\n";
            }
        }

        return "";
    }

    public String createCSS(String curDir, String name, @NotNull String css) {
        if (css.equals("y") || css.equals("Y") || css.equals(yes.toLowerCase(Locale.ROOT))) {
            File cssFile = new File(curDir + "\\css");
            boolean cssExists = cssFile.mkdir();

            if (cssExists) {
                return "Created ./website/" + name + "/css/" + "\n";
            }
            else {
                return "No CSS folder was created.\n";
            }
        }

        return "";
    }
}
