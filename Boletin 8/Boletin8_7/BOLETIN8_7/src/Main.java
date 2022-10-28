import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
    Metodo rectangulo = new Metodo();


    Metodo triangulo = new Metodo();


    Metodo circulo = new Metodo();

        System.out.println("Que ejercicio quieres ver");
        int ej = sc.nextInt();
    switch (ej){
        case 1:
            double area = rectangulo.calcularAreaR(7,5);
            System.out.println(area);
            break;
        case 2:
            System.out.println(triangulo.calcularAreaTr(3,4));
                    break;
        case 3:
            System.out.println(circulo.calcularAreaC(4));
            break;
        default:
            System.out.println("esta mal");
            break;

    }
    }
}