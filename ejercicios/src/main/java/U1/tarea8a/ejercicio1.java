package U1.tarea8a;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        //Diseñar un programa que muestre, para cada número introducido por teclado,
        //si es par, si es positivo, y su cuadrado. El proceso terminará cuando el número
        //introducido por teclado sea 0.

        Scanner teclado = new Scanner(System.in);

        int numero;

        do {

            System.out.println("Introduce un numero: ");
            numero = teclado.nextInt();


            if (numero != 0) {

                if (numero % 2 == 0) {

                    System.out.println("Es par ");

                } else {
                    System.out.println("Es impar ");
                }


                if (numero >= 0) {


                    System.out.println("El número es positivo ");
                } else {
                    System.out.println("Es negativo ");
                }

                int cuadrado = numero * numero;

                System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

            }


        } while (numero != 0);

        System.out.println("Programa finalizado ");


    }
}
