import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Comento esto para ver si funciona
        Metodos metodo = new Metodos();
        int j = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE NÚMERO DE JUGADORES 1 O 2?"));
        double random =  Math.random() * 50 +1;
        int num;
        if (j == 1){
            num =(int) random;
            metodo.setNum(num);
        }else {
            num = Integer.parseInt(JOptionPane.showInputDialog(null,"INTRODUCE EL NÚMERO QUE SE VA HA ADIVINAR"));
            metodo.validarNum(num);
            num = metodo.getNum();
        }
        int intentos = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN NÚMERO MÁXIMO DE INTENTOS"));
        metodo.validarIntentos(intentos);
        intentos = metodo.getIntentos();
        int i = 0;
        do {

            int adv_num = Integer.parseInt(JOptionPane.showInputDialog("ADIVINA EL NÚMERO TE QUEDAN " + (intentos-i)+ " INTENTOS"));
          metodo.primeraPista(adv_num,i);
          if (metodo.getAdivinar()){
              i += intentos;
          }
            i++;


        }while (i <= intentos);
        if(i== intentos){
            JOptionPane.showMessageDialog(null,"OOOH!! HAS FALLADO, EL NÚMERO ERA: " + num);
        }

    }
}