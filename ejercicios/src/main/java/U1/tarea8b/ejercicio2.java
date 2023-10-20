package U1.tarea8b;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        // Escribe un programa que muestre en tres columnas, el cuadrado y
        //el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.

        Scanner teclado = new Scanner(System.in);
        int contador = 0;

        do {

            System.out.println("Introduce un numero entero (5 nº en total): ");

            int numero = teclado.nextInt();

            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.println("El Nº " + numero + " su cuadrado: " + cuadrado + " su cubo: " + cubo);

            contador++;

        } while (contador != 5);


    }
}
