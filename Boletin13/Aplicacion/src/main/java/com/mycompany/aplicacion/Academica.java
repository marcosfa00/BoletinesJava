/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion;

import com.mycompany.paquete2.Personal;

public class Academica {
    public static int numReferencia = 2018;
    private String nome;
    private double nota;
    private Personal alumno;
    
    public Academica (String nome, double nota,Personal alumno){
        
        this.nome = nome;
        if(nota >=0 && nota <= 10){
            
            this.nota = nota;
        }else{
            this.nota = 0;
        }
        this.alumno = alumno;
        numReferencia +=1;
        
    }
    
    

    public static int getNumReferencia() {
        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia) {
        Academica.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Academica{" + "nome=" + nome + ", nota=" + nota + '}';
    }
    
    
    
    
}
