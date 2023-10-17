package U1.tarea5b;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        //Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el valor de a: ");
        int valorA = teclado.nextInt();
        System.out.println("Introduce el valor de b: ");
        int valorB = teclado.nextInt();
        System.out.println("Introduce el valor de c: ");
        int valorC = teclado.nextInt();


        double xPosit = (-valorB + Math.sqrt(valorB * valorB - 4 * valorA * valorC)) / 2 * valorA;
        double xNegat = (-valorB - Math.sqrt(valorB * valorB - 4 * valorA * valorC)) / 2 * valorA;


        System.out.println("Los resultados son: ");
        System.out.println(xPosit);
        System.out.println(xNegat);

        //ERROR EN LA ECUACIÓN
    }
}
