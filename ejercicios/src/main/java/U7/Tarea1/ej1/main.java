package U7.Tarea1.ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        // Crear una lista para almacenar los números enteros aleatorios
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        // Generar 20 números enteros aleatorios menores que 100 y guardarlos en la lista
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomNumbers.add(random.nextInt(100));
        }

        // Mostrar la lista original
        System.out.println("Lista original:");
        System.out.println(randomNumbers);

        // Ordenar la lista en sentido creciente
        Collections.sort(randomNumbers);

        // Mostrar la lista ordenada
        System.out.println("\nLista ordenada en sentido creciente:");
        System.out.println(randomNumbers);
    }
}
