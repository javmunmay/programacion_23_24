package U7.Tarea1.ej6;

import java.util.*;

public class NombresColección {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> nombres = new LinkedHashSet<>();

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");
        String nombre = scanner.nextLine();

        while (!nombre.equalsIgnoreCase("fin")) {
            nombres.add(nombre);
            nombre = scanner.nextLine();
        }

        System.out.println("\nNombres en la colección (orden de inserción):");
        for (String nombreEnColeccion : nombres) {
            System.out.println(nombreEnColeccion);
        }
    }

}
