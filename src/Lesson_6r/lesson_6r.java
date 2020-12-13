

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class lesson_6r {
    public static void main(String[] args) throws IOException {

        //JfIGQj6KyHmcN6D8bpbG8adhFVzmSgcI API key моего приложения

        //Погода для санкт петербурга location 295212

        // http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212&apikey=JfIGQj6KyHmcN6D8bpbG8adhFVzmSgcI

        // Экземпляр класса OkHttpClient выполняет всю работу по созданию и отправке запросов
        OkHttpClient client = new OkHttpClient();

        // Настраиваем запрос на сформированный URL
        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=JfIGQj6KyHmcN6D8bpbG8adhFVzmSgcI&language=ru-ru")
                .build();

        // Получение объекта ответа от сервера accuweather
        Response response = client.newCall(request).execute();

        // Тело сообщения возвращается методом body объекта Response (строка JSON )
        String body = response.body().string();

        //выводим в консоль JSON строку ответа
        System.out.println(body);




    }
}



