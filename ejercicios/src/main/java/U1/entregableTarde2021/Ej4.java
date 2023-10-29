package U1.entregableTarde2021;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
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
