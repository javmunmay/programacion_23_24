package U1.tarea5b;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        //Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado.
        // Se permiten números de hasta 5 cifras.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        long numero = teclado.nextInt();

        if (numero <= 99999 && numero >= -99999) {

            System.out.println("Cifras introducidas correctamente");

            while (numero >= 10 || numero <= -10) {
                numero /= 10;
            }

            int primeraCifra = (int) Math.abs(numero);

            System.out.println("La primera cifra del número es: " + primeraCifra);


        } else {
            System.out.println("ERROR: El numero introducido tiene mas de 5 cifras");
        }


    }
}
