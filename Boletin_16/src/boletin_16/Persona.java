/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_16;

/**
 *
 * @author marcosfa
 */
public class Persona {
      private String nombre;
    private String apellidos;
    private String nif;

    public Persona(String nombre,String apellidos,String nif){
            this.nombre = nombre;
            this.apellidos=apellidos;
            this.nif=nif;
    }
    public Persona(){

    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + '}';
    }
    
    
}
