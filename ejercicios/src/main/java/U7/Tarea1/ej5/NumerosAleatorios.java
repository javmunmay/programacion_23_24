package U7.Tarea1.ej5;

import java.util.*;

public class NumerosAleatorios {

    public static void main(String[] args) {
        TreeSet<Integer> numerosAleatorios = new TreeSet<>(Comparator.reverseOrder());
        Random random = new Random();

        while (numerosAleatorios.size() < 20) {
            int numero = random.nextInt(100); // Generar número aleatorio entre 0 y 99
            numerosAleatorios.add(numero); // Agregar el número al TreeSet
        }

        System.out.println("Colección de números aleatorios en orden decreciente:");
        for (Integer numero : numerosAleatorios) {
            System.out.println(numero);
        }
    }

}
