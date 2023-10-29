package U1.tarea8b;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la altura (mayor que 3 e impar): ");
        int altura = scanner.nextInt();

        if (altura > 3 && altura % 2 != 0) {
            // Dibujar las letras A y B
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < altura * 2 - 1; j++) {
                    if (j == altura - i - 1 || j == altura + i - 1 || (i == altura / 2 && j % 2 == 0)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("La altura debe ser mayor que 3 e impar.");
        }


        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {

                if (i == 1 || i == altura) {


                }

            }
        }


    }
}



