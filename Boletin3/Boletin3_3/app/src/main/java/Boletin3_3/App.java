/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Boletin3_3;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduca el numero de Billetes de 100 que tiene");
        int B_100 = sc.nextInt();
        B_100 = 100*B_100;
        System.out.println("Introduzca los billestes de 20 que tiene");
        int B_20 = sc.nextInt();
        B_20 = 20*B_20;
         System.out.println("Introduzca los billestes de 5 que tiene");
        int B_5 = sc.nextInt();
        B_5 = 5*B_5;
         System.out.println("Introduzca las monedas de 1€ que tiene");
        int M_1 = sc.nextInt();
        
        int Dinero = B_100 + B_20 + B_5 + M_1;
        System.out.println("Tiene usted " + Dinero + " €");
    }
}
