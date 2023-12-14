package U3.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Colores {

    public static void main(String[] args) {
        String[] colores = {
                "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"
        };

        String[] palabras = new String[8];
        String[] resultado = new String[8];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca 8 palabras (pulse [INTRO] después de cada palabra):");

        int indiceResultado = 0;

        for (int i = 0; i < 8; i++) {
            palabras[i] = scanner.nextLine();

            for (String color : colores) {
                if (palabras[i].equalsIgnoreCase(color)) {
                    resultado[indiceResultado++] = color;
                    break;
                }
            }
        }

        // Imprime los arrays.
        System.out.println("\n\nArray original: " + Arrays.toString(palabras));
        System.out.println("\nArray resultado: " + Arrays.toString(resultado));

        // Cierra el scanner
        scanner.close();
    }
}
