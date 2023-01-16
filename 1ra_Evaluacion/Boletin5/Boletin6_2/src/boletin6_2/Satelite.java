/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6_2;

/**
 *
 * @author marcosfa
 */
public class Satelite {
 
     private double meridiano ;
     private double paralelo;
     private double distanciaTerra ;

 public Satelite () {

  this.meridiano = meridiano;
  this.paralelo=paralelo;
  this.distanciaTerra = 0;
 }
 
public Satelite ( double m, double p , double d ) {
meridiano = m;
paralelo = p;
distanciaTerra = d;

}
public void verPosicion(){

System.out.println(" o satelite atopase  no paralelo " + paralelo + " meridiano " + meridiano + " a unha distancia da terra " + distanciaTerra );    
}

}
