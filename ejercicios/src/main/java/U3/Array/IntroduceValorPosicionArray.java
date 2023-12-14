package U3.Array;

import java.util.Scanner;

public class IntroduceValorPosicionArray {

    /*
    Crea un array n de 12 elementos e inicializa cada elemento con un valor aleatorio entre 0 y 200.
    Muestra el array original, imprimiendo los índices y los valores correspondientes.
    Solicita al usuario que introduzca un número.
    Pide al usuario que introduzca la posición donde desea insertar el número en el array (un índice entre 0 y 11).
    Inserta el número en la posición especificada y desplaza los elementos restantes a la derecha para hacer espacio para el nuevo número.
    Muestra el array resultante después de la inserción, imprimiendo nuevamente los índices y los valores correspondientes.
     */


    public static void main(String[] args) {

        // Crea el array con valores aleatorios
        int[] n = new int[12];

        for (int i = 0; i < 12; i++) {
            n[i] = (int) (Math.random() * 201);
        }

        // Muestra el array original
        System.out.println("Array original:");

        System.out.print("\nÍndice ");

        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", i);
        }

        System.out.print("\nValor  ");

        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", n[i]);
        }

        // Pide el número y la posición donde colocarlo
        Scanner s = new Scanner(System.in);

        System.out.print("\n\nIntroduzca el número que quiere insertar: ");
        int numero = Integer.parseInt(s.nextLine());

        System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
        int posicion = Integer.parseInt(s.nextLine());

        // Inserta el número y desplaza el resto hacia la derecha
        for (int i = 11; i > posicion; i--) {
            n[i] = n[i - 1];
        }

        n[posicion] = numero;

        // Muestra el resultado
        System.out.println("\nArray resultado:");

        System.out.print("\nÍndice ");

        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", i);
        }

        System.out.print("\nValor  ");

        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", n[i]);
        }
    }

}

