/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin2_extra;

import java.util.HashSet;

/**
 *
 * @author marcosfa
 */
public class Cuenta {
    
    private String nombre_cliente;
    private String numero_cuenta;
    private double tae;
    private double saldo;
    
    //declaro los contructores
     public Cuenta (){
         
     }      
    public Cuenta(String nombre_cliente,String numero_cuenta, double tae,double saldo){
        this.nombre_cliente = nombre_cliente;
        this.numero_cuenta = numero_cuenta;
        this.tae =tae;
        this.saldo = saldo;
    }
    
    //creo los getters y los setters
    
    public void setNombre(String nombre_cliente){
        this.nombre_cliente = nombre_cliente;
    }
    public String getNombre(){
        return this.nombre_cliente;
    }
    
    public void setCuenta(String numero_cuenta){
        this.numero_cuenta = numero_cuenta;
    }
    public String getCuenta(){
        return this.numero_cuenta;
    }
    public void setTAE(double TAE){
        this.tae=TAE;
    }
    public double getTAE(){
        return this.tae;
    }
    
    public void setSaldo(double saldo){
        this.saldo =saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    //methods
    public void ingreso(int ingreso){
        this.saldo += Math.abs(ingreso);
    }
    public void reintegro(double reintegro){
        this.saldo -= Math.abs(reintegro);
        }   
    
    public void transferencia(Cuenta cliente2, double importe, double tae){
       double saldoC1 = this.saldo;
       saldoC1 -= importe ;//a la primera cuenta debemos restarle el porcentaje de los intereses saldo -(saldo * tae /100)
       saldoC1 = saldoC1 - (saldoC1 * tae / 100);
       this.saldo = saldoC1;
       double saldoC2 = cliente2.getSaldo();
        saldoC2 += importe;
        cliente2.setSaldo(saldoC2);
       
    }
    public void transferencia2(Cuenta cliente1, Cuenta cliente2, double importe, double tae, Cuenta banco){
        double saldoC1 = cliente1.getSaldo();
        saldoC1 -= importe;
        saldoC1 = saldoC1 - (saldoC1 * tae / 100);
        double saldoC2 = cliente2.getSaldo();
        saldoC2 += importe;
        cliente2.setSaldo(saldoC2);
        
        double saldoBanco = banco.getSaldo();
        saldoBanco += saldoC1 * tae / 100;
        banco.setSaldo(saldoBanco);
    }
    
    
    
    
}
