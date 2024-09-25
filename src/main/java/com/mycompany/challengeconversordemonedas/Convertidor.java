package com.mycompany.challengeconversordemonedas;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Convertidor {
    
    private static Gson instanciaGsonConfigurada(){
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting().create();
        return gson;
    }
    public static Datos convertirDesdeJson(){
        Gson gson = instanciaGsonConfigurada();
        Datos datos = null;
        try {
            datos = gson.fromJson(Conexion.conexion(), Datos.class);
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Convertidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }
    
    
    /*public static void archivoJson(List<Datos> datos) throws IOException{
        Datos json = convertirDesdeJson(datos);
        Gson gson = instanciaGsonConfigurada();
        BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.json", true));
        bw.write(gson.toJson(json));
        bw.newLine();
        bw.close();
    }*/
}
