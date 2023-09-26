package U1.tarea3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        //Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y
        // calcule su equivalencia en kilómetros, usando datos de tipo float
        // (1 milla = 1.609 km).

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una longitud en millas: ");
        int millas = teclado.nextInt();

        //millas a kilometros

        float solkm = millas * 1.609f;

        System.out.println(millas+ " millas son: " + solkm + " Kilometros ");



    }
}