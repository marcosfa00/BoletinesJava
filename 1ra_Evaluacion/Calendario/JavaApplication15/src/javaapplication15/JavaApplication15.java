/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author marcosfa
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calendario cumple = new Calendario(29,10,2000);
        cumple.mostrar();
        Calendario cumple_Ignacio = new Calendario(18,6,1965);
      
        cumple_Ignacio.mostrar();
      
        
        Calendario fecha_mal = new Calendario(34,10,200);
        fecha_mal.mostrar();
        
        
    }
    
}
