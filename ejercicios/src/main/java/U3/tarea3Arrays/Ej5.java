package U3.tarea3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        //Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar.
        //Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos tablas en una
        //tercera, de forma que los 12 números sigan ordenados. Fusionar significa copiar en el orden
        //correcto para que los datos resultantes continúen ordenados sin necesidad de volver a realizar una ordenación.

        //NO CARGA O TARDA EN CARGAR

        Scanner scanner = new Scanner(System.in);

        // Leer y almacenar los primeros 6 enteros
        int[] arr1 = new int[6];
        for (int i = 0; i < 6; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Leer y almacenar los siguientes 6 enteros
        int[] arr2 = new int[6];
        for (int i = 0; i < 6; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Ordenar y mostrar las dos tablas
        Arrays.sort(arr1);
        System.out.println("Primera tabla ordenada: " + Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println("Segunda tabla ordenada: " + Arrays.toString(arr2));

        // Fusionar las dos tablas
        int[] arr3 = new int[12];
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[i + j] = arr1[i];
                i++;
            } else {
                arr3[i + j] = arr2[j];
                j++;
            }
        }

        // Copiar los elementos restantes
        while (i < arr1.length) {
            arr3[i + j] = arr1[i];
            i++;
        }

        while (j < arr2.length) {
            arr3[i + j] = arr2[j];
            j++;
        }

        // Mostrar la tercera tabla fusionada
        System.out.println("Tercera tabla fusionada: " + Arrays.toString(arr3));


    }
}
