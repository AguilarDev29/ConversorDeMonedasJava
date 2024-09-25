package com.mycompany.challengeconversordemonedas;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;

public class ChallengeConversorDeMonedas {

    public static void main(String[] args) throws IOException, InterruptedException{
        List<Datos> listaDatos = new ArrayList();
         
        
        String json = Conexion.conexion();
        
        //System.out.println(json);
        Datos datos = Convertidor.convertirDesdeJson();
        System.out.println(datos);
        
    }
}
