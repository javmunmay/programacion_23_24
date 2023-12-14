package U3.examen20_21Tarde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Ej3 {

    /*

        Crea la función de manejo de vectores que tenga la siguiente
        cabecera y que haga lo que se especifica en los comentarios:

        public int[] filtraCon4(int x[])

        // Devuelve un array con todos los números
        // que contienen el 4 (por ej. 4, 24, 482)
        // que se encuentren en otro array que se
        // pasa como parámetro. El tamaño del array
        // que se devuelve será menor o igual al
        // que se pasa como parámetro.

        Utiliza esta función en un programa para comprobar que funcionan bien.
        Para que el ejercicio resulte más fácil, las repeticiones de números que
        contienen 4 se conservan; es decir, si en el array x el número 845 se repite
        3 veces, en el array devuelto también estará repetido 3 veces. Si no existe
        ningún número que contiene 4 en el array x, se devuelve un array con el número
        -1 como único elemento.


     */


    public static void main(String[] args) {
        int[] arrayOriginal = {123, 456, 789, 24, 845, 482, 999, 888, 124, 777};

        // Utilizar la función filtraCon4
        int[] resultado = filtraCon4(arrayOriginal);

        // Mostrar el resultado
        System.out.println("Array original: " + Arrays.toString(arrayOriginal));
        System.out.println("Array filtrado con números que contienen el 4: " + Arrays.toString(resultado));
    }

    public static int[] filtraCon4(int[] x) {
        List<Integer> numerosCon4 = new ArrayList<>();

        for (int num : x) {
            if (contiene4(num)) {
                numerosCon4.add(num);
            }
        }

        // Convertir la lista a un array
        int[] resultado = new int[numerosCon4.size()];
        for (int i = 0; i < numerosCon4.size(); i++) {
            resultado[i] = numerosCon4.get(i);
        }

        return (resultado.length > 0) ? resultado : new int[]{-1}; // si el resultado no esta vacio es true si esta
        // vacio es false y devuelve la array con el valor -1
    }

    // Función auxiliar para verificar si un número contiene el dígito 4
    private static boolean contiene4(int num) {
        while (num != 0) {
            if (num % 10 == 4) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

}
