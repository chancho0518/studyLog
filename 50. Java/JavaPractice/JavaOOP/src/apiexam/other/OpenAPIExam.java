package apiexam.other;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class OpenAPIExam {

	public static void main(String[] args) {
		String apiKey= "APIKey";
		String city = "Singapore";
		String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&lang=kr&appid=" + apiKey + "&units=metric";
		
		try {
			URL url = new URL(urlString);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");
			
			int responseCode = connection.getResponseCode();
			
			if(responseCode ==  200) {
				// Stream(입력 / 출력)의 연결
				BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String inputLine;
				StringBuffer content = new StringBuffer();
				
				while ((inputLine=input.readLine()) != null) {
					content.append(inputLine);
				}
				
				input.close();
				
				System.out.println("Content.toString() = " + content.toString());
				JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
				JsonObject mainData = weatherData.getAsJsonObject("main");
				Double temp = mainData.get("temp").getAsDouble();
				System.out.println("temp = " + temp);
				connection.disconnect();
			} else {
				// 오류
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
