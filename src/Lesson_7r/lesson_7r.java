import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class lesson_7r {

    public static void main(String[] args) throws IOException {
        String forecast = GetAccuWeatherForecast();

        PrintFiveDayForecast(forecast);
    }


    //Получить строку с прогнозом погоды от Accuweather
    private static String GetAccuWeatherForecast() throws IOException
    {
        //JfIGQj6KyHmcN6D8bpbG8adhFVzmSgcI API key моего приложения

        //Погода для санкт петербурга location 295212

        // http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212&apikey=JfIGQj6KyHmcN6D8bpbG8adhFVzmSgcI

        // Экземпляр класса OkHttpClient выполняет всю работу по созданию и отправке запросов
        OkHttpClient client = new OkHttpClient();

        // Настраиваем запрос на сформированный URL
        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=JfIGQj6KyHmcN6D8bpbG8adhFVzmSgcI&language=ru-ru&metric=true")
                .build();

        // Получение объекта ответа от сервера accuweather
        Response response = client.newCall(request).execute();

        // Тело сообщения возвращается методом body объекта Response (строка JSON )
        String body = response.body().string();

        return body;
    }


    //Печать 5-ти дневного прогноза
    private static void PrintFiveDayForecast(String forecast) throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); // <- указание поведения при обнаружении неизвестных полей

        JsonNode jsonNode = objectMapper
                .readTree(forecast);

        JsonNode dailyForecasts = jsonNode.get("DailyForecasts");

        ArrayNode arrayNode = (ArrayNode) dailyForecasts;

        //Как в задании
        System.out.println("Вывод как в задании");

        for (int i = 0; i < arrayNode.size(); i++) {
            JsonNode dayForecasts = arrayNode.get(i);
            PrintDayForecast(dayForecasts);
        }

        //с разделением на день ночь
        System.out.println("");
        System.out.println("Вывод с разделением на день ночь");
        for (int i = 0; i < arrayNode.size(); i++) {
            JsonNode dayForecasts = arrayNode.get(i);
            PrintAllDayForecast(dayForecasts);
        }



    }

    //Печать прогноза как в задании за 1 день
    private static void PrintDayForecast(JsonNode dayForecast) throws IOException
    {

        JsonNode date = dayForecast.get("Date");

        JsonNode temperature = dayForecast.get("Temperature");

        JsonNode day = dayForecast.get("Day");


        ZonedDateTime dateTime = ZonedDateTime.parse(date.asText());

        String simpleData = dateTime.toLocalDate().toString();


        System.out.println("В городе Санкт-Петербург на дату "+
                simpleData
                +" ожидается "+
                day.get("IconPhrase").asText()+
                ", температура  "+temperature.get("Minimum").get("Value"));

    }

    //Печать прогноза с разделением на деь ночь
    private static void PrintAllDayForecast(JsonNode dayForecast) throws IOException
    {

        JsonNode date = dayForecast.get("Date");

        JsonNode temperature = dayForecast.get("Temperature");

        JsonNode day = dayForecast.get("Day");

        JsonNode night = dayForecast.get("Night");


        ZonedDateTime dateTime = ZonedDateTime.parse(date.asText());

        String simpleData = dateTime.toLocalDate().toString();

        System.out.println("В городе Санкт-Петербург на дату "+
                simpleData
                +" ожидается днем "+
                day.get("IconPhrase").asText()+
                " вечером "+ night.get("IconPhrase").asText()+
                ", температура от "+temperature.get("Minimum").get("Value")+
                " до "+temperature.get("Maximum").get("Value"));

    }
}
