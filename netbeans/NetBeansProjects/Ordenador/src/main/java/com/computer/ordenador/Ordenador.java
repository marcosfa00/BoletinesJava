/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.computer.ordenador;

import com.computer.partes.Cpu;
import com.computer.partes.Monitor;
import com.computer.partes.Teclado;

/**
 *
 * @author marcosfa
 */
public class Ordenador {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Computer pc1 = new Computer();
        Cpu intel = new Cpu(4);
        pc1.setTipoCpu(intel);
        Monitor Samsung = new Monitor(49.2f);
        pc1.setTipoMon(Samsung);
        Teclado t1 = new Teclado("Asus");
        pc1.setTipoTecl(t1);
        pc1.setPrecio(1500.50f);
        

        System.out.println("Muestro todos los datos del ordenador : " + pc1.toString() );
        System.out.println("El precio del ordenador es: "+ pc1.getPrecio());
        System.out.println("La marca del teclado es: " + t1.getMarca());
        System.out.println("La velocidad de la cpu es" + intel.getVelocidad());
        
    }
}
