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

            int dif = Math.abs(num - adv_num) ;
            if (dif >20) {
                JOptionPane.showMessageDialog(null, "ESTÁS MUY LEJOS");
            }
            if (dif >= 10 &&  dif <=20 ){
                JOptionPane.showMessageDialog(null, "ESTÁS LEJOS");
            }
            if (dif < 10 && dif > 5 ){
                JOptionPane.showMessageDialog(null, "ESTÁS CERCA");
            }
            if (dif < 5 && dif >= 1){
                JOptionPane.showMessageDialog(null, "ESTÁS MUY CERCA");
            }

            if (num == adv_num){
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
