import java.util.Scanner;

public class Metodos {
    private int base;
    private int altura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public static void darValores(int[] numeros){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca un numero");
            numeros[i] += sc.nextInt();

        }
        for (int i = 0; i < numeros.length; i+=2) {
            numeros[i] *= -1;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static void contarPoN(int[] numeros){
        byte contador = 0;
        byte contador0 = 0;
        byte contadorN = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0){
                contador0+=1;
            }
            if (numeros[i] > 0){
                contador +=1;
            }
            if(numeros[i] < 0){
                contadorN +=1;
            }
        }
        System.out.println();
        System.out.println("numeros positivos hay: " + contador);
        System.out.println("numeros negativos hay:" + contadorN);
        System.out.println("numeros 0 hay " + contador0);
    }


    public static void sumar(int[] numeros2){
        int suma =0;
        int producto = 1;
        for (int i = 0; i <numeros2.length; i++) {
            numeros2[i] += 10 +i;
            System.out.print(numeros2[i] + " ");
            suma += numeros2[i];
            producto = numeros2[i] * (i +10);
        }
        System.out.println();
        System.out.println("la suma es: "+suma);
        System.out.println("la multiplicacion es: " + producto);
    }


    public void validarBase(int base){
        Scanner sc = new Scanner(System.in);
        if (base <=0){
            do {
                System.out.println("Introduce una base positiva");
                base = sc.nextInt();
            }while (base <= 0);
        }else {
            this.base = base;
        }



    }
    public void validarAltura(int altura){
        Scanner sc = new Scanner(System.in);
        if (altura <=0){
            do {
                System.out.println("Introduce una altura positiva");
                altura = sc.nextInt();
            }while (altura <= 0);
        }else {
            this.altura = altura;
        }
    }

    public static void multiplicar(){
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un numero");
            num = sc.nextInt();
            for (int i = 0; i < 10; i++) {
                System.out.println(num +" x "+ i + " = " +(num * i));
            }
        }while (num > 0 || num < 0);
    }

    public static void sueldo(){
        Scanner sc = new Scanner(System.in);
        int sueldo;
        int contador = 0;
        int contadorMenosMil =0;
        int porcentage = 0;
        do {
            System.out.println("introduzca su sueldo");
            sueldo = sc.nextInt();
            if (sueldo >= 1000 && sueldo <= 1750){
                contador += 1;
            }
            if (sueldo < 1000){
                contadorMenosMil +=1;
            }
        }while (sueldo != 0);

        porcentage = contadorMenosMil / ( contador + contadorMenosMil) *100;
        System.out.println("el numero de trabajadores que ganan entre 1000 y 1750 es de: " + contador);
        System.out.println("El porcentaje de trabajadores que ganan Menos de 1000 € es de" + porcentage);
    }






}
