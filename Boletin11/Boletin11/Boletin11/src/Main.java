import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Comento esto para ver si funciona
        String str_n_players = "INTRODUCE NÚMERO DE JUGADORES 1 O 2?";
        String str_numero = "INTRODUCE EL NÚMERO QUE SE VA HA ADIVINAR";
        String str_n_max_intentos = "INTRODUCE UN NÚMERO MÁXIMO DE INTENTOS";
        String str_adv_num = "ADIVINA EL NÚMERO, TE QUEDAN ";
        String str_intentos = "INTENTOS";
        String str_fallaste= "OOOH!! HAS FALLADO, EL NÚMERO ERA: ";
        Metodos metodo = new Metodos();
        int j = Integer.parseInt(JOptionPane.showInputDialog(str_n_players));
        double random =  Math.random() * 50 +1;
        int numero_a_adivinar;
        if (j == 1){
            numero_a_adivinar =(int) random;
            metodo.setNum(numero_a_adivinar);
        }else {
            numero_a_adivinar = Integer.parseInt(JOptionPane.showInputDialog(null,str_numero));
            metodo.validarNum(numero_a_adivinar);
            numero_a_adivinar = metodo.getNum();
        }
        int intentos = Integer.parseInt(JOptionPane.showInputDialog(str_n_max_intentos));
        metodo.validarIntentos(intentos);
        intentos = metodo.getIntentos();
        int i = 0;
        do {

            int adivinar_numero = Integer.parseInt(JOptionPane.showInputDialog( str_adv_num)+ (intentos-i)+ str_intentos);
          metodo.primeraPista(adivinar_numero,i);
          if (metodo.getAdivinar()){
              i += intentos;
          }
            i++;


        }while (i <= intentos);
        if(i== intentos){
            JOptionPane.showMessageDialog(null,str_fallaste + numero_a_adivinar);
        }

    }
}