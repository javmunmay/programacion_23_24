package U7.Tarea2.ej10;

import java.util.HashSet;
import java.util.Set;

public class InserciondeConjuntos {

    public static void main(String[] args) {
        // Crear los conjuntos
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        // Agregar elementos a los conjuntos
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);

        conjunto2.add(3);
        conjunto2.add(4);
        conjunto2.add(5);

        // Obtener la intersección de los conjuntos y mostrar el resultado
        Set<Integer> interseccion = interseccion(conjunto1, conjunto2);
        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);
        System.out.println("Intersección de los conjuntos: " + interseccion);
    }

    public static <T> Set<T> interseccion(Set<T> conjunto1, Set<T> conjunto2) {
        Set<T> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);
        return interseccion;
    }

}
