package U3.Array;

import java.util.Scanner;

public class CreaArrayTamannoYParImpar {


    public static void main(String[] args) {

        /*
        Solicita al usuario que introduzca el tamaño del array (n).
        Crea un array a de tamaño n y lo llena con números aleatorios entre 0 y 200.
        Muestra el array original con sus índices y valores.
        Crea un nuevo array r del mismo tamaño que el array original.
        Recorre el array original (a) y, en función del índice, coloca los elementos en el nuevo array (r) de manera alterna:
        Si el índice es par, coloca el elemento en la posición izquierda del nuevo array.
        Si el índice es impar, coloca el elemento en la posición derecha del nuevo array.
        Muestra el nuevo array resultado con sus índices y valores.
         */


        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca el tamaño del array: ");
        int n = Integer.parseInt(s.nextLine());

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 201);
        }

        System.out.println("\nArray original:");

        System.out.print("Indice ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%5d", i);
        }

        System.out.print("\nValor  ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%5d", a[i]);
        }

        int[] r = new int[n];
        int izquierda = 0;
        int derecha = n - 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                r[izquierda++] = a[i];
            } else {
                r[derecha--] = a[i];
            }
        }

        System.out.println("\n\nArray resultado:");

        System.out.print("Indice ");
        for (int i = 0; i < r.length; i++) {
            System.out.printf("%5d", i);
        }

        System.out.print("\nValor  ");
        for (int i = 0; i < r.length; i++) {
            System.out.printf("%5d", r[i]);
        }
    }

}

