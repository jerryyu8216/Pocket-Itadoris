package PocketItadoris;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BattleCalculator {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object charactersObj = parser.parse(new FileReader("Characters.json"));
            JSONObject jsonObject = (JSONObject) charactersObj;
            
            System.out.println(jsonObject);
            
        } 
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
}