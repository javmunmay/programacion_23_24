package U1.tarea5b;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        //Realiza un programa que calcule la media de tres notas que se solicitarán al usuario.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa para calcular la nota media de tres notas: ");

        System.out.println("Introduzca la primera nota: ");
        double primeraNota = teclado.nextDouble();

        System.out.println("Introduzca la segunda nota: ");
        double segundaNota = teclado.nextDouble();

        System.out.println("Introduzca la tercera nota: ");
        double terceraNota = teclado.nextDouble();


        double notaMedia = (primeraNota + segundaNota + terceraNota) / 3;

        System.out.printf("La nota media es: %.2f", notaMedia); //print f escribe con formateo

    }

}
