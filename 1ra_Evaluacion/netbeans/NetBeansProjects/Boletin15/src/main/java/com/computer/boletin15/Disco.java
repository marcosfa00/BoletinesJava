/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.computer.boletin15;

/**
 *
 * @author marcosfa
 */
public class Disco extends Multimedia{
    private String genero;

    public Disco(String titulo, String autor, String formato, float duracion,String genero) {
        super(titulo, autor, formato, duracion);
        this.genero=genero;
    }

    public Disco() {
    }

    
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString()+ "Disco{" + "genero=" + genero + '}';
    }
    
    
}
