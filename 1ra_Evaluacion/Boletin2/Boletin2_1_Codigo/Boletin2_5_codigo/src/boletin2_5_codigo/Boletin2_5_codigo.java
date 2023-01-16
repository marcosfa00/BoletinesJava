/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_5_codigo;
import java.util.Scanner;
/**
 *
 * @author marcosfa
 */
public class Boletin2_5_codigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        /*5-	Escribe un programa que lea o valor dunha 
        distancia en millas mariñas e a pase a metros 
        ( 1 milla mariña = 1852 m )*/ 
        
        System.out.println("introduzca la distancia en millas");
        double millas = sc.nextDouble();
        double convert = millas * 1852;
        System.out.println("La distancia introducida en metros es de: " + convert);
    }
    
}
