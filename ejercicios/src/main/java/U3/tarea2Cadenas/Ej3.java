package U3.tarea2Cadenas;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        //Diseñar un programa que pida una frase al usuario, e indique si el carácter
        //de la posición central es o no un espacio.

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Obtener la longitud de la frase
        int longitud = frase.length();

        // Verificar si la longitud es impar y el carácter central es un espacio
        if (longitud % 2 != 0) {
            char caracterCentral = frase.charAt(longitud / 2);

            if (caracterCentral == ' ') {
                System.out.println("El carácter central es un espacio.");
            } else {
                System.out.println("El carácter central no es un espacio.");
            }
        } else {
            System.out.println("La longitud de la frase no es impar, por lo que no hay un carácter central.");
        }

    }
}
