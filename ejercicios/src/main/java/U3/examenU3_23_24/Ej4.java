package U3.examenU3_23_24;

import java.util.Scanner;

public class Ej4 {

    /*

        Desarrollar una función que se denomine insertarFilaEnMatriz. Dicha función tendrá el siguiente prototipo:

        public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos)
        Recibirá como parámetro un vector bidimensional de Strings, un array unidimensional de Strings y una posición.
        Devolverá como resultado un array bidimensional en el que esté insertado como una nueva fila en la matriz el
        array en la posición que se indica.

        Se deberá imprimir la matriz antes y después de insertar la fila.

        NOTA: Las filas de la matriz deben tener el mismo número de elementos. No es necesario comprobarlo, como tampoco
        es necesario comprobar que la posición pasada es válida, se entenderá que el usuario pasa una posición válida.

        Ejemplo 1:

            matriz = {
                  {"a","b","c"},
                  {"d","e","f"},
                  {"g","h","i"}
                }
            fila = {"j","k","l"}
            pos = 1
        El resultado de insertarFilaEnMatriz será:

            {
            {"a","b","c"},
            {"j","k","l"},
            {"d","e","f"},
            {"g","h","i"}
            }

     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matriz1 = {
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"}
        };


        int cantidadletras = 3;
        String letra = null;

        // Crear un array para almacenar las letras
        char[] nuevaFila = new char[cantidadletras];

        System.out.println("Introduzca los elementos de la nueva fila de la matriz ");

        // Solicitar al usuario que ingrese las letras
        for (int i = 0; i < cantidadletras; i++) {

            System.out.print("Ingrese la letra #" + (i + 1) + ": ");
            //nuevaFila[letra] = scanner.next();
        }

        // Mostrar los números en el orden inverso al introducido
        System.out.println("\nLas letras son:");

        for (int i = 0; i < cantidadletras; i++) {
            System.out.println(nuevaFila[i]);

        }

        char[][] matriz = new char[3][3];
    }


    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {


        return null;
    }
}










