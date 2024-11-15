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
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Convertidor {
    
    private static Gson instanciaGsonConfigurada(){
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting().create();
        return gson;
    }
    public static Datos convertirDesdeJson(String moneda1, String moneda2,double monto){
        Gson gson = instanciaGsonConfigurada();
        Datos datos = null;
        try {
            datos = gson.fromJson(Conexion.conexion(extraerCodigo(moneda1), extraerCodigo(moneda2), monto), Datos.class);
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Convertidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }
    
    
    public static void archivoJson(List<Datos> datos) throws IOException{
        Gson gson = instanciaGsonConfigurada();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.json", true))){
            bw.write(gson.toJson(datos));
            bw.newLine();
        }
        
    }
    
    public static void historialConsultas(String texto) throws IOException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true))){
            bw.write(texto + "  -  " + LocalDate.now() + "  " + LocalTime.now());
            bw.newLine();
        }
    }
    
    public static String extraerCodigo(String texto){
        return texto.substring(texto.length() - 3);
    }
}
