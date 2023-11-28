package U3.tarea3Arrays;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //Escribir una aplicación que solicite al usuario cuántos números desea introducir. A continuación,
        //se introducirá por teclado esa cantidad de números enteros, y por último, los mostrará en el
        //orden inverso al introducido.

        // Utilizar Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de números a introducir
        System.out.print("Ingrese cuántos números desea introducir: ");
        int cantidadNumeros = scanner.nextInt();

        // Crear un array para almacenar los números enteros
        int[] numeros = new int[cantidadNumeros];

        // Solicitar al usuario que ingrese los números
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números en el orden inverso al introducido
        System.out.println("\nLos números en orden inverso son:");

        for (int i = cantidadNumeros - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
