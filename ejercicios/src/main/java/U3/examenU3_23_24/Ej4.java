package U3.examenU3_23_24;


import java.util.Arrays;
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

        String[] fila = {"j", "k", "l"};
        int pos = 1;

        System.out.println(matriz1);

        System.out.println();

        String[][] resultado = insertarFilaEnMatriz(matriz1, fila, pos);

        mostrarMatriz(resultado);

    }


    public static String[][] insertarFilaEnMatriz(String[][] matriz1, String[] fila, int pos) {

        String[][] resultado = new String[matriz1.length + 1][matriz1[0].length]; //+1 para agregar 1 fila mas y 0 devuelve la
        // longitud de la primera fila eso se utiliza para determinar la longitud de cada fila en la nueva matriz resultado.


        int j = 0;
        for (int i = 0; i < resultado.length; i++) {
            if (i == pos) {
                resultado[i] = fila;
            } else {
                resultado[i] = matriz1[j];
                j++;
            }
        }

        return resultado;
    }

    public static void mostrarMatriz(String[][] matriz) {
        for (String[] strings : matriz) { //los dos puntos: ese bucle se repetirá tantas veces como filas tenga la matriz.
            System.out.println(Arrays.toString(strings));
        }

    }
}










