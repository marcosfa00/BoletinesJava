/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleproject1;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        /*1- Un economista encarga un programa para facer cálculos co IVE .
        A aplicación debe solicitar a base inponible e mais o IVE que debemos aplicarlle .
        Amosa por pantaia o importe correspondente o IVE e máis o total */
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor indique  la Base Imponible");
        double base = sc.nextDouble();
         System.out.println("Por favor indique el IVA");
           double iva = sc.nextDouble(); 
           base += base + 0.21;
         System.out.println("El PVP es de: " + base);
    }
}