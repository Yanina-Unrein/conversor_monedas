package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class ExchangeService {

    private final String API_URL = "https://api.exchangerate-api.com/v4/latest/USD";

    public Map<String, Double> getRates() {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null)
                response.append(line);
            in.close();

            Gson gson = new Gson();
            Type type = new TypeToken<Map<String, Object>>(){}.getType();
            Map<String, Object> jsonMap = gson.fromJson(response.toString(), type);

            // Extraemos solo el objeto "rates"
            String ratesJson = gson.toJson(jsonMap.get("rates"));
            Type ratesType = new TypeToken<Map<String, Double>>(){}.getType();
            return gson.fromJson(ratesJson, ratesType);

        } catch (Exception e) {
            System.out.println("Error al obtener tasas: " + e.getMessage());
        }
        return null;
    }
}