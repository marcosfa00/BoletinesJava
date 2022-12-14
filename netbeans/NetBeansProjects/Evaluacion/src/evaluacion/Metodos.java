/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion;

import java.util.Scanner;
 import javax.swing.JOptionPane;

/**
 *
 * @author marcosfa
 */
public class Metodos {
  
    public static void programa(){
   
        String msg="no";
        do {
          
            
        
           
            Scanner sc = new Scanner(System.in);
        
            System.out.println("Cuantos examenes has hecho");
            CalcularNota.setnExamenes(sc.nextInt());
            System.out.println("Cuantos de ellos han sido teoricos");
            CalcularNota.setnTeorico(sc.nextInt());
       
            //pedir nota teorico
            CalcularNota.setNotasTeoricos();
       
            //pedir nota practico
            CalcularNota.setNotasPracticos();
          
            //pedir Numero de boletines
            System.out.println("Introduce el numero de boletines Realizados");
            CalcularNota.setnBoletines(sc.nextInt());
      
        
             //mostrar notas teoricos
              CalcularNota.getNotasTeoricos();

             //mostrar nota practico

             CalcularNota.getNotasPracticos();
       
       
            System.out.println("Teoricos: "+CalcularNota.getnTeoricos());
            System.out.println("Practicos: "+CalcularNota.getnPracticos());
            System.out.println("Boletines: " + CalcularNota.getnBoletines());

            //media
            System.out.println("La media de los examenes es : " + CalcularNota.calcularMedia());


            //Pregunta continuar
            System.out.println("Quieres seguir");
            msg = sc.next();
            
            
        } while (msg.equalsIgnoreCase("si"));
                
        
       
    }
}
