import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Areas figura = new Areas();
        System.out.println("QUE AREA DESEAS CALCULAR? 1. CUADRADO 2. TRIANGULO 3.CIRCULO");
        byte opcion = sc.nextByte();
        switch (opcion){
            case 1:
                System.out.println("Introduzca el radio");
                double radio = sc.nextDouble();
                double circulo = Areas.areaCirculo(radio);
                System.out.println(circulo);
                break;

            case 2:
                System.out.println("Introduzca el lado");
                double lado = sc.nextDouble();
                double cuadrado = Areas.areaCuadrado(lado);
                System.out.println(cuadrado);
                break;

            case 3:
                System.out.println("Introduzca la base del Triangulo");
                double base = sc.nextDouble();
                System.out.println("Introduzca la altura del Triangulo");
                double altura = sc.nextDouble();
                double triangulo = Areas.areaTriangulo(base,altura);
                System.out.println(triangulo);
                break;

            default:
                System.out.println("ERROR");
        }
    }
}