package U3.tarea2Cadenas;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        //Diseñar una actividad que pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene.

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Inicializar contador de espacios
        int contadorEspacios = 0;

        // Recorrer cada caracter de la frase y contar espacios
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contadorEspacios++;
            }
        }

        // Mostrar el resultado
        System.out.println("La frase tiene " + contadorEspacios + " espacios en blanco.");


    }
}
