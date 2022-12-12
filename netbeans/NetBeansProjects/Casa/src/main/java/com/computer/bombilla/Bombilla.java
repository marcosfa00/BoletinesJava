/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.computer.bombilla;

/**
 *
 * @author marcosfa
 */
public class Bombilla {
    private boolean onOff = false;
    
    public Bombilla(){
        
    }
    public Bombilla(boolean onOff){
        this.onOff = onOff;
    }
    
    public boolean status(){
        return this.onOff;
    }
    public boolean interruptor(){
        if(onOff){
            onOff =false;
            return onOff;
        }else{
            onOff =true;
            return onOff;
        }
    }
    
    
}
