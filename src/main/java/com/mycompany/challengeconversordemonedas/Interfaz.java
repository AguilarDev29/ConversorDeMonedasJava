package com.mycompany.challengeconversordemonedas;

import java.util.Scanner;


public class Interfaz {
    public static void menu(){
        int opc;
        double monto;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                                     Conversor de monedas
                           
                           1.  Dolar ===> Peso argentino
                           2.  Peso argentino ===> Dolar
                           3.  Dolar ===> Real brasilero
                           4.  Real brasilero ===> Dolar
                           5.  Dolar ===> Peso chileno
                           6.  Peso chileno ===> Dolar
                           7.  Dolar ===> Peso colombiano
                           8.  Peso colombiano ===> Dolar
                           9.  Dolar ===> Boliviano boliviano
                           10. Boliviano boliviano ===> Dolar
                           0. Salir
                           
                           """);
        
        System.out.print("Ingrese el codigo de su moneda: ");
        opc = sc.nextInt();
        System.out.print("Ingrese el monto a consultar: ");
        monto = sc.nextDouble();
        switch (opc) {
            case 1:
                Conexion.conexion(Monedas.USD, Monedas.ARS, monto);
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            case 9:
                
                break;
            case 10:
                
                break;
            case 0:
                
                break;
            default:
                System.out.println("Ingrese una opcion");
        }
    }
    
}
