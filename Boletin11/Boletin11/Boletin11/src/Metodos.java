import javax.swing.*;

public class Metodos {
    private  boolean adivinar = false;
    private int num;
    private int intentos;
    public boolean getAdivinar(){
        return this.adivinar;
    }
    public int getNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public int getIntentos(){
        return this.intentos;
    }
    public void primeraPista(int adv_num){

        if(num > adv_num){
            JOptionPane.showMessageDialog(null,"EL NUMERO ES MAYOR");
        }else if(num < adv_num) {
            JOptionPane.showMessageDialog(null,"EL NUMERO ES MENOR");
        }else {
            JOptionPane.showMessageDialog(null,"ADIVINASTE");
            this.adivinar = true;
        }

    }

    public void validarNum(int num){
        if (num < 1 || num > 50){
            do {
                JOptionPane.showMessageDialog(null,"¡¡COMO MINIMO 1 Y MÁXIMO 50!!");
                this.num = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN NÚMERO DEL 1 AL 50"));
            }while (this.num < 1 || this.num > 50);
        }else {
            this.num = num;
        }


    }
    public void validarIntentos(int intentos){
        if (intentos < 1 || intentos > 15){
            do {
                JOptionPane.showMessageDialog(null,"¡¡ALAAA A DONDE VÁS, CÓMO MÁXIMO 15 INTENTOS!!");
                this.intentos = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL NÚMERO MÁXIMO DE INTENTOS"));
            }while (this.intentos < 1 || this.intentos > 15);
        }else {
            this.intentos = intentos;
        }
    }




}
