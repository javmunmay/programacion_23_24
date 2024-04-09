package U7.Tarea1.ej4;

import java.util.*;

public class PalabrasRepetidas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();

        // Dividir la frase en palabras separadas por espacios
        String[] palabras = frase.split("\\s+");

        // Crear un mapa para contar la frecuencia de cada palabra
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();
        for (String palabra : palabras) {
            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }

        List<String> palabrasRepetidas = new ArrayList<>();
        List<String> palabrasNoRepetidas = new ArrayList<>();

        // Identificar palabras repetidas y no repetidas
        for (String palabra : frecuenciaPalabras.keySet()) {
            if (frecuenciaPalabras.get(palabra) > 1) {
                palabrasRepetidas.add(palabra);
            } else {
                palabrasNoRepetidas.add(palabra);
            }
        }

        // Mostrar palabras repetidas
        System.out.println("Palabras repetidas:");
        for (String palabra : palabrasRepetidas) {
            System.out.println(palabra);
        }

        // Mostrar palabras no repetidas
        System.out.println("\nPalabras no repetidas:");
        for (String palabra : palabrasNoRepetidas) {
            System.out.println(palabra);
        }
    }

}
