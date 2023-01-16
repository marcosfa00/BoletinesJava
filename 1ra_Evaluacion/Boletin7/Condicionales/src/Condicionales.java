public class Condicionales {
    public void consultaEdad(int edad){
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }

    public void operarEdade(int edad){
        String result = (edad >= 18)?"maior":"menor";
        System.out.println(result);


    }
}
