/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_4_codigo;
import java.util.Scanner;
/**
 *
 * @author marcosfa
 */
public class Boletin2_4_codigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*4-	Deseña un ordinograma que lea 2 números e calcule : 1º a suma ,
        despois a resta,
        a continuación o producto e por último o cociente .
        Amosa o resultado de cada operación.*/
          Scanner sc = new Scanner(System.in);
          System.out.println("introduzca el primer numero");
          double num1 = sc.nextDouble();
          System.out.println("introduzca el segundo numero");
          double num2 = sc.nextDouble();
          double sum,resta,multi,divi;
          sum = num1 + num2;
          System.out.println("el resultado de la suma es: " + sum);
          resta = num1 - num2;
          System.out.println("El resultado de la resta es :" + resta);
          multi = num1 *num2;
          System.out.println("El resultado de la multiplicación es de:" + multi);
          
          if( num2 ==0){
              System.out.println("la división no se puede dividir entre 0" + num1 /num2);
             
          }else{
              divi = num1 /num2;
              System.out.println("El resultado de la división es: " + divi);
          }
    }
    
}
