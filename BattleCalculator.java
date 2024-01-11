import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class BattleCalculator {
    public static void main(String[] args) {
        try {
            // Specify the file path
            String filePath = "path/to/data.json";

            // Create a FileReader
            FileReader reader = new FileReader(filePath);

            // Parse the JSON file
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(reader);

            // Iterate through the array
            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;

                // Extract values
                String name = (String) jsonObject.get("name");
                Long age = (Long) jsonObject.get("age");
                String city = (String) jsonObject.get("city");

                // Print values
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("City: " + city);
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}