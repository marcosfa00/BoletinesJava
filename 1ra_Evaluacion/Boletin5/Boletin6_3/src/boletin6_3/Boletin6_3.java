/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6_3;

/**
 *
 * @author marcosfa
 */
public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo(2);
        Circulo circulo2 = new Circulo();
        circulo2.setRadio(4);
        
        double area = circulo1.calcularArea();
        double diametro = circulo2.calcularDiametro();
        
        System.out.println("el area de C1 = " + area);
        System.out.println("el diametro de C2 = " + diametro);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
