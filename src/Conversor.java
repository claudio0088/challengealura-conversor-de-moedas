import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public Moedas converterMoedas(){
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/d0c0dcfc83e1c1c4f10c74f0/latest/USD");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            return new Gson().fromJson(response.body(), Moedas.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Um error inesperado aconteceu tente novamente mais tarde");
        }

    }


}
