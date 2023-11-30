package U3.entregable20_21;

import java.util.Random;
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión del Array: ");
        int n = scanner.nextInt();
        scanner.close();

        int[][] array = new int[n][n];

        // Rellenar el array con números aleatorios
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(101) + 100;
            }
        }

        // Mostrar el array original
        System.out.println("Array original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Rotar el array 90 grados
        System.out.println("\nArray rotado 90 grados:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[n - 1 - j][i] + " ");
            }
            System.out.println();


        }

    }
}
