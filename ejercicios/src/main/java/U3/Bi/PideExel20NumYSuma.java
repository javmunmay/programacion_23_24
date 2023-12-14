package U3.Bi;

import java.util.Scanner;

public class PideExel20NumYSuma {

    /**
     * 7.2 Arrays bidimensionales
     * <p>
     * 2. Escribe un programa que pida 20 números enteros.
     * Estos números se deben introducir en un array de 4 filas por 5 columnas.
     * El programa mostrará las sumas parciales de filas y columnas igual que
     * si de una hoja de cálculo se tratara.
     * La suma total debe aparecer en la esquina inferior derecha.
     */


    public static void main(String[] args) {

        int[][] num = new int[4][5]; // array de 4 filas por 5 columnas
        Scanner scanner = new Scanner(System.in);

        // Lee los datos de teclado
        System.out.println("Por favor, introduzca los números (enteros) en el array");
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print("Fila " + fila + ", columna " + columna + ": ");
                num[fila][columna] = scanner.nextInt();
            }
        }

        System.out.println();

        // Muestra los datos y las sumas parciales de las filas
        for (int fila = 0; fila < 4; fila++) {
            int sumaFila = 0;
            for (int columna = 0; columna < 5; columna++) {
                System.out.printf("%7d   ", num[fila][columna]);
                sumaFila += num[fila][columna];
            }
            System.out.printf("|%7d\n", sumaFila);
        }

        // Muestra las sumas parciales de las columnas
        for (int columna = 0; columna < 5; columna++) {
            System.out.print("----------");
        }
        System.out.println("-----------");

        int sumaTotal = 0;
        for (int columna = 0; columna < 5; columna++) {
            int sumaColumna = 0;
            for (int fila = 0; fila < 4; fila++) {
                sumaColumna += num[fila][columna];
            }

            sumaTotal += sumaColumna;
            System.out.printf("%7d   ", sumaColumna);
        }
        System.out.printf("|%7d   ", sumaTotal);

        scanner.close(); // Cierra el scanner para evitar fugas de recursos
    }
}

