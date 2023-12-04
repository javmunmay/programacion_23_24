package U3.entregable23_24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ej2 {

    /*

    JAVIER MUÑOZ MAYORGA

    Crear dos funciones que para que trabajen con arrays de una solo dimensión de enteros:

    La primera función duplicados:
    Recibe un vector de enteros
    Devuelve true si dentro hay algún elemento repetido o false en caso contrario.
    Ejemplo1:

    Si la función recibe [12,10,12,45,67] devolverá true

    Si la función recibe [11,12,13,14,15,16] devolverá false.

    La segunda función elimina duplicados:

    Recibe un vector de enteros.
    Devuelve dicho vector sin los elementos que están repetidos.
    Ejemplo2:

    Si la función recibe [12,10,12,45,67] devolverá [12,10,45,67]

    Si la función recibe [11,12,11,14,15,11] devolverá [11,12,14,15]

    Probar ambas funciones en el main. Puedes crear las funciones adicionales que estimes necesarias.

     */


    public static void main(String[] args) {

        int[] vector1 = {12, 10, 12, 45, 67};
        System.out.println("¿Hay duplicados en el primer vector? " + duplicados(vector1));
        // Imprime por pantalla true

        int[] vector2 = {11, 12, 13, 14, 15, 16};
        System.out.println("¿Hay duplicados en el segundo vector? " + duplicados(vector2));
        // Imprime por pantalla false

        // Esta funcion elimina los duplicados
        System.out.println();

        int[] resultado1 = eliminaLosDuplicados(vector1);
        System.out.println("Primer vector sin duplicados: " + Arrays.toString(resultado1));
        // En este caso imprime esto: [12, 10, 45, 67]

        int[] resultado2 = eliminaLosDuplicados(vector2);
        System.out.println("Segundo vector sin duplicados: " + Arrays.toString(resultado2));
        // En este caso imprime esto: [11, 12, 13, 14, 15, 16]
    }

    public static boolean duplicados(int[] vector) {
        Set<Integer> conjunto = new HashSet<>();

        for (int num : vector) {
            if (!conjunto.add(num)) {
                return true;
            }
        }

        return false;
        // No hay duplicados
    }

    public static int[] eliminaLosDuplicados(int[] vector) {
        Set<Integer> conjunto = new HashSet<>();
        int[] resultado = new int[vector.length];
        int contador = 0;

        for (int num : vector) {
            if (conjunto.add(num)) {
                resultado[contador++] = num;
            }
        }

        return Arrays.copyOf(resultado, contador);

        /*
        ¡SON APUNTES, NO HACER CASO!

        return Arrays.copyOf(resultado, contador);
        significa que se está devolviendo una copia del array resultado
        con una longitud igual a contador.

        Desglosado:

        resultado: El array original que se va a copiar.
        contador: La longitud del nuevo array será igual al valor
        actual de contador.

        Entonces, si contador es 3, por ejemplo, se devolverá un nuevo
        array que contiene los primeros 3 elementos de resultado.
         */


    }


}
