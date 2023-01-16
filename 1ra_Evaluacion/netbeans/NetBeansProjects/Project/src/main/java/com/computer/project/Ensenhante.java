/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.computer.project;

/**
 *
 * @author marcosfa
 */
public class Ensenhante extends Persona{
    private String materia;

    public Ensenhante(String materia, String nome, String direccion) {
        super(nome, direccion);
        this.materia = materia;
    }

    public Ensenhante() {
        
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString() + "Ensenhante{" + "materia=" + materia + '}';
    }
    
    
}
