package U3.Array;

import java.util.LinkedHashSet;
import java.util.Arrays;

public class FuncionesEliminaRepetidos {

    /*
    Se define un array de cadenas a con algunas repeticiones.
    Se imprime el contenido del array original.
    Se llama al método eliminarRepetidos pasando el array original como argumento.
    Dentro del método eliminarRepetidos:
    Se utiliza un LinkedHashSet, que elimina automáticamente los duplicados y mantiene el orden de inserción.
    Se convierte el conjunto de nuevo en un array de cadenas utilizando el método toArray.
    El array resultante sin duplicados se devuelve.
    Se imprime el contenido del array resultante sin duplicados.
     */

    public static void main(String[] args) {
        final String[] a = {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA"};

        System.out.println("Original: " + Arrays.toString(a));
        String[] sinRepetir = eliminarRepetidos(a);
        System.out.println("Sin Repetir: " + Arrays.toString(sinRepetir));
    }

    public static String[] eliminarRepetidos(String[] s) {
        // Utiliza un conjunto LinkedHashSet para eliminar duplicados manteniendo el orden de aparición
        LinkedHashSet<String> conjunto = new LinkedHashSet<>(Arrays.asList(s));
        // Convierte el conjunto de nuevo a un array
        return conjunto.toArray(new String[0]);
    }
}


