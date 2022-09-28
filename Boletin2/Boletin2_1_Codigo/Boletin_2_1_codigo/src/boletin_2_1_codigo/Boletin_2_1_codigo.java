/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_2_1_codigo;

import java.util.Scanner;

/**
 *
 * @author marcosfa
 */
public class Boletin_2_1_codigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1-	Deseña un algoritmo que calcule o área dun triángulo. 
        A  saida faise  por pantalla .
        ( para codificar este programa inicializa 
        a base ao valor 4, e a altura ao valor 3 ) .*/
        
        //el primer paso es pedir los datos por consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base del triangulo");
        double base = sc.nextDouble();
        System.out.println("Introduzca la altura del triangulo");
        double altura = sc.nextDouble();
        //Para calcular el area debemos hacer base * altura /2
        
        double area = base * altura /2;
        System.out.println("El area del triangulo es. " + Math.round(area));
    
       
        
        
        
    }
    
}
