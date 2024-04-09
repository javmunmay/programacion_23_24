package U7.Tarea1.ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        // Generar 20 números aleatorios menores que 10
        for (int i = 0; i < 20; i++) {
            numeros.add(rand.nextInt(10));
        }

        // Ordenar en sentido decreciente
        Collections.sort(numeros, Collections.reverseOrder());

        // Mostrar la colección por pantalla
        System.out.println("Colección de números ordenada en sentido decreciente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}

