package U3.Array;

import java.util.Random;

public class RotarElementosDerecha1Posicion {

    /*
        Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los
        elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1,
        el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
        posición 0. Finalmente, muestra el contenido del array.
     */


    public static void main(String[] args) {
        int[] numeros = new int[15];

        System.out.println("Array original:");
        llenarAleatoriamente(numeros);
        mostrarArray(numeros);

        rotarDerechaUnaPosicion(numeros);

        System.out.println("\nArray rotado a la derecha una posición:");
        mostrarArray(numeros);
    }

    private static void llenarAleatoriamente(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
        }
    }

    private static void rotarDerechaUnaPosicion(int[] array) {
        int ultimoNumero = array[array.length - 1];
        System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = ultimoNumero;
    }

    private static void mostrarArray(int[] array) {
        for (int numero : array) {
            System.out.printf("|%3d ", numero);
        }
        System.out.println("|");
    }
}


