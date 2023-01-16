/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6;

/**
 *
 * @author marcosfa
 */
public class Coche {
    private int velocidad;
    
    //Constructores
    public Coche(){
        velocidad =0;
    }
    
    //Methods
    public int getVelocidad(){
        return velocidad;
    }
    public void acelerar(int acelera){
        velocidad += Math.abs(acelera);
    }
    public void frenar(int frena){
        velocidad -= Math.abs(frena);
    }
    
    
    
    
    
    
    
    
}
