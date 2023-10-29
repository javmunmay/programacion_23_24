package U1.examen2021Tarde;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de filas para la pirámide: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Imprimir espacios en blanco
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Imprimir números ascendentes
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Imprimir números descendentes
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }

            // Ir a la siguiente línea después de imprimir la fila
            System.out.println();
        }

        scanner.close();
    }
}
