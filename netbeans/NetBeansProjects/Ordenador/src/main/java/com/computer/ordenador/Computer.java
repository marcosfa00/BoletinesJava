/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.computer.ordenador;

import com.computer.partes.Cpu;
import com.computer.partes.Monitor;
import com.computer.partes.Teclado;

/**
 *
 * @author marcosfa
 */
public class Computer {
    private Cpu tipoCpu = new Cpu();
    private Monitor tipoMon = new Monitor();
    private Teclado tipoTecl = new Teclado();
    private float precio;
    
    public Computer(){
        
    }
    public Computer(Cpu tipo, Monitor tipoMon,Teclado tipoTecl ,float precio){
        this.tipoCpu = tipo;
        this.tipoMon = tipoMon;
        this.tipoTecl =tipoTecl;
        this.precio = precio;
        
    }

    public Cpu getTipoCpu() {
        return tipoCpu;
    }

    public void setTipoCpu(Cpu tipoCpu) {
        this.tipoCpu = tipoCpu;
    }

    public Monitor getTipoMon() {
        return tipoMon;
    }

    public void setTipoMon(Monitor tipoMon) {
        this.tipoMon = tipoMon;
    }

    public Teclado getTipoTecl() {
        return tipoTecl;
    }

    public void setTipoTecl(Teclado tipoTecl) {
        this.tipoTecl = tipoTecl;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Computer{" + "tipoCpu=" + tipoCpu + ", tipoMon=" + tipoMon + ", tipoTecl=" + tipoTecl + ", precio=" + precio + '}';
    }
    
   
    
}
