public class Main {
    public static void main(String[] args) {
        System.out.println("EL EMOCIONANTE PROGRAMA DE LAS VENTAS DEL CARREFOUR");
    Carrefour patatillas = new Carrefour();
    patatillas.setNombre("Lays Gourmet");
    patatillas.setN_ventas(600);
    Carrefour zumo = new Carrefour();
    zumo.setNombre("Don simon");
    zumo.setN_ventas(10);

    Carrefour Monster = new Carrefour("Monster energy", 40000);

    Monster.tipoArticulo();





    }
}