package U3.examenU3_23_24;

import java.util.Scanner;

public class Ej2 {

    /*

    Desarrollar una función que se denomine insertarEnVector con el siguiente prototipo:

    public static int[] insertarEnVector(int[] v1, int [] v2, int pos)
    Recibirá como parámetros dos vectores de enteros y una posición. Devolverá un vector de enteros que contenga el
    primer array con el segundo array insertado de manera completa a partir de la posición dada.

    Si la posición es
    menor que 0, el vector devuelto deberá contener el primer array. Si la posición es mayor que la longitud del
    primer array, el vector devuelto deberá contener el segundo array. Si la posición es igual a la longitud del primer
    array, el vector devuelto deberá contener el primer array con el segundo array insertado al final. Probar dicha
    función en el método Main.

    Ejemplo 1:

    v1 = {1,2,3,4,5,6}
    v2 = {4,9,12,5,7}
    pos = 2
    El resultado de insertarEnVector será:

    {1,2,4,9,12,5,7,3,4,5,6}


     */

    public static void main(String[] args) {

        int[] vector1 = {1, 2, 3, 4, 5, 6};


        int[] vector2 = {4, 9, 12, 5, 7};

        System.out.println("Introduzca una posicion: ");
        Scanner scanner = new Scanner(System.in);
        int posicion = scanner.nextInt();

    }

   public static int[] insertarVector (int[] vector1, int[] vector2, int posicion) {

       if (posicion < 0) {

           return vector1;

       } else if (posicion > vector1.length) {

           return vector2;

       } else if (posicion == vector1.length) {

           return null;

       }
       return null;

   }

}






