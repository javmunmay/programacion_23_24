package U1.tarea5b;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        //Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        int numero = teclado.nextInt();


        int ultimaCifra = 0;

        ultimaCifra = numero % 10;

        System.out.println("La ultima cifra es: " + ultimaCifra);

    }
}
