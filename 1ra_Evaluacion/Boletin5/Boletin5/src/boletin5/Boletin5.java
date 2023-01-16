/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5;

/**
 *
 * @author marcosfa
 */

public class Boletin5 {
    public static double gasoleoA = 1.995;
    public static double gasoleoA_Plus = 2.087;
    public static double gasolina_95 =1.773;
    public static double gasolina_98=1.935;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consumo coche1 = new Consumo ();
        coche1.setKm(300);//los quilometros recorridos
        coche1.setLitros(50);//los litros gastados
        coche1.setvMedia(300);//la velocidad media en recorrer x kilometros
        coche1.setpGas(gasoleoA);//El precio de la gasolina o gasoleo hoy
        
        //pasamos a los getters
        //obtengamos el tiempo del recorrido:
        double tiempo = coche1.getTime(200);
        System.out.println(tiempo);
        
        //obtengamos el consumo medio (litros consumidos x 100)/km recorridos
        double consumo = coche1.consumoMedio();
        System.out.println(consumo);
        
        //obtengamos el consumo en euros
        double consumo_euros = coche1.consumoEuros(consumo);
        System.out.println(consumo_euros);
        
        
        
        
        
        
    }
    
}
