package U1.tarea3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        //Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y
        // calcule su equivalencia en kilómetros, usando datos de tipo float
        // (1 milla = 1.609 km).

        System.out.println("Introduce una longitud en millas: ");
        Scanner teclado = new Scanner(System.in);
        float numero1 = teclado.nextFloat();

        //millas a kilometros

        float solkm = numero1 * 1609;

        System.out.println(numero1+ " millas son: " + solkm + " Kilometros ");



    }
}