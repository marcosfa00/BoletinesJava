import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Icon icon = new ImageIcon("./src/negro.jpg");
        JOptionPane.showMessageDialog(null, "", "Titulo", JOptionPane.QUESTION_MESSAGE, icon);
        Condicionales edad = new Condicionales();


        String e = JOptionPane.showInputDialog("Introduzca la edad");
        int num = Integer.parseInt(e);
        edad.consultaEdad(num);
        edad.operarEdade(num);
    }
}