package U3.entregable23_24;

public class Ej3 {

/*

    JAVIER MUÑOZ MAYORGA

    Realizar una función cuadradoMagico que:

    Reciba un vector bidimensional de enteros con el mismo número de filas que de columnas.
    Nos devuelva true si esa matriz es un cuadrado mágico, es decir si la suma de sus filas y sus columnas es siempre la misma.
    Ejemplo 1:

    Si la función recibe la siguiente matriz:



    Nos devolverá true. Todas las filas y columnas suman 65.

    Ejemplo2:

    Si la función recibe la siguiente matriz.



    Nos devolverá false

    Nota: Crear todas las funciones que estimes necesarias. Probar la función en el Main. Supondremos que siempre se recibe la matriz cuadrada.
*/


    public static void main(String[] args) {

        // Pruebas con la función cuadradoMagico
        int[][] matriz1 = {
                {4, 9, 2},
                {3, 5, 7},
                {8, 1, 6}
        };
        System.out.println("¿Es la primera matriz un cuadrado mágico? " + cuadradoMagico(matriz1));
        // Debería imprimir true

        int[][] matriz2 = {
                {5, 2, 1},
                {9, 3, 9},
                {3, 1, 4}
        };
        System.out.println("¿Es la segunda matriz un cuadrado mágico? " + cuadradoMagico(matriz2));
        // Debería imprimir false
    }

    public static boolean cuadradoMagico(int[][] matriz) {
        int n = matriz.length;
        int sumaFila = 0;


        // Primera fila (Referencia de las sumas)
        for (int j = 0; j < n; j++) {
            sumaFila += matriz[0][j];
        }

        // Todas las sumas igual a la referencia de antes
        // VERIFICA LAS FILAS EMPEZANDO POR LA SEGUNDA
        for (int i = 1; i < n; i++) {
            int sumaActual = 0;
            for (int j = 0; j < n; j++) {
                sumaActual += matriz[i][j];
            }
            if (sumaActual != sumaFila) {
                return false;
            }
        }

        // Ver si a suma de todas las COLUMNAS sea igual a la referencia
        for (int j = 0; j < n; j++) {
            int sumaActual = 0;
            for (int[] ints : matriz) {
                sumaActual += ints[j];
            }
            if (sumaActual != sumaFila) {
                return false;
            }
        }

        return true;
    }


}
