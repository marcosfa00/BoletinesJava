/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin4_1;

/**
 *
 * @author marcosfa
 */
public class Libro {
   private String titulo;
   private String autor;
   private int anho;
   private short numPaginas;
   private float valoracion;
//constructor
public Libro(String titulo,String autor,int anho,short numPaginas,float valoracion){
    this.titulo = titulo;
    this.autor=autor;
    this.anho=anho;
    this.numPaginas=numPaginas;
    this.valoracion=valoracion;
}
//constructor por defecto
   public Libro(){
       
   }
   
//getters and Setters
   public String getTitulo(){
       return titulo;
   }
   public String getAutor(){
       return autor;
   }
   public int getAnho(){
       return anho;
   }
   public short getNumPaginas(){
       return numPaginas;
   }
   public float getValoracion(){
       return valoracion;
   }
   
   public void setTitulo(String titulo){
       this.titulo = titulo;
   }
    
   public void setAutor(String autor){
       this.autor = autor;
   }
   
   public void setAnho(int anho){
       this.anho=anho;
   }
   
   public void setNumPaginas(short numPaginas){
       this.numPaginas = numPaginas;
      
   }
   
   public void setValoracion(float valoracion){
       this.valoracion=valoracion;
   }
   
   
   
   
   //Methods
   public void mostrarCaracteristicas(){
       System.out.println("El titulo es: " + titulo);
       System.out.println("El autor del libro es: " + autor);
       System.out.println("El libro es del año " + anho);
       System.out.println("El libro tiene " + numPaginas + " páginas");
       System.out.println("El libro tiene una valoración de " + valoracion);
          
   }
   
  
}
