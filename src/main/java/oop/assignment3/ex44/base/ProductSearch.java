/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment3.ex44.base;

import java.io.*;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.*;

public class ProductSearch {
    public final Scanner in = new Scanner(System.in);

    // Get the values for when the user inputs a "name" that matches the .json file
    public boolean getProduct() {
        System.out.print("What is the product name? ");
        String json = in.nextLine();

        //      Use a try-catch statement in case the creation of the file leads to an error
        try {
            //          Declare the file and enter the .json using the appropriate keys
            File file = new File("src/main/java/oop/assignment3/ex44/base/exercise44_input.json");
            JSONObject obj = new JSONObject(json);
            String enter = obj.getString("products");

            JSONArray arr = obj.getJSONArray("name");


            //              While the user has not identified the appropriate "name" key...
            while (!isJSONValid(json)) {
                //                  Prompt for input again
                System.out.println("Sorry, that product was not found in our inventory.");
                System.out.print("What is the product name? ");
                json = in.nextLine();
            //              End while
            }


            //          Print the values stored under the "name" key
            //          by calling the "price" and "quantity" keys
            System.out.printf("%s: %s\n%s: %s\n%s: %s", "Name", json,
                    "Price", arr.getJSONArray(Integer.parseInt(json)), "Quantity", arr.getJSONArray(Integer.parseInt(json)));
        }
        //      Catch: The file had an error in it's creation
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return false;
    }

    //              While the user has not identified the appropriate "name" key...
    public boolean isJSONValid(String test) {
        try {
            new JSONObject(test);
        } catch (JSONException ex) {
            try {
                new JSONArray(test);
            } catch (JSONException ex1) {
                return false;
            }
        }
        return true;
    }
}

/*
JSONParser parser = new JSONParser();
        try {
            JSONObject obj = (JSONObject) parser.parse(new FileReader
                    ("src/main/java/oop/assignment3/ex44/base/exercise44_input.json"));
            JSONArray data = (JSONArray) obj.get("products");

            String in;
            //String output = "";
            int flag = 0;

            BufferedReader reader = new BufferedReader
                    (new InputStreamReader(System.in));
            Iterator iterator = data.iterator();

            System.out.print("What is the product name? ");
            in = reader.readLine();
            while (iterator.hasNext()) {
                JSONObject curData = (JSONObject) iterator.next();
                String name = (String) curData.get("name");

                if (in.equalsIgnoreCase(name)) {
                    System.out.println("Name: " + name);
                    System.out.println("Price: " + curData.get("price"));
                    System.out.println("Quantity: " + curData.get("quantity"));
                    flag = 1;
                }

                if (flag == 0) {
                    System.out.println("Sorry, that product was not found in our inventory.");
                    System.out.print("What is the product name? ");
                    in = reader.readLine();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
 */

    /*
    public void loopTilFound(JSONArray data) throws IOException {
        String in;
        //String output = "";
        int flag = 0;

        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        var iterator = data.iterator();

        System.out.print("What is the product name? ");
        in = reader.readLine();
        while (iterator.hasNext()) {
            JSONObject curData = (JSONObject) iterator.next();
            String product = (String) curData.get("name");

            if (in.equalsIgnoreCase(product)) {
                System.out.println("Name: " + product);
                System.out.println("Price: " + curData.get("price"));
                System.out.println("Quantity: " + curData.get("quantity"));
                flag = 1;
            }

            if (flag != 1) {
                System.out.println("Sorry, that product was not found in our inventory.");
            }
        }
    }

     */
