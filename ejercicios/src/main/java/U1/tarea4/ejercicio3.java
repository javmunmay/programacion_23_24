package U1.tarea4;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        //Modificar el ejercicio anterior para que muestre
        //la parte entera de la media de tres notas decimales.


        System.out.println("Introduce la primera nota: ");
        Scanner teclado = new Scanner(System.in);
        double numero1 = teclado.nextDouble();

        System.out.println("Introduce la segunda nota: ");
        double numero2 = teclado.nextDouble();

        System.out.println("Introduce la tercera nota: ");
        double numero3 = teclado.nextDouble();


        double solucion = (double) (numero1 + numero2 + numero3);

        System.out.println("Resultado de la suma: " + solucion);

        int media = (int) solucion;

        System.out.println("La nota media es un: " + media / 3.0);


    }

}
