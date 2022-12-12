/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aplicacion;

import com.mycompany.paquete2.Personal;

/**
 *
 * @author marcosfa
 */
public class Aplicacion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Personal alum = new Personal("627773849","marcosf.a@icloud.com");
        Academica ac1 = new Academica ("Luciano Melano",9.5,alum);
        
        System.out.println( alum.toString());
        System.out.println(ac1.toString());
        System.out.println("nombre: " + ac1.getNome());
    }
}
