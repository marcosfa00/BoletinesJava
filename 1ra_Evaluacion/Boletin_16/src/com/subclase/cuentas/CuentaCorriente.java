/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.subclase.cuentas;

import boletin_16.Banco;
import boletin_16.Persona;

/**
 *
 * @author marcosfa
 */
public class CuentaCorriente extends Banco{

 public CuentaCorriente(long nConta, double saldo, Persona p1) {
        super(nConta, saldo * 0.985,p1);
    }
 
 public CuentaCorriente(){
     
 }

  
  
 
    

    
    
    
}
