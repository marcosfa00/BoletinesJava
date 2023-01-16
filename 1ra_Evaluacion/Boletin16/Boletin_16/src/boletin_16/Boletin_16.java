/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_16;

import com.subclase.cuentas.CuentaCorriente;
import com.subclase.cuentas.CuentaAhorro;
/**
 *
 * @author marcosfa
 */
public class Boletin_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente p1 = new Cliente("Manolo","De la Rosa","12345678A");
        CuentaCorriente c1 = new CuentaCorriente(70,12000,p1);
        CuentaAhorro ca1 = new CuentaAhorro(2,71,120000,p1);
        
        System.out.println(c1.toString());
        System.out.println(ca1.toString());
    }
    
}
