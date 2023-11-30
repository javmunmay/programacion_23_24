package U3.entregable20_21;

import java.util.ArrayList;
import java.util.Arrays;

public class Ej1 {
    //Crea la función filtraPrimos que:
    //
    //Recibe un array de enteros
    //Devuelve un array de enteros con todos los primos que se encuentran en el array origen
    //Obviamente, el tamaño del array que se devuelve será de una longitud menor o igual al que se pasa como parámetro.
    //Para facilitar el ejercicio aunque un número primo se repita lo añadiremos al vector. Si no existe ningún número
    //primo en el vector original, se devuelve un array con el número -1 como único elemento.

    public static void main(String[] args) {

        int[] arr = new int[]{10, 15, 2, 7, 25, 13, 18, 1, 12};
        arr = filtraPrimos(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] filtraPrimos(int[] arr) {
        ArrayList<Integer> primos = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (esPrimo(arr[i])) {
                primos.add(arr[i]);
            }
        }

        if (primos.isEmpty()) {
            primos.add(-1);
        }

        int[] arrPrimos = new int[primos.size()];
        for (int i = 0; i < primos.size(); i++) {
            arrPrimos[i] = primos.get(i);
        }

        return arrPrimos;
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }


}
