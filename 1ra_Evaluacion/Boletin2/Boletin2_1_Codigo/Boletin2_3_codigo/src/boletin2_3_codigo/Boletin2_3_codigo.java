package boletin2_3_codigo;
import java.util.Scanner;
/**
 *
 * @author marcosfa
 */
public class Boletin2_3_codigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*3-	Crea un algoritmo que cambie euros a dólares ( O cambio pídese por teclado ).
   Codifica o programa, correspondente, para executar o programa  co nome */
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca la cantidad de euros que desea cambiar");
        double euros = sc.nextDouble();
        System.out.println("introduzca el precio actual del dolar (abitualmente esta en 1,03 dolares por cada euro)");
        double dolar = sc.nextDouble();
        double convert = euros * dolar;
        System.out.println("Usted tiene " + convert + "Dolares");
      
        
    }
    
}