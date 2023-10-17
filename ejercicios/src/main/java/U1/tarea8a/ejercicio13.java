package U1.tarea8a;


import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {

        //Dadas 6 notas, escribir la cantidad de alumnos
        //aprobados, condicionados (=4) y suspensos


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 6 notas: ");

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

        System.out.println("Nota 6:");
        int nota6 = teclado.nextInt();

        System.out.println("Calculando los aprobados, condicionados y suspensos...");

        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;


        //Nota 1

        if (nota1 >= 5) {

            aprobados++;

        } else if (nota1 == 4) {
            condicionados++;
        } else {
            suspensos++;
        }


        //Nota 2

        if (nota2 >= 5) {

            aprobados++;

        } else if (nota2 == 4) {
            condicionados++;
        } else {
            suspensos++;
        }


        //Nota 3

        if (nota3 >= 5) {

            aprobados++;

        } else if (nota3 == 4) {
            condicionados++;
        } else {
            suspensos++;
        }


        //Nota 4

        if (nota4 >= 5) {

            aprobados++;

        } else if (nota4 == 4) {
            condicionados++;
        } else {
            suspensos++;
        }


        //Nota 5

        if (nota5 >= 5) {

            aprobados++;

        } else if (nota5 == 4) {
            condicionados++;
        } else {
            suspensos++;
        }


        //Nota 6

        if (nota6 >= 5) {

            aprobados++;

        } else if (nota6 == 4) {
            condicionados++;
        } else {
            suspensos++;
        }


        System.out.println("Un total de aprobados de " + aprobados + " alumnos.");
        System.out.println("Un total de condicionados de " + condicionados + " alumnos.");
        System.out.println("Un total de suspensos de " + suspensos + " alumnos.");


    }
}
