import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el tamaño");
        int fil = sc.nextInt();
       Metodo met = new Metodo();
       met.triangulo(fil);

       met.trianguloEspejo(fil);
        met.trianguloEquilatero(fil);
        met.trianguloEqui(fil);
    }
}