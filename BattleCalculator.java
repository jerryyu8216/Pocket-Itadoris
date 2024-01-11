package PocketItadoris;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class BattleCalculator {
    public static void main(String[] args) {
        try {
            // Parse the JSON file
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("C:\\Users\\thatg\\Documents\\JJK Project\\PocketItadoris\\Characters.json"));

            JSONArray characters = (JSONArray) jsonObject.get("Jujutsu-Kaisen-Characters");

            //System.out.println(characters.toString());

            //  Iterate through the array
            for(Object obj: characters){
                JSONObject Character = (JSONObject) obj;
                // Extract values
                String name = (String) Character.get("name");
                Long level = (Long) Character.get("level");
                int id = Integer.valueOf(Character.get("characterId").toString());

                // Print values
                System.out.println("Name: " + name);
                System.out.println("Level: " + level);
                System.out.println("Character ID: " + id);
                System.out.println();
            } 
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}