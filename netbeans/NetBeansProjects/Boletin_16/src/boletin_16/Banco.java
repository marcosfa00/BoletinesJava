/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_16;

/**
 *
 * @author marcosfa
 */
public class Banco {
     
    private long nConta;
    private double saldo;
    private Persona cliente = new Persona();

    public Banco(long nConta, double saldo, Persona cliente) {
        this.nConta = nConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public Banco(){
        
    }

  

    

    public long getnConta() {
        return nConta;
    }

    public void setnConta(long nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }


    public void ingresar(double ingreso){
        this.saldo += ingreso;
    }
    public void retirar(double retirada){
        this.saldo -= retirada;

    }
    public void actualizarSaldo(){
        System.out.println("el saldo es: " + getSaldo());
    }

    @Override
    public String toString() {
        return "Banco{" + "nConta=" + nConta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
    
}
