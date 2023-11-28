package U3.tarea3Arrays;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        //Diseñar un programa que solicite al usuario 5 números decimales. A continuación, debe mostrar
        //los números en el mismo orden en que se han introducido.

        // Crear un array para almacenar los números decimales
        double[] numeros = new double[5];

        // Utilizar Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese 5 números decimales
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número decimal #" + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Mostrar los números en el mismo orden que se ingresaron
        System.out.println("\nLos números ingresados son:");

        for (double numero : numeros) {
            System.out.println(numero);
        }


    }
}
