/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.computer.project;

/**
 *
 * @author marcosfa
 */
public class Estudiante extends Persona{
    private String nombreCole;
    private String nivel;
    
    public Estudiante(){
        super();
    }
    public Estudiante(String nombre, String direccion,String nCole,String nivel){
        super(nombre,direccion);
        nombreCole=nCole;
        this.nivel=nivel;
    }

    @Override
    public String toString() {
        return super.toString()+"Estudiante{" + "nombreCole=" + nombreCole + ", nivel=" + nivel + '}';
    }
    
}
