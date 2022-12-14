/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion;

import java.util.Scanner;

/**
 *
 * @author marcosfa
 * 
 * 
 */

public class CalcularNota {  
    static Scanner sc = new Scanner(System.in);
    
    //Atributos
    private static int nExamenes;//numero de examenes
    private static double[] notasPracticos ;
    private static double[] notasTeoricos ;
    private static int nTeorico; //numero de los teoricos valen el 40% y los practicos otro 40% los boletines un 20%
    private static int nPracticos;//numero de practicos
    private static int nBoletines;//numero de boletines
    
    //Constructores
    
    public CalcularNota(int nExamenes){
        this.nExamenes = nExamenes;
    }
    public CalcularNota(){
        
    }
    
    //Methods
    
    //calcular Media
    
    public static double calcularMedia(){
        double suma = 0;
        double mediaTeorico = 0;
        double mediaPractico=0;
        double mediaBoletines=0;
        double mediaTotal=0;
        if(getnTeoricos()==0){
            mediaTeorico=0;
        }else{
            for (int i = 0; i < notasTeoricos.length; i++) {
            suma += notasTeoricos[i];
            
            }
             mediaTeorico=(suma/notasTeoricos.length) *0.40;
        }
       
        
        
        suma = 0;
         if(getnPracticos()==0){
            mediaPractico=0;
        }else{
             for (int i = 0; i < notasPracticos.length; i++) {
            suma += notasPracticos[i];
            
            }
              mediaPractico=(suma / notasPracticos.length)*0.40;
        }
       
       
        
        //media de los boletines
        if(nBoletines >21){//mayor o igual al 90%
            mediaBoletines=2;
        }else if(nBoletines <=21 && nBoletines >= 16){
            mediaBoletines=1;
        }else if(nBoletines < 16){
            mediaBoletines = 0;
        }
       
        mediaTotal= mediaTeorico + mediaPractico;
        return mediaTotal + mediaBoletines;
    }
    
    /*
    setter nota Practicos
    
    */
    public static void setNotasPracticos() {
        notasPracticos=new double[getnPracticos()];
        for (int i = 0; i < notasPracticos.length; i++) {
             System.out.println("Introduce la nota del examen Practico: " + (i+1));
            notasPracticos[i]=sc.nextDouble();
            
        }
    }
    //devuelve notas de examenes practicos
    public static void getNotasPracticos() {
        for (int i = 0; i < notasPracticos.length; i++) {
            System.out.println("La nota del examen Practico " +(i+1)+ " es: " +notasPracticos[i]);
            
        }
       
    }
    //devuelve notas de examenes Teoricos
     public static void getNotasTeoricos()
     {
          
        for (int i = 0; i < notasTeoricos.length; i++) {
            System.out.println("La nota del examen Teorico " +(i+1)+ " es: " +notasTeoricos[i]);
            
        }
       
    }
     //Setter notas teoricos
    public static void setNotasTeoricos(){
        notasTeoricos=new double[getnTeoricos()];
        for (int i = 0; i < notasTeoricos.length; i++) {
            System.out.println("Introduce la nota del examen Teorico: " + (i+1));
            notasTeoricos[i]=sc.nextDouble();
        }
    }
    //set el numero de examenes teoricos que hay ademas del numero de practicos
    public static void setnTeorico(int teorico) {
        nTeorico = teorico;
        nPracticos = nExamenes - nTeorico;
    }
//devuelve el numero de examenes teoricos
    public static int getnTeoricos() {
        return nTeorico;
    }
    
    //devuelve el numero de exaenes practicos que hay
     public static int getnPracticos() {
        return nPracticos;
    }
   
//setter numero de examenes totales
    public static void setnExamenes(int nExamenes) {
        CalcularNota.nExamenes = nExamenes;
    }
    //seter numero de boletines
     public static void setnBoletines(int numero){
         nBoletines=numero;
     }
     //getter numero de boletines realizados
     public static int getnBoletines(){
         return nBoletines;
     }
    
  
    
}
