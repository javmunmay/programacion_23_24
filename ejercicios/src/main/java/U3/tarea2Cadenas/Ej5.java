package U3.tarea2Cadenas;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        //Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier vocal del nombre.
        //Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz". Sólo se eliminarán las vocales (mayúsculas, minúsculas y acentuadas).
        //El resto de caracteres no se modifican.

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca su nombre completo
        System.out.print("Introduce tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        // Eliminar vocales del nombre
        String nombreSinVocales = eliminarVocales(nombreCompleto);

        // Mostrar el resultado
        System.out.println("Nombre sin vocales: " + nombreSinVocales);

    }

    // Método para eliminar vocales de una cadena
    private static String eliminarVocales(String cadena) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (!esVocal(caracter)) {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }

    // Método para verificar si un caracter es una vocal
    private static boolean esVocal(char caracter) {
        char vocal = Character.toLowerCase(caracter);

        return vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u';


    }
}
