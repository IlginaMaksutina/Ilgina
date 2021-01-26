package ru.geekbrains.qa.java2.lesson7_project.project;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.ZonedDateTime;

public class WeatherResponse {
    public String jsonString;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public WeatherResponse(String sourceString)
    {
        jsonString= sourceString;
    }

    public String getFormattedResponse() throws JsonProcessingException {

        String temperature = objectMapper.readTree(jsonString).get(0).at("/Temperature/Metric/Value").asText();
        String weatherText = objectMapper.readTree(jsonString).get(0).at("/WeatherText").asText();

        return "температура " + temperature + " градусов цельсия, погода " + weatherText;
    }

    public String getFormattedResponseForPeriod() throws JsonProcessingException {

        JsonNode jsonNode = objectMapper.readTree(jsonString).at("/DailyForecasts");
        String response =" Погода на "+jsonNode.size()+ " дней\n";

        for (int i=0; i<jsonNode.size();i++)
        {

            String globalDate =jsonNode.get(i).at("/Date").asText();

            ZonedDateTime dateTime = ZonedDateTime.parse(globalDate);
            String simpleData = dateTime.toLocalDate().toString();

            String minTemperature = jsonNode.get(i).at("/Temperature/Minimum/Value").asText();
            String maxTemperature = jsonNode.get(i).at("/Temperature/Maximum/Value").asText();

            String weatherText = jsonNode.get(i).at("/Day/IconPhrase").asText();

            response +="На "+simpleData+" Температура от "+minTemperature+
                    " до "+maxTemperature+" градусов, днем "+weatherText+"\n";
        }

        return response;
    }
}
