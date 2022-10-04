public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Scanner sc = new Scanner(System.in);
        /*Dado o seguinte polinomio de de segundo grao :
Y = a X^2 + bX + c 
Crea un programa que pida os coeficientes a, b, c , e o valor de x e calcule o valor de Y 
*/      System.out.println("Introduzca el valor de a");
        double a = sc.nextDouble();
        System.out.println("Introduzca el valor de b");
        double b = sc.nextDouble();
        System.out.println("Introduzca el valor de c");
        double c = sc.nextDouble();
        //ecuacion segundo grado --> x= -b +- Math.sqrt(b^2-4ac)/2a
        double x_1= 0;
        double x_2 = 0;
        double raiz = Math.sqrt(Math.pow(b, 2) - 4*a*c);
         System.out.println("raiz vale" + raiz);
        if(Double.isNaN(raiz) == true){
            System.out.println("la ecuación solo tiene una solucion");
            raiz = 0;
        }
        x_1 = (-b + raiz)/2 * a;
        x_2 = (-b - raiz)/2 * a;
        System.out.println("Los valores de x son: " + x_1 + "  "+x_2);
        // a continuación calcularemos el valor de Y
        double y = 0;
        double y_1 = 0;
        if(x_1 == x_2){
            System.out.println("la ecuación solo tiene 1ª solución ");
            y = a * Math.pow(x_1, 2) + b * x_1 + c;
            System.out.println("El valor de Y es: " + y);
        }else{
            y = a * Math.pow(x_1, 2) + b * x_1 + c;
            y_1 = a * Math.pow(x_2, 2) + b * x_2 + c;
            System.out.println("Los valores de y son " + y + " & " +y_1);
        }
        
    }