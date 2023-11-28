package U3;

import java.util.Random;
public class tarea3 {
    public static void main(String[] args) {
        Random random = new Random();
        // Generar la matriz de números aleatorios
        int[][] matrix = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = random.nextInt(401) + 500;
            }
        }

        // Obtener los números de la diagonal
        int[] diagonal = new int[9];
        for (int i = 0; i < 9; i++) {
            diagonal[i] = matrix[i][i];
        }

        // Calcular y mostrar las estadísticas de la diagonal
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        double sum = 0;
        for (int number : diagonal) {
            maximum = Math.max(maximum, number);
            minimum = Math.min(minimum, number);
            sum += number;
        }
        double mean = sum / diagonal.length;

        System.out.println("Matriz de números aleatorios:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal:");
        for (int number : diagonal) {
            System.out.print(number + " ");
        }
        System.out.println("Máximo: " + maximum);
        System.out.println("Mínimo: " + minimum);
        System.out.println("Media: " + mean);
    }
}
