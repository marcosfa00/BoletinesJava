/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.computer.boletin15;

import java.util.Scanner;

/**
 *
 * @author marcosfa
 */
public class Boletin15 {
    public static String leerString(String msg){
        return "hola caracola";
    }

    public static void main(String[] args) {
        
        Disco d1 =new Disco("Waka Waka","Shakira","Disco",2f,"Pop");
        System.out.println(d1.toString());
        Pelicula p1 = new Pelicula("El lobo de wall Street","Jordan Belfort","Economia",3f,"Leonardo Dicaprio","Margot Robie");
        System.out.println(p1.toString());
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de la peli");
        p1.setTitulo(sc.nextLine());
        System.out.println("Autor de la peli");
        p1.setAutor(sc.nextLine());
        System.out.println("Formato de la peli");
        p1.setFormato(sc.nextLine());
        System.out.println("duraciond de la peli '(float)'");
        p1.setDuracion(sc.nextFloat());
        System.out.println("Actor de la peli");
        p1.setActor(sc.nextLine());
        System.out.println("Actriz de la peli");
        p1.setActriz(sc.nextLine());
        
      
        
        
        
        
    }
}
