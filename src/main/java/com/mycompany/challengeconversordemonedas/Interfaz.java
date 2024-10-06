package com.mycompany.challengeconversordemonedas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Interfaz {
    public static void menu() throws IOException, InterruptedException{
        List<Datos> listaDatos = new ArrayList();
        Datos datos;
        int opc = 0;
        double monto;
        String texto;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           *******************************************
                                     Conversor de monedas
                           
                            1. Dolar ===> Peso argentino
                            2. Peso argentino ===> Dolar
                            3. Dolar ===> Real brasilero
                            4. Real brasilero ===> Dolar
                            5. Dolar ===> Peso chileno
                            6. Peso chileno ===> Dolar
                            7. Dolar ===> Peso colombiano
                            8. Peso colombiano ===> Dolar
                            9. Dolar ===> Boliviano boliviano
                           10. Boliviano boliviano ===> Dolar
                            0. Salir
                           
                           *******************************************
                           """);
        try{
        System.out.print("Ingrese una opcion: ");
        opc = sc.nextInt();
        System.out.print("\033[H\033[2J"); 
        }catch(InputMismatchException e){
        System.out.println("Ingrese una opcion valida\n");
            menu();
        }
        switch (opc) {
            case 1 -> {
                
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.USD, Monedas.ARS, monto);
                listaDatos.add(datos);
                System.out.println("*******************************************");
                System.out.println("\t$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]");
                System.out.println("*******************************************");
                texto = "$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]";
                Convertidor.historialConsultas(texto);
                menu();
            }
            case 2 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.ARS, Monedas.USD, monto);
                listaDatos.add(datos);
                System.out.println("*******************************************");
                System.out.println("$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]");
                System.out.println("*******************************************");
                texto = "$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]";
                Convertidor.historialConsultas(texto);
                menu();
            }
            case 3 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.USD, Monedas.BRL, monto);
                listaDatos.add(datos);
                System.out.println("*******************************************");
                System.out.println("$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]");
                System.out.println("*******************************************");
                texto = "$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]";
                Convertidor.historialConsultas(texto);
                menu();
            }
            case 4 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.BRL, Monedas.USD, monto);
                listaDatos.add(datos);
                System.out.println("*******************************************");
                System.out.println("$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]");
                System.out.println("*******************************************");
                texto = "$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]";
                Convertidor.historialConsultas(texto);
                menu();
            }
            case 5 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.USD, Monedas.CLP, monto);
                listaDatos.add(datos);
                System.out.println("*******************************************");
                System.out.println("$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]");
                System.out.println("*******************************************");
                texto = "$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]";
                Convertidor.historialConsultas(texto);
                menu();
            }
            case 6 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.CLP, Monedas.USD, monto);
                listaDatos.add(datos);
                System.out.println("*******************************************");
                System.out.println("$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]");
                System.out.println("*******************************************");
                texto = "$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]";
                Convertidor.historialConsultas(texto);
                menu();
            }
            case 7 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.USD, Monedas.COP, monto);
                listaDatos.add(datos);
                System.out.println("*******************************************");
                System.out.println("$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]");
                System.out.println("*******************************************");
                texto = "$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]";
                Convertidor.historialConsultas(texto);
                menu();
            }
            case 8 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.COP, Monedas.USD, monto);
                listaDatos.add(datos);
                System.out.println("*******************************************");
                System.out.println("$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]");
                System.out.println("*******************************************");
                texto = "$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]";
                Convertidor.historialConsultas(texto);
                menu();
            }
            case 9 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.USD, Monedas.BOB, monto);
                listaDatos.add(datos);
                System.out.println("*******************************************");
                
                System.out.println("$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]");
                System.out.println("*******************************************");
                texto = "$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]";
                Convertidor.historialConsultas(texto);
                menu();
            }
            case 10 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.BOB, Monedas.USD, monto);
                listaDatos.add(datos);
                System.out.println("*******************************************");
                System.out.println("$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]");
                System.out.println("*******************************************");
                texto = "$" + monto + "[" + datos.baseCode() + "]" + " = $" + datos.conversionResult() + "[" + datos.targetCode() + "]";
                Convertidor.historialConsultas(texto);
                menu();
            }
            case 0 -> System.out.println("Saliendo...");
            default -> {
                System.out.println("Ingrese una opcion valida\n");
                menu();
            }
        }
        Convertidor.archivoJson(listaDatos);
    }
      
}
