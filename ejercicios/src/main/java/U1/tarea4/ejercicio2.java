package U1.tarea4;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        //Necesitamos una aplicación que calcule la media aritmética de dos notas enteras.
        //Hay que tener en cuenta que la media puede contener decimales.


        System.out.println("Introduce la primera nota: ");
        Scanner teclado = new Scanner(System.in);
        int numero1 =teclado.nextInt();

        System.out.println("Introduce la segunda nota: ");
        int numero2 =teclado.nextInt();


        double solucion = (numero1 + numero2)/2.0;

        System.out.println("La nota media es un: " + solucion);



    }
}
