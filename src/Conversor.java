import com.google.gson.*;

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

            // Utilizando JsonParser e JsonObject
            JsonElement rootElement = JsonParser.parseString(response.body());
            JsonObject rootObject = rootElement.getAsJsonObject();

            // Acessando campos específicos do JSON
            String baseCode = rootObject.get("base_code").getAsString();
            JsonObject conversionRates = rootObject.get("conversion_rates").getAsJsonObject();

            // Convertendo os valores das taxas de conversão para um record (ou classe)

            double ars = conversionRates.get("ARS").getAsDouble();
            double bob = conversionRates.get("BOB").getAsDouble();
            double brl = conversionRates.get("BRL").getAsDouble();
            double cop = conversionRates.get("COP").getAsDouble();
            double usd = conversionRates.get("USD").getAsDouble();
            // Retornando um objeto Moedas
            return new Moedas(baseCode,ars,bob,brl,cop,usd);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Um error inesperado aconteceu tente novamente mais tarde");
        }

    }


}
