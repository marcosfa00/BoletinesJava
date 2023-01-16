/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.computer.project;

/**
 *
 * @author marcosfa
 */
public class Project {

    public static void main(String[] args) {

        Ensenhante e1 = new Ensenhante("Programación","Marcos","Crta Do Marco");
        
        System.out.println(e1.toString());
        e1.setNombre("Andrés Gordo" );
        System.out.println(e1.toString());
        
        Estudiante es1 = new Estudiante("Marcelo Panoso","Vigo","Daniel Castelao","1º Dam");
        EstudianteInternacional esIn1 = new EstudianteInternacional("Josefino lamedo", "Nigran","Oxford","4º","España");
        System.out.println(es1.toString());
        System.out.println(esIn1.toString());
    }
}
