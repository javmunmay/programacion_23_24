package U1.tarea5b;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        //Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa para calcular su horoscopo ");
        System.out.println("Introduzca el día de nacimiento: ");
        int diaNac = teclado.nextInt();
        System.out.println("Introduzca el mes de nacimiento: ");
        String mesNac = teclado.next();


    }
}
