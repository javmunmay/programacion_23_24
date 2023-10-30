package U1.entregableTarde2021;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        //Escribe un programa que pida un número entero positivo por teclado y que
        //muestre a continuación los 5 números consecutivos a partir del número
        //introducido (incluyendo él mismo). Al lado de cada número se debe indicar
        //si se trata de un primo o no.
        //
        //Ejemplo:
        //Por favor, introduzca un número entero positivo: 17
        //17 es primo
        //18 no es primo
        //19 es primo
        //20 no es primo
        //21 no es primo

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número entero positivo
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numero = scanner.nextInt();

        // Validar que el número sea positivo
        while (numero <= 0) {
            System.out.println("Por favor, introduzca un número entero positivo.");
            System.out.print("Por favor, introduzca un número entero positivo: ");
            numero = scanner.nextInt();
        }

        // Mostrar los 5 números consecutivos y determinar si son primos usando bucles
        for (int i = 0; i < 5; i++) {
            int numeroActual = numero + i;
            boolean esPrimo = true;

            // Verificar si el número actual es primo
            if (numeroActual <= 1) {
                esPrimo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(numeroActual); j++) {
                    if (numeroActual % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            // Mostrar el resultado
            if (esPrimo) {
                System.out.println(numeroActual + " es primo");
            } else {
                System.out.println(numeroActual + " no es primo");
            }
        }

        scanner.close();

    }
}
