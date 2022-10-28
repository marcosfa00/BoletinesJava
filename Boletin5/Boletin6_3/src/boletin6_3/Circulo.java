/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6_3;

/**
 *
 * @author marcosfa
 */
public class Circulo {
   private double radio;
   final private double pi = 3.14;
    
   //constructores
   public Circulo (double radio){
       this.radio = radio;
       
   }
    public Circulo(){
        
    }
    //getters and setters
    public double getRadio(){
        return this.radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getPi(){
        return this.pi;
    }
    //methods
    public double calcularArea(){
        //area circulo = pi*r^2
       return this.pi * Math.pow(this.radio,2);  
    }
    
    public double calcularDiametro(){
        //diametro circunferencia = 2 * PI * r
        return 2* this.pi* this.radio;
    }
    
    
    
    
    
}
