public class Metodo {

    public void triangulo(int nfilas){

        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public void trianguloEspejo(int filas){
        for (int j = 0; j <10 ; j++) {
            for (int i = 0; i < 10 -j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public void trianguloEquilatero(int filas){
        for (int j = 0; j <10 ; j++) {
            for (int i = 0; i < 10 -j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (j *2)-1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void trianguloEqui(int filas){
        for (int j = 0; j <filas ; j++) {
            for (int i = 0; i < 10 -j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < j; i++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
