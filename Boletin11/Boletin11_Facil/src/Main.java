import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Metodos uno = new Metodos();
        int [] numeros = new int[10];
        //Metodos.darValores(numeros);

       // Metodos.contarPoN(numeros);


        //calcular la suma de los numeros entre 10 y 90

        int [] numeros2 = new int[81];
        Metodos.sumar(numeros2);

        //calcular area de rectangulo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base del rectangulo");
        int base = sc.nextInt();
        uno.validarBase(base);
        base = uno.getBase();

        System.out.println("Introduce la altura del rectangulo");
        int altura = sc.nextInt();
        uno.validarAltura(altura);
       altura= uno.getAltura();

        //Solicitar un numero y calcular tabla de multiplicar
        Metodos.multiplicar();


        //sueldo de los trabajadores
        Metodos.sueldo();




    }
}