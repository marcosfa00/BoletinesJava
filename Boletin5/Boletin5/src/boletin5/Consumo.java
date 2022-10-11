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
    private int precio_gas;
    
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
    public void setpGas(int Precio){
        precio_gas = Precio;
    }
    public int getTime (){
        //tiempo en realizar el viaje
        return 0;
        
    }
    public int consumoMedio(){
        return 0;
    }
    
    public int consumoEuros(){
        return 0;
    }
}
