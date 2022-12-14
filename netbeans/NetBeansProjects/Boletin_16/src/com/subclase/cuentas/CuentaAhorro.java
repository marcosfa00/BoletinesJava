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
public class CuentaAhorro extends Banco{
    
    private double interes;
    private double saldoMin = 1000;

    public CuentaAhorro(double interes, long nConta, double saldo, Persona cliente) {
        super(nConta, saldo,cliente);
        this.interes = saldo * interes / 100;
        if(saldo >= saldoMin){
          super.setSaldo(saldo + interes);
        }
       
    }

 
    public CuentaAhorro(){
        
    }

    @Override
    public String toString() {
        return super.toString()+ "CuentaAhorro{" + "interes=" + interes + ", saldoMin=" + saldoMin + '}';
    }
    
    
    
    
    
    
    
}
