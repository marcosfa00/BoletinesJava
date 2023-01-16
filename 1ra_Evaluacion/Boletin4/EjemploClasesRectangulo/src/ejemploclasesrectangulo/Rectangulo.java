/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploclasesrectangulo;

/**
 *
 * @author marcosfa
 */
public class Rectangulo {
    //declaro atributos
    private float base = 3;
    private float altura = 4;
    
    
    //Constructores
    public Rectangulo(float ba, float alt){
        base =ba;
        altura = alt;
    }
    //constructor por defecto
    public Rectangulo(){}
    
    
    //Defino metodos
    public float calcularArea (float b,float a){
       float area = a*b;
       return area;
     
    }
    
    public void calcularPerimetro(float b,float a){
        float perimetro = 2*b+2*a;
        System.out.println("perimetro = " + perimetro);
        System.out.println("perimetro = " + (2*b+2*a));
    }
    
    //metodos de acceso Getters & Setters
    public void setAltura(float al){
        altura = al;
    }
    public void setBase(float base){
        this.base = base;
    }
    
    public float getAltura(){
        return altura;
    }
    public float getBase(){
        return base;
    }
}
