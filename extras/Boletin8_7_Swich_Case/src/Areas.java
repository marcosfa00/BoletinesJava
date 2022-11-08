public class Areas {

    public static double areaCirculo(double r){ //Pi.r^2
        double area = Math.PI* Math.pow(r,2);
        return area;
    }

    public static double areaCuadrado(double lado){ //l*l
        return Math.pow(lado,2);
    }

    public static double areaTriangulo(double base, double altura){
        return base * altura;
    }
}
