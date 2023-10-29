package U1.examen2021Tarde;

import java.util.Random;

public class Ej4 {
    public static void main(String[] args) {
        // Notas disponibles
        String[] notas = {"do", "re", "mi", "fa", "sol", "la", "si"};

        // Inicialización del generador de números aleatorios
        Random random = new Random();

        // Número aleatorio de compases (múltiplo de 4)
        int numCompases = (random.nextInt(7) + 4) * 4;

        // Construcción y visualización de la melodía
        for (int i = 0; i < numCompases; i++) {
            for (int j = 0; j < 4; j++) {
                // Seleccionar una nota aleatoria
                String nota = notas[random.nextInt(notas.length)];

                // Mostrar la nota
                System.out.print(nota + " ");
            }

            // Mostrar la barra vertical al final de cada compás
            System.out.print("| ");
        }

        // Mostrar las dos barras al final de la melodía
        System.out.println("||");
    }
}
