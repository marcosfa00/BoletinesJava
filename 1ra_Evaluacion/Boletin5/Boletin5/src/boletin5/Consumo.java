/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin5;

/**
 *
 * @author marcosfa
 */
public class Consumo {
    private int kilometros;
    private int litros;
    private int velocidad_media;
    private double precio_gas;
    
    //Constructores
    public Consumo(int kilometros,int litros, int velocidad_media, int precio_gas){
        this.kilometros = kilometros;
        this.litros = litros;
        this.velocidad_media = velocidad_media;
        this.precio_gas = precio_gas;
    }
    //Por defecto
    public Consumo(){
        
    }
    
    //methods
    public void setKm(int km){
        kilometros = km;
    }
    public void setLitros(int litros){
        this.litros = litros;
    }
    public void setvMedia(int velocidad){
        velocidad_media = velocidad;
    }
    public void setpGas(double Precio){
        precio_gas = Precio;
    }
    public double getTime (int km){
        //tiempo en realizar el viaje
        return this.kilometros / this.velocidad_media ;
        
        
    }
    public double consumoMedio(){
       int consumo = this.litros;
        double media_consumo= (consumo *100)/this.kilometros;
        return media_consumo;
    }
    
    public double consumoEuros(double consumoMedio){
        return consumoMedio * this.precio_gas;
    }
}
