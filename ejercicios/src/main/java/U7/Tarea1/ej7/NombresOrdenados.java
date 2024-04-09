package U7.Tarea1.ej7;

import java.util.*;

public class NombresOrdenados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> nombres = new TreeSet<>();

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");
        String nombre = scanner.nextLine();

        while (!nombre.equalsIgnoreCase("fin")) {
            nombres.add(nombre);
            nombre = scanner.nextLine();
        }

        System.out.println("\nNombres en la colección (orden alfabético):");
        for (String nombreEnColeccion : nombres) {
            System.out.println(nombreEnColeccion);
        }
    }

}
