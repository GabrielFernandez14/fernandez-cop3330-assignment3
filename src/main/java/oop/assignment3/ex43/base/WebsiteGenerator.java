/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex43.base;

import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Locale;

class WebsiteGenerator {
    public final String yes = "YES";

    // Create website file
    public String createWebsite(String name, String author, String js, String css) {
        String output = "";

        //      Create the file
        String curDir = System.getProperty("user.dir");
        curDir += "\\" + name;

        File site = new File(curDir);
        boolean isCreated = site.mkdir();

        //      Check if the file was created
        if (isCreated) {
            //          If yes, print corresponding "Created..." statement
            output += "Created ./website/" + name + "\n";

            try {
                //          The file was created, so create the index.html file
                output += createHtml(curDir, name, author);
                //              Create the JavaScript file
                output += createJS(curDir, name, js);
                //              Create the CSS file
                output += createCSS(curDir, name, css);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        //          If no, let the user know something went wrong
        else {
            output = "An error occurred.";
        }

        return output;
    }

    public String createHtml(String curDir, String name, String author) throws IOException {
        String html = "<title>" + name + "</title><h1>" + name + "</h1><head><meta author>" + author + "</head>";
        File htmlFile = new File(curDir + "\\index.html");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(htmlFile));
            bw.write(html);
            bw.close();
            return "Created ./website/" + name + "/index.html" + "\n";
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public String createJS(String curDir, String name, String js) {
        //          Check if the user wants the JavaScript file to be created
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

    public String createCSS(String curDir, String name, String css) {
        //          Check if the user wants the CSS file to be created
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
