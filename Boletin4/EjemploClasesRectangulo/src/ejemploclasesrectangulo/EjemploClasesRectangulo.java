/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploclasesrectangulo;

import java.util.Scanner;

/**
 *
 * @author marcosfa
 */
public class EjemploClasesRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Rectangulo r1 = new Rectangulo();
      float area = r1.calcularArea(3, 4.1f);
      System.out.println("El area del rectangulo es : " + area);
        r1.calcularPerimetro(3, 5);
        
        Rectangulo r2 = new Rectangulo(2,3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base del Rectangulo");
        float base = sc.nextFloat();
        System.out.println("Wintroduzca la altura del Rectangulo");
        float altura=sc.nextFloat();
            
        Rectangulo r3 = new Rectangulo(base,altura);
        
        //Perimetro R3
        float perimetro = r3.getBase() * 2 + r3.getAltura() *2 ;
        System.out.println("el perimetro es: " + perimetro);
        
       r3.calcularPerimetro(base, altura);
       
    }
    
}
