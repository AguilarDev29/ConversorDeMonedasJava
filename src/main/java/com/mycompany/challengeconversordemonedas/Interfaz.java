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
        int opc;
        double monto;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
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
                           
                           """);
        
        System.out.print("Ingrese el codigo de su moneda: ");
        opc = sc.nextInt();

        
        switch (opc) {
            case 1 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.USD, Monedas.ARS, monto);
                System.out.println(datos);
                listaDatos.add(datos);
                
                menu();
            }
            case 2 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.ARS, Monedas.USD, monto);
                System.out.println(datos);
                listaDatos.add(datos);
                menu();
            }
            case 3 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.USD, Monedas.BRL, monto);
                System.out.println(datos);
                listaDatos.add(datos);
                menu();
            }
            case 4 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.BRL, Monedas.USD, monto);
                System.out.println(datos);
                listaDatos.add(datos);
                menu();
            }
            case 5 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.USD, Monedas.CLP, monto);
                System.out.println(datos);
                listaDatos.add(datos);
                menu();
            }
            case 6 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.CLP, Monedas.USD, monto);
                System.out.println(datos);
                listaDatos.add(datos);
                menu();
            }
            case 7 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.USD, Monedas.COP, monto);
                System.out.println(datos);
                listaDatos.add(datos);
                menu();
            }
            case 8 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.COP, Monedas.USD, monto);
                System.out.println(datos);
                listaDatos.add(datos);
                menu();
            }
            case 9 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.USD, Monedas.BOB, monto);
                System.out.println(datos);
                listaDatos.add(datos);
                menu();
            }
            case 10 -> {
                System.out.print("Ingrese el monto a consultar: ");
                monto = sc.nextDouble();
                datos = Convertidor.convertirDesdeJson(Monedas.BOB, Monedas.USD, monto);
                System.out.println(datos);
                listaDatos.add(datos);
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
