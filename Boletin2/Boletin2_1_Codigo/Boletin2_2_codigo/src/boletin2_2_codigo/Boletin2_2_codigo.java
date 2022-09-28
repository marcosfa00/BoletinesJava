/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_2_codigo;
import java.util.Scanner;
/**
 *
 * @author marcosfa
 */
public class Boletin2_2_codigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        /*2-	Realiza un ordinograma que permita calcular o área dun cadrado de 3m de lado*/
        //Para calcular el area del un cuadrado la formula es lado * lado
        System.out.println("Introduzca el lado del cuadrado");
        double l = sc.nextDouble();
        double area = Math.pow(l,2);
        System.out.println("El area del cuadrado es de. " + area);
        
    }
    
}
