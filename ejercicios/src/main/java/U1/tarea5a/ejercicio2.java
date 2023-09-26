package U1.tarea5a;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        //Crea un programa que pida al usuario que introduzca el número 12.
        //Después debe decirle si lo ha hecho correctamente o no.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introdzca el numero 12: ");
        int numeroDoce = teclado.nextInt();


        if (numeroDoce == 12) {

            System.out.println("Ha introducido el numero 12 correctamente. ");
        } else {
            System.out.println("NO ha introducido el numero 12. ");

        }
    }
}
