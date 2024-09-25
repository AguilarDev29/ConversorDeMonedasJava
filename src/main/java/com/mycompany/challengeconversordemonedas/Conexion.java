package com.mycompany.challengeconversordemonedas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Conexion {
    public static String conexion() throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/12575b12a96bb75406f2e962/pair/USD/ARS/100")).build();
        
        HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        return  response.body();
    }
}
