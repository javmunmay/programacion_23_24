package U1.tarea5b;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        //Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero1 = teclado.nextInt();

        if (numero1 % 2 == 0) {
            System.out.println("El numero introducido es par");
        } else {
            System.out.println("El numero NO es par");
        }

        if (numero1 % 5 == 0) {
            System.out.println("El número introducido es divisible entre 5");
        } else {
            System.out.println("El numero NO es divisible entre 5");
        }


    }
}
