import java.sql.SQLOutput;

public class Carrefour {
    private String nombre;
    private int n_ventas;

    private String tipo;

    public Carrefour(String nombre,int n_ventas){
        this.nombre = nombre;
        this.n_ventas = n_ventas;
    }
    public Carrefour(){

    }

    public String getNombre() {
        return nombre;
    }

    public int getN_ventas() {
        return n_ventas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setN_ventas(int n_ventas) {
        this.n_ventas = n_ventas;
    }

    public int ponerTipo(Carrefour producto){
        return 1;
    }

    //Methods

    public void tipoArticulo(){
        if(this.n_ventas <= 100){
            this.tipo = "Bajo";
            System.out.println("Las "+this.nombre+" son un tipo de articulo de consumo" + this.tipo);
        } else if (this.n_ventas < 100 && this.n_ventas<=500) {
            this.tipo = "Medio";
            System.out.println("Las "+this.nombre+" son un tipo de articulo de consumo" + this.tipo);
        } else if (this.n_ventas >500 && this.n_ventas<=1000 ) {
            this.tipo = "Alto";
            System.out.println("Las "+this.nombre+" son un tipo de articulo de consumo" + this.tipo);
        }else {
            this.tipo = "Primera Necesidad";
            System.out.println("Las "+this.nombre+" son un tipo de articulo de consumo" + this.tipo);
        }
    }


















}
