package U1.examen2021Tarde;

import java.util.Random;

public class Ej4 {
    public static void main(String[] args) {

        //Realiza un generador de melodía con las siguientes condiciones:
        //a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
        //sol, la y si.
        //b) Una melodía está formada por un número aleatorio de notas mayor o igual
        //a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
        //c) Cada grupo de 4 notas será un compás y estará separado del siguiente
        //compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
        //con dos barras.
        //d) La última nota de la melodía debe coincidir con la primera.
        //Ejemplo 1:
        //do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
        //Ejemplo 2:
        //la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||


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
