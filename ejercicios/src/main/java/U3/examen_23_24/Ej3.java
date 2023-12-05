package U3.examen_23_24;

import java.util.Arrays;
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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el numero de filas: ");
        int fila = scanner.nextInt();

        System.out.print("Introduzca el numero de columnas: ");
        int columna = scanner.nextInt();

        int[][] vector = crearElVector(fila, columna); //fila era tamanno

        System.out.println("El vector original es: " + Arrays.toString(vector));

        int[] resultado = paresEIpares(vector);
        System.out.println("El vector con pares al principio y luego impares es: " + Arrays.toString(resultado));
    }

    public static int[][] crearElVector(int [][] vector) {

        int[][] vector1 = new int[fila][columna];
        Random random = new Random();

        for (int i = 0; i < vector1; i++) {
            vector1[i] = random.nextInt(65) + 14; // Cea los numeros aleatorios entre el 14 y el 78
        }

        return vector1;
    }

    public static int[] paresEIpares(int[][] vector) {
        int[][] pares = Arrays.stream(vector).filter(num -> num % 2 == 0).toArray();
        int[][] impares = Arrays.stream(vector).filter(num -> num % 2 != 0).toArray();

        int[] resultado = new int[vector.length];
        System.arraycopy(pares, 0, resultado, 0, pares.length);
        System.arraycopy(impares, 0, resultado, pares.length /* Posicion inicial */, impares.length/* Posicion final */);

        /*
        APUNTES

        System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

        src: El array fuente del cual copiar elementos.
        srcPos: La posición inicial en el array fuente desde donde comenzar a copiar.
        dest: El array destino donde copiar los elementos.
        destPos: La posición inicial en el array destino donde se copiarán los elementos.
        length: El número de elementos a copiar.

        */


        return resultado;
    }








}
