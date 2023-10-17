package U1.tarea8a;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Pedir 5 calificaciones de alumnos. El programa debe decir, al final,
        //si hay algún suspenso o no lo hay. Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.

        System.out.println("Introduce 5 notas: ");

        System.out.println("Nota 1: ");
        int nota1 = teclado.nextInt();

        System.out.println("Nota 2:");
        int nota2 = teclado.nextInt();

        System.out.println("Nota 3:");
        int nota3 = teclado.nextInt();

        System.out.println("Nota 4:");
        int nota4 = teclado.nextInt();

        System.out.println("Nota 5:");
        int nota5 = teclado.nextInt();


        int aprobados = 0;
        int suspensos = 0;


        //Nota 1

        if (nota1 >= 5) {

            aprobados++;

        } else {

            suspensos++;

        }


        //Nota 2

        if (nota2 >= 5) {

            aprobados++;

        } else {

            suspensos++;

        }


        //Nota 3

        if (nota3 >= 5) {

            aprobados++;

        } else {

            suspensos++;

        }


        //Nota 4

        if (nota4 >= 5) {

            aprobados++;

        } else {

            suspensos++;

        }


        //Nota 5

        if (nota5 >= 5) {

            aprobados++;

        } else {

            suspensos++;

        }


        System.out.println("Un total de aprobados de " + aprobados + " alumnos.");

        if (suspensos > 0) {

            System.out.println("Sí hay alumnos suspensos, hay un total de: " + suspensos);

        } else {

            System.out.println("No hay alumnos suspensos.");

        }


    }
}
