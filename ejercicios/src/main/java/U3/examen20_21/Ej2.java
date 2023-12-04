package U3.examen20_21;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Ej2 {

    /*
    Realiza un programa que rellene un array de 5 filas por 9 columnas con números enteros positivos
    comprendidos entre 100 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición
    tanto del máximo como del mínimo.

    NOTA IMPORTANTE: Los números no pueden repetirse.
     */

    public static void main(String[] args) {
        // Crear la matriz y rellenarla con números no repetidos entre 100 y 1000
        int[][] matriz = generarMatriz(5, 9, 100, 1000);

        // Mostrar la matriz
        System.out.println("Matriz generada:");
        mostrarMatriz(matriz);

        // Encontrar la posición del máximo y del mínimo
        int[] posicionMaximo = encontrarPosicionMaximo(matriz);
        int[] posicionMinimo = encontrarPosicionMinimo(matriz);

        // Mostrar los resultados
        System.out.println("\nPosición del máximo: Fila " + posicionMaximo[0] + ", Columna " + posicionMaximo[1]);
        System.out.println("Posición del mínimo: Fila " + posicionMinimo[0] + ", Columna " + posicionMinimo[1]);
    }

    public static int[][] generarMatriz(int filas, int columnas, int rangoInicio, int rangoFin) {
        int[][] matriz = new int[filas][columnas];
        Set<Integer> numerosGenerados = new HashSet<>();

        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int numeroGenerado;
                do {
                    numeroGenerado = random.nextInt(rangoFin - rangoInicio + 1) + rangoInicio;
                } while (numerosGenerados.contains(numeroGenerado));

                matriz[i][j] = numeroGenerado;
                numerosGenerados.add(numeroGenerado);
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] encontrarPosicionMaximo(int[][] matriz) {
        int maximo = matriz[0][0];
        int[] posicionMaximo = {0, 0};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    posicionMaximo[0] = i;
                    posicionMaximo[1] = j;
                }
            }
        }

        return posicionMaximo;
    }

    public static int[] encontrarPosicionMinimo(int[][] matriz) {
        int minimo = matriz[0][0];
        int[] posicionMinimo = {0, 0};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                    posicionMinimo[0] = i;
                    posicionMinimo[1] = j;
                }
            }
        }

        return posicionMinimo;
    }

}
