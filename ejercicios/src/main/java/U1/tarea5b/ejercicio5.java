package U1.tarea5b;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        //Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
        //
        //Ejemplo 1:
        //Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
        //Por favor, introduzca el valor de a: 2
        //Ahora introduzca el valor de b: 1
        //x = -0.5
        //
        //
        //Ejemplo 2:
        //Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
        //Por favor, introduzca el valor de a: 0
        //Ahora introduzca el valor de b: 7
        //Esa ecuación no tiene solución real.

        Scanner teclado = new Scanner(System.in);

        System.out.println(" Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0 ");
        System.out.println(" Por favor, introduzca el valor de a: ");
        int valorA = teclado.nextInt();

        System.out.println("Ahora introduzca el valor de b: ");
        int valorB = teclado.nextInt();

        double solucion = (double) -valorB / valorA;

        System.out.println("Solución: " + solucion);


    }
}
