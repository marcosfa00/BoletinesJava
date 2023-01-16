public class Metodos {

    public void cuantasCifras(int num){
        if (num > 9 && num <= 99){
            System.out.println("Tiene 2 cifras");
        } else if (num > 99 && num <= 999) {
            System.out.println("Tiene 3 cifras");
        } else if (num > 999 && num <= 9999) {
            System.out.println("Tiene 4 cifras");
        } else if (num > 9999 && num <= 99999 ) {
            System.out.println("Tiene 5 cifras");
        }else {
            System.out.println("Tiene 1 cifra");
        }
    }


    

    public void bucle (){
        int i = 1;
        int suma = 0;
        int multi = 1;
        while (i < 11){
            if(i%2 == 0){
                suma+= i;
            }else{
                multi *= i;
            }
            i++;
        }

        System.out.println("la suma de los numeros pares es: "+ suma);
        System.out.println("La multiplicacion de los impares es " +multi);
    }

    public void bucleSwitch(){
        int i =1;
        int suma = 0;
        int multi =1;
        int swich_par = 0;
        while (i<11){
            if (swich_par != 0){
                suma += i;
                swich_par = 0;
            }else {
                multi *= i;
                swich_par = 1;
            }
            i++;
        }

        System.out.println("la suma es " + suma);
        System.out.println("La multi es " + multi);

    }
}
