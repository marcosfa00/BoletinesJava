public class Metodo {
    public double calcularAreaR(double base, double altura){
        return Math.abs(base*altura);
    }

    public double calcularAreaTr(double base,double altura){
        return  Math.abs(base*altura/2);
    }

    public double calcularAreaC(double r){
        return Math.abs(Math.PI * Math.pow(r,2));
    }
}
