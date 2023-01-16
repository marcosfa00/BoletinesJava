/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marcos.paqueteA;

import com.marcos.paqueteB.ClaseD;

/**
 *
 * @author marcosfa
 */
public class claseA {
    
    private void mostrarClaseA(){
        System.out.println("Esto es la clase A");
    }
    public void mostrar(){
        ClaseB obj = new ClaseB();
        obj.mostrarClaseB();
        System.out.println("Que ademas se esta llamando en la clase A");
    }
    public void mostrarD(){
        ClaseD obj = new ClaseD();
        obj.mostrarClaseD();
    }
}
