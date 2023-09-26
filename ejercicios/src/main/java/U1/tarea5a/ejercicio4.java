package U1.tarea5a;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        //Crea un programa que pida al usuario dos números enteros
        //y cuántos de ellos son pares.


        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca un numero:");
        int numero1 = teclado.nextInt();

        System.out.println("Introduzca un segundo numero:");
        int numero2 = teclado.nextInt();

        int cantidadPares = 0;

        if (numero1 % 2 == 0) {
            System.out.println("El primer numero: " + numero1 + " es par. ");
            cantidadPares++;
        } else {
            System.out.println("El primer numero: " + numero1 + " es impar. ");
        }

        if (numero2 % 2 == 0) {
            System.out.println("El segundo numero: " + numero2 + " es par. ");
            cantidadPares++;
        } else {
            System.out.println("El segundo numero: " + numero2 + " es impar. ");
        }

        System.out.println("La cantidad de números pares introducidos es/son: " + cantidadPares);
    }
}
