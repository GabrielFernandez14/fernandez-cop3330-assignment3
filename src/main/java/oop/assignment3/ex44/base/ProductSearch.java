package oop.assignment3.ex44.base;

import java.io.*;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
//import java.io.IOException;
import org.json.simple.*;
import org.json.simple.parser.*;

public class ProductSearch {
    //public final Scanner in = new Scanner(System.in);

    public void getProduct() {
        try {
            String input;

            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(new FileReader
                    ("src/main/java/oop/assignment3/ex44/base/exercise44_input.json"));
            JSONArray products = (JSONArray) obj.get("products");

            BufferedReader bReader = new BufferedReader
                    (new InputStreamReader(System.in));

            System.out.print("What is the product name? ");
            input = bReader.readLine();
            Iterator iterator = products.iterator();
            JSONObject curObj = (JSONObject) iterator.next();
            String name = (String)curObj.get("name");

            while (iterator.hasNext() || Objects.equals(input.toLowerCase(), name.toLowerCase())) {
                if (Objects.equals(input.toLowerCase(), name.toLowerCase())) {
                    break;
                }
                else {
                    curObj = (JSONObject) iterator.next();
                    name = (String) curObj.get("name");
                    System.out.println("Sorry, that product was not found in our inventory.");
                    System.out.print("What is the product name? ");
                    input = bReader.readLine();
                }
            }

            System.out.println("Name: " + name);
            System.out.println("Price: " + curObj.get("price"));
            System.out.println("Quantity: " + curObj.get("quantity"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
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
