package U3.entregable23_24;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej1 {

    /*

    JAVIER MUÑOZ MAYORGA


    Escribir una programa que solicitando el tamaño al usuario nos cree un array o
    vector de dicho tamaño cuyo contenido serán números aleatorios en 18 y 65
    (ambos inclusive).

    A continuación crear una función paresImpares que:

    Reciba dicho vector
    Devuelva un vector con los pares al principio y los impares posteriormente
    respetando el orden de aparición en cada subgrupo ( pares - impares)

     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el tamaño del vector: ");
        int tamanno = scanner.nextInt();

        int[] vector = crearElVector(tamanno);

        System.out.println("El vector original es: " + Arrays.toString(vector));

        int[] resultado = paresEIpares(vector);
        System.out.println("El vector con pares al principio y luego impares es: " + Arrays.toString(resultado));
    }

    public static int[] crearElVector(int tamanno) {
        int[] vector1 = new int[tamanno];
        Random random = new Random();

        for (int i = 0; i < tamanno; i++) {
            vector1[i] = random.nextInt(48) + 18; // Cea los numeros aleatorios entre el 18 y el 65
        }

        return vector1;
    }

    public static int[] paresEIpares(int[] vector) {
        int[] pares = Arrays.stream(vector).filter(num -> num % 2 == 0).toArray();
        int[] impares = Arrays.stream(vector).filter(num -> num % 2 != 0).toArray();

        int[] resultado = new int[vector.length];
        System.arraycopy(pares, 0, resultado, 0, pares.length);
        System.arraycopy(impares, 0, resultado, pares.length /* Posicion inicial */, impares.length/* Posicion final */);

        /*
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





