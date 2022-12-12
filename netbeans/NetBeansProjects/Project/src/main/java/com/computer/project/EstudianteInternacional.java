/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.computer.project;

/**
 *
 * @author marcosfa
 */
public class EstudianteInternacional extends Estudiante {
    private String pais;
    
    
    public EstudianteInternacional(){
        
    }
    
    public EstudianteInternacional(String nombre, String direccion,String nCole,String nivel,String pais){
    super(nombre,direccion,nCole,nivel);
    this.pais=pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString()+"EstudianteInternacional{" + "pais=" + pais + '}';
    }
    
    
}


