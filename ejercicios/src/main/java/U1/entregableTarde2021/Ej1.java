package U1.entregableTarde2021;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        //Realiza un programa que pinte por pantalla un rombo hueco hecho con
        //asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
        //sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
        //mensaje de error y volverlo a pedir hasta que sea correcto.
        //Ejemplo:
        //Por favor, introduzca la altura del rombo: 5
        //  *
        // * *
        //*   *
        // * *
        //  *
        

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca la altura del rombo (número impar mayor o igual a 3)
        int altura;
        do {
            System.out.print("Por favor, introduzca la altura del rombo (número impar mayor o igual a 3): ");
            altura = scanner.nextInt();
        } while (altura % 2 == 0 || altura < 3);

        // Imprimir la parte superior del rombo
        for (int i = 0; i < altura / 2 + 1; i++) {
            for (int j = altura / 2 + 1; j > i + 1; j--) {
                System.out.print(" ");
            }
            System.out.print("*");

            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        // Imprimir la parte inferior del rombo
        for (int i = altura / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < altura / 2 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            if (i > 0) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
