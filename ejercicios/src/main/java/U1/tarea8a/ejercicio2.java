package U1.tarea8a;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        //Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos
        //estadísticos de los alumnos. Se introducirán las edades de los elumnos hasta que una
        //de ellas sea negativa. La aplicación mostrará la suma de las edades, la media,
        //de cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.

        Scanner teclado = new Scanner(System.in);

        int edad;
        int sumaEdades = 0;
        int contadorEdad = 0;
        int contadorMayor = 0;

        do {
            System.out.println("  Introduce la edad del alumno:  ");
            System.out.println("---------------------------------");
            System.out.println("-(Para salir teclee nº negativo)-");
            edad = teclado.nextInt();

            if (edad >= 0) {

                sumaEdades += edad;

                System.out.println(" Alumno agregado ");

                contadorEdad++;


            }

            if (edad >= 18) {

                contadorMayor++;

            }


        } while (edad > 0);

        System.out.println("La suma de edades da un total de: " + sumaEdades);
        System.out.println("El total de edades introducidas son: " + contadorEdad);
        System.out.println("Los alumnos mayores de edad introducidos dan un total de " + contadorMayor + " de alumnos");


    }
}
