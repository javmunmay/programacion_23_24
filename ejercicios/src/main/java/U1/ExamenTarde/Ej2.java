package U1.ExamenTarde;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduce un número largo:");
        long num = teclado.nextLong();
        boolean[] digitos = new boolean[10];

        while (num > 0) {
            digitos[(int) (num % 10)] = true;
            num /= 10;
        }

        System.out.println("Dígitos que aparecen en el número:");
        for (int i = 0; i < 10; i++) {
            if (digitos[i]) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Dígitos que no aparecen:");
        for (int i = 0; i < 10; i++) {
            if (!digitos[i]) {
                System.out.print(i + " ");
            }
        }
    }
}


