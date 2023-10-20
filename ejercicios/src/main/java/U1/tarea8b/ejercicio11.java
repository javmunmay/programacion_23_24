package U1.tarea8b;

import java.util.Scanner;
/*
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


    }
}*/


public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        long numero = scanner.nextLong();

        // Convertir el número a una cadena para procesar cada dígito
        String numeroStr = Long.toString(numero);

        // Inicializar arrays para almacenar dígitos que aparecen y no aparecen
        int[] digitosAparecen = new int[10];
        int[] digitosNoAparecen = new int[10];

        // Iterar sobre cada dígito en la cadena
        for (int i = 0; i < numeroStr.length(); i++) {
            int digito = Character.getNumericValue(numeroStr.charAt(i));
            digitosAparecen[digito] = 1;
        }

        // Imprimir dígitos que aparecen
        System.out.print("Dígitos que aparecen en el número: ");
        for (int i = 0; i < digitosAparecen.length; i++) {
            if (digitosAparecen[i] == 1) {
                System.out.print(i + " ");
            }
        }

        // Identificar dígitos que no aparecen
        System.out.print("\nDígitos que no aparecen: ");
        for (int i = 0; i < digitosNoAparecen.length; i++) {
            if (digitosAparecen[i] == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}

