package U7.Tarea2.ej13;

import java.util.ArrayList;
import java.util.List;


public class FusionListas {

    public static void main(String[] args) {
        // Ejemplo de listas ordenadas
        List<Integer> lista1 = List.of(1, 3, 5, 7, 9);
        List<Integer> lista2 = List.of(2, 4, 6, 8, 10);

        // Obtener la lista fusionada
        List<Integer> fusion = fusionarListas(lista1, lista2);

        // Mostrar la lista fusionada
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista fusionada: " + fusion);
    }

    public static List<Integer> fusionarListas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> fusion = new ArrayList<>();

        // Índices para recorrer ambas listas
        int i = 0, j = 0;

        // Recorrer ambas listas y fusionar
        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) < lista2.get(j)) {
                fusion.add(lista1.get(i));
                i++;
            } else {
                fusion.add(lista2.get(j));
                j++;
            }
        }

        // Agregar los elementos restantes de ambas listas, si los hay
        while (i < lista1.size()) {
            fusion.add(lista1.get(i));
            i++;
        }

        while (j < lista2.size()) {
            fusion.add(lista2.get(j));
            j++;
        }

        return fusion;
    }

}
