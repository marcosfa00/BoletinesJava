/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.computer.boletin15;

/**
 *
 * @author marcosfa
 */
public class Pelicula extends Multimedia{
    private String actor;
    private String actriz;

    public Pelicula(String titulo, String autor, String formato, float duracion,String actor,String actriz) {
        super(titulo, autor, formato, duracion);
        this.actor=actor;
        this.actriz=actriz;
        
    }

    public Pelicula() {
    }

    
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActriz() {
        return actriz;
    }

    public void setActriz(String actriz) {
        this.actriz = actriz;
    }

    @Override
    public String toString() {
        return super.toString()+"Pelicula{" + "actor=" + actor + ", actriz=" + actriz + '}';
    }
    
    
    
}
