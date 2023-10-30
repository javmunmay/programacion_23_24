package U1.examen2021Tarde;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        //Escribe un programa que pida dos números por teclado y que luego mezcle en
        //dos números diferentes los dígitos pares y los impares. Se van comprobando
        //los dígitos de la siguiente manera: primer dígito del primer número, primer
        //dígito del segundo número, segundo dígito del primer número, segundo
        //dígito del segundo número, tercer dígito del primer número… Para facilitar
        //el ejercicio, podemos suponer que el usuario introducirá dos números de la
        //misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
        //long en lugar de int donde sea necesario para admitir números largos.
        //
        //Ejemplo 1:
        //Por favor, introduzca un número: 9402
        //Introduzca otro número: 6782
        //El número formado por los dígitos pares es 640822
        //El número formado por los dígitos impares es 97

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca dos números
        System.out.print("Por favor, introduzca un número: ");
        long num1 = scanner.nextLong();

        System.out.print("Introduzca otro número: ");
        long num2 = scanner.nextLong();

        // Mezclar los dígitos pares e impares
        long numPares = 0;
        long numImpares = 0;
        long factor = 1;

        while (num1 > 0 || num2 > 0) {
            long digito1 = num1 % 10;
            long digito2 = num2 % 10;

            if (digito1 % 2 == 0) {
                numPares = numPares + (digito1 * factor);
                factor *= 10;
            }

            if (digito2 % 2 == 0) {
                numPares = numPares + (digito2 * factor);
                factor *= 10;
            }

            digito1 = num1 % 10;
            digito2 = num2 % 10;

            if (digito1 % 2 != 0) {
                numImpares = numImpares + (digito1 * factor);
                factor *= 10;
            }

            if (digito2 % 2 != 0) {
                numImpares = numImpares + (digito2 * factor);
                factor *= 10;
            }

            num1 /= 10;
            num2 /= 10;
        }

        // Mostrar los resultados
        System.out.println("El número formado por los dígitos pares es " + numPares);
        System.out.println("El número formado por los dígitos impares es " + numImpares);

        scanner.close();


    }
}
