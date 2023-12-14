package U3.Array;

import java.util.Scanner;

public class Introduce10numerosYMuestreInverso {


    /*
    Escribe un programa que lea 10 números por teclado y que luego
    los muestre en orden inverso, es decir, el primero que se
    introduce es el último en mostrarse y viceversa.
     */

    public static void main(String[] args) {
        // Declaración del array para almacenar los 10 números
        int[] numeros = new int[10];

        // Objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduzca 10 números enteros.");
        System.out.println("Pulse la tecla INTRO después de introducir cada número.");

        // Bucle para leer los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Cierre del Scanner para evitar fugas de recursos
        scanner.close();

        System.out.println("\nLos números introducidos, al revés, son los siguientes:");

        // Bucle para mostrar los números en orden inverso
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

