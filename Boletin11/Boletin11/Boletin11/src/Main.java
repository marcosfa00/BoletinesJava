import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodos metodo = new Metodos();
        int j = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE NUMERO DE JUGADORES 1 O 2?"));
        double random =  Math.random() * 51 +1;
        int num;
        if (j == 1){
            num =(int) random;
            metodo.setNum(num);
        }else {
            num = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL NÚMERO QUE SE VA HA ADIVINAR"));
            metodo.validarNum(num);
            num = metodo.getNum();
        }
        int intentos = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN NÚMERO MÁXIMO DE INTENTOS"));
        metodo.validarIntentos(intentos);
        intentos = metodo.getIntentos();
        int i = 0;
        do {

            int adv_num = Integer.parseInt(JOptionPane.showInputDialog("ADIVINA EL NUMERO"));
          metodo.primeraPista(adv_num);
          if (metodo.getAdivinar()){
              i += intentos;
          }
            i++;

        }while (i < intentos);


    }
}