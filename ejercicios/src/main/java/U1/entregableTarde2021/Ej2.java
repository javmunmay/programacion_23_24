package U1.entregableTarde2021;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número entero positivo
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = scanner.nextLong();

        // Validar que el número sea positivo
        if (numero < 0) {
            System.out.println("Por favor, introduzca un número entero positivo.");
            return;
        }

        // Contadores de dígitos pares e impares
        int digitosPares = 0;
        int digitosImpares = 0;

        // Contar dígitos pares e impares
        while (numero > 0) {
            long digito = numero % 10;

            if (digito % 2 == 0) {
                digitosPares++;
            } else {
                digitosImpares++;
            }

            numero /= 10;
        }

        // Mostrar el resultado
        System.out.println("El número contiene " + digitosPares + " dígitos pares y " + digitosImpares + " dígitos impares.");

        scanner.close();

    }
}
