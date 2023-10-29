package U1.examen2021Tarde;

import java.util.Random;

public class Ej2 {
    public static void main(String[] args) {
        // Array de caracteres posibles
        char[] caracteres = {'*', '-', '=', '.', '|', '@'};
        Random random = new Random();

        // Generar diez líneas aleatorias
        for (int i = 0; i < 10; i++) {
            // Generar longitud aleatoria entre 1 y 40 caracteres
            int longitud = random.nextInt(40) + 1;

            // Seleccionar un carácter aleatorio
            char caracter = caracteres[random.nextInt(caracteres.length)];

            // Imprimir la línea
            for (int j = 0; j < longitud; j++) {
                System.out.print(caracter);
            }

            // Ir a la siguiente línea después de imprimir la línea
            System.out.println();
        }
    }
}
