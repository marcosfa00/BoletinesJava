/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin4_1;

/**
 *
 * @author marcosfa
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro l1 = new Libro("Alicia en el Pais de las maravillas","Lewis Carroll",1865,(short)784,7.5f);
        Libro l2 = new Libro();
        l2.setTitulo("Warren Buffett y la Inerpretacion de Estados Financieros");
        l2.setAutor("Mary Buffett & David Clark");
        l2.setAnho(2021);
        l2.setNumPaginas((short)224);
        l2.setValoracion(9.1f);
        l1.mostrarCaracteristicas();
        System.out.println("");
        System.out.println("");
        l2.mostrarCaracteristicas();
        System.out.println("");
        System.out.println("");
        l2.setNumPaginas((short)225);
        l2.mostrarCaracteristicas();
        
        
       

    }
    
}
