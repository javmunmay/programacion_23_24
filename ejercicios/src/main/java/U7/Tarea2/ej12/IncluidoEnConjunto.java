package U7.Tarea2.ej12;

import java.util.HashSet;
import java.util.Set;

public class IncluidoEnConjunto {

    public static void main(String[] args) {
        // Crear los conjuntos
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        // Agregar elementos a los conjuntos
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);

        conjunto2.add(1);
        conjunto2.add(2);
        conjunto2.add(3);
        conjunto2.add(4);

        // Verificar si conjunto1 está incluido en conjunto2
        boolean estaIncluido = incluido(conjunto1, conjunto2);
        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);
        System.out.println("¿Conjunto 1 está incluido en conjunto 2? " + estaIncluido);
    }

    public static <T> boolean incluido(Set<T> conjunto1, Set<T> conjunto2) {
        return conjunto2.containsAll(conjunto1);
    }

}
