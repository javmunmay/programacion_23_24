package U3.examenRecuperacionU3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

    /*
    Crear una función insertarValor que:

    Reciba como parámetros un vector de enteros, un valor y una posición Devuelva como resultado un vector en el que habremos insertado el valor que le hemos pasado en la posición indicada. De esta manera el vector resultado tendrá un elemento más.

    En caso de que la posición exceda los límites del vector deberá mostrar un error por pantalla y devolver el mismo vector recibido. Realizar una llamada a la función mostrando el vector resultado.

    Ejemplo:

    v = { 1 , 2 , 3 , 4 , 5 }

    v1 = invertarValor(v,8,3)

    Entonces v1 será {1,2,3,8,4,5}
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector1 = {1, 2, 3, 4, 5, 6};
        int[] vector2 = {8};
        int pos;

        do {
            System.out.println("Introduzca la posicion donde introducir el nuevo valor: "+(Arrays.toString(vector2)));
            pos = sc.nextInt();

        }while (pos<0 || pos>5);


        int[] resultado = insertarVector(vector1, vector2, pos);

        System.out.println("Vector original: ");
        System.out.println(Arrays.toString(vector1));
        System.out.println("Entonces sera: ");
        System.out.println(Arrays.toString(resultado));

    }

    public static int[] insertarVector(int[] vector1, int[] vector2, int pos) {
        int[] resultado = new int[vector1.length + vector2.length];


        if (pos < 0) {

            return vector1;

        } else if (pos > vector1.length) {

            return vector2;

        } else {

            int indRe = 0;

            for (int i = 0; i < pos; i++) {

                resultado[indRe] = vector1[i];
                indRe++;
            }

            for (int j = 0; j < vector2.length; j++) {

                resultado[indRe] = vector2[j];
                indRe++;
            }

            for (int i = pos; i < vector1.length; i++) {
                resultado[indRe] = vector1[i];
                indRe++;
            }

        }
        return resultado;

    }

}


