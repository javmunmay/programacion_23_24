package U3.examenU3_23_24;


import java.util.Random;
import java.util.Scanner;

public class Ej3 {


    /*

        Realiza un programa que muestre por pantalla un array bidimensional con tantas filas y columnas como indique el
        usuario. Deberá rellenarse la matriz con números aleatorios entre 14 y 78 (ambos incluidos).

        A continuación, el programa debe insertar en un array pares los números que se encuentran en la intersección de
        las filas pares con las columnas pares. Se hace lo mismo para el array impares con los números que se encuentran
        en la intersección de las filas impares con las columnas impares.

        Finalmente se debe mostrar la matriz de números, el array de números pares, el de números impares, y la suma,
        media y máximo y mínimo de cada uno de los arrays pares e impares.

        Ejemplo 1:

        Introduce el número de filas: 5
        Introduce el número de columnas: 8

        Matriz:
        [69, 17, 51, 49, 28, 45, 38, 28]
        [67, 78, 60, 44, 78, 47, 18, 40]
        [38, 48, 15, 67, 65, 56, 34, 51]
        [42, 52, 27, 75, 39, 14, 57, 63]
        [47, 22, 61, 26, 63, 46, 50, 31]

        Pares:
        [69, 51, 28, 38, 38, 15, 65, 34, 47, 61, 63, 50]

        Impares:
        [78, 44, 47, 40, 52, 75, 14, 63]

        Suma de pares: 559
        Suma de impares: 413
        Media de pares: 46
        Media de impares: 51
        Máximo de pares: 69
        Mínimo de pares: 15
        Máximo de impares: 78
        Mínimo de impares: 14
        */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduce el número de filas: ");
        int filas = sc.nextInt();

        System.out.println("Introduce el número de columnas: ");
        int columnas = sc.nextInt();

        // Declarar e inicializar la matriz con números aleatorios
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(65) + 14; // Números aleatorios entre 14 y 78
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz:");
        mostrarMatriz(matriz);

        // Crear arrays para pares e impares
        int[] pares = obtenerNumeros(matriz, true);
        int[] impares = obtenerNumeros(matriz, false);

        // Mostrar arrays de pares e impares
        System.out.println("\nPares:");
        mostrarArray(pares);

        System.out.println("\nImpares:");
        mostrarArray(impares);

        // Calcular y mostrar la suma, media, máximo y mínimo de pares e impares
        mostrarEstadisticas("Pares", pares);
        mostrarEstadisticas("Impares", impares);
    }

    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para obtener números pares o impares de la matriz
    public static int[] obtenerNumeros(int[][] matriz, boolean esPar) {
        int contador = 0;
        // Contar la cantidad de números pares o impares para determinar el tamaño del array
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((matriz[i][j] % 2 == 0) == esPar) {
                    contador++;
                }
            }
        }

        // Crear el array para almacenar los números pares o impares
        int[] resultado = new int[contador];
        contador = 0; // Reiniciar el contador

        // Llenar el array con los números pares o impares
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((matriz[i][j] % 2 == 0) == esPar) {
                    resultado[contador] = matriz[i][j];
                    contador++;
                }
            }
        }

        return resultado;
    }

    // Método para mostrar un array
    public static void mostrarArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Método para calcular y mostrar estadísticas
    public static void mostrarEstadisticas(String tipo, int[] array) {
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int numero : array) {
            suma += numero;
            maximo = Math.max(maximo, numero);
            minimo = Math.min(minimo, numero);
        }

        double media = (double) suma / array.length;

        System.out.println("Suma de " + tipo + ": " + suma);
        System.out.println("Media de " + tipo + ": " + media);
        System.out.println("Máximo de " + tipo + ": " + maximo);
        System.out.println("Mínimo de " + tipo + ": " + minimo);
    }
}

