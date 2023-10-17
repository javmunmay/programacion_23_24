package U1.tarea6;

import java.util.Scanner;

public class ejercicio3 {

    //Crea un programa que pida un número entero al usuario y dé a una variable
    //par el valor 1 si ese número es par o el valor 0 si no es par. Hazlo primero con un "if"
    //y luego con un "operador condicional"

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int numeroEntero = teclado.nextInt();

        int resultado = numeroEntero % 2;

        if (resultado == 0) {

            System.out.println("Valor: 1");


        } else {
            System.out.println("Valor: 0");

        }


    }
}
