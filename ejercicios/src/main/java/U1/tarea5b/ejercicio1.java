package U1.tarea5b;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        //Escribe un programa que pida por teclado un día de la semana y
        //que diga qué asignatura toca a primera hora ese día.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un día de la semana: (Lunes, Martes, Miércoles,...)");
        String diaSemana = teclado.next();

        if (diaSemana.equals("Lunes")) {
            System.out.println("El lunes a primera hora hay Programación");

        }
        if (diaSemana.equals("Martes")) {
            System.out.println("El Martes a primera hora hay Base de datos");

        }
        if (diaSemana.equals("Miércoles")) {
            System.out.println("El Miércoles a primera hora hay Sistemas Informaticos");

        }
        if (diaSemana.equals("Jueves")) {
            System.out.println("El Jueves a primera hora hay Lenguaje de marca");

        }
        if (diaSemana.equals("Viernes")) {
            System.out.println("El Viernes a primera hora hay FOL");

        }
        if (diaSemana.equals(" ")) {
            System.out.println("ERROR: El valor introducido no es correcto, inténtelo de nuevo");

        }

    }
}
