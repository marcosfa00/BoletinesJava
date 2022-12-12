/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.computer.partes;

/**
 *
 * @author marcosfa
 */
public class Cpu {
    private int velocidad = 2;
    
    public Cpu(){
        
    }
    public Cpu(int velocidad){
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Cpu{" + "velocidad=" + velocidad + '}';
    }
    
    
}
