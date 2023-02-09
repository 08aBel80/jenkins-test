package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class settingsUtils {
    private static final String settingsFile = "src/test/resources/settings.json";
    public static void setBrowserName(String browserName) {

        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(settingsFile));

            jsonObject.put("browserName",browserName);

            try (FileWriter file = new FileWriter(settingsFile)) {
                file.write(jsonObject.toJSONString());
                file.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
