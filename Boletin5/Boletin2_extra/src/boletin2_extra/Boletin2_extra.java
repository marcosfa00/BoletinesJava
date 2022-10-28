/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_extra;

/**
 *
 * @author marcosfa
 */
public class Boletin2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cuenta banco= new Cuenta("Santander","ES8905",0,9000);
        Cuenta cliente1 = new Cuenta("Manolo","ES3549",0,5000);
        Cuenta cliente2 = new Cuenta("Angel","ES3548",0,5000);
        System.out.println("saldo cliente1  " + cliente1.getSaldo());
        System.out.println("saldo cliente2  "+ cliente2.getSaldo());
        cliente1.transferencia(cliente2, 100,10);
        System.out.println("saldo cliente1  " + cliente1.getSaldo());
        System.out.println("saldo cliente2  "+ cliente2.getSaldo());
        System.out.println("");
        System.out.println("");
           
        cliente1.transferencia2(cliente1, cliente2, 150,10, banco);
        
        System.out.println("saldo cliente1  " + cliente1.getSaldo());
        System.out.println("saldo cliente2  "+ cliente2.getSaldo());
        System.out.println("saldo banco " + banco.getNombre() +" " +banco.getSaldo());
        
        
        
        
        
        
        
        
        
    }
    
}
