package U1.tarea2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        System.out.println("Introduce la longitud en millas: ");
        Scanner teclado = new Scanner(System.in);
        int numero1 =teclado.nextInt();

        //(1 milla = 1609 m).

        int solucionmetros = numero1*1609;

        System.out.println(numero1 + " millas son: " + solucionmetros + " metros");



    }
}