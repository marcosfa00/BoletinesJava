/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Boletin3_1;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "EJERCICIO 1";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        //CALCULAR EL DESCUENTO DE UNA COMPRA
        
        //primero creamos el Scanner para poder pedir datos
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Introduzca el PVP");
        double pvp= sc.nextDouble();
        System.out.println("Introduzca el Precio Pagado");
        double pp = sc.nextDouble();
        double Dcnto = 100 -((pp*100)/pvp);
        System.out.println("El descueto ha sido de: " + Math.round(Dcnto) + "%");
        
    }
}