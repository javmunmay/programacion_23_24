package U3.tarea3Arrays;

import java.util.Arrays;

public class Ej8 {
    public static void main(String[] args) {
        //Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma:
        //la posición [n,m] debe contener n+m. Después, se debe mostrar su contenido.


        int[][] arr = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = i + j;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
