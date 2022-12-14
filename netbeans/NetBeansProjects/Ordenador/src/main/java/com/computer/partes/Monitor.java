/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.computer.partes;

/**
 *
 * @author marcosfa
 */
public class Monitor {
    
    private float pulgadas = 0.1f;
    
    public Monitor(float pulgadas){
        this.pulgadas = pulgadas;
    }
    
    public Monitor(){
        
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" + "pulgadas=" + pulgadas + '}';
    }
    
    
    
    
        
}
