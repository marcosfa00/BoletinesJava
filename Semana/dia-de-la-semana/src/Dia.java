public class Dia {

    public static void diaSemana(int num ){
        if(num == 1){
            System.out.println("Lunes");
        } else if (num == 2) {
            System.out.println("Martes");
        } else if (num==3) {
            System.out.println("Miercoles");
        } else if (num==4) {
            System.out.println("Jueves");
        } else if (num==5) {
            System.out.println("Viernes");
        } else if (num==6) {
            System.out.println("Sábado");
        } else if (num==7) {
            System.out.println("Domingo");
        }else {
            System.out.println("No se corresponde a ningun día de la semana");
        }
    }
}
