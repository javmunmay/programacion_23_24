package U1.ExamenManana;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //Realizar un conversor del sistema decimal al sistema de asteriscos que sustituye cada cifra por un número correspondiente de asteriscos (*) y separa las cifras con un guión.
        //
        //Ejemplo 1:
        //
        //Introduce un número:
        //
        //4351
        //
        //El número 4351 traducido al sistema de asteriscos es:
        //
        //****-***-*****-*


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        String resultado = "";

        while (num != 0) {

            int numerodado = num % 10;


            while (numerodado > 0) {
                resultado = "*" + resultado;
                numerodado--;
            }


            num = num / 10;

            if (num != 0) {
                resultado = "_" + resultado;
            }
        }

        System.out.println(resultado);

    }
}
