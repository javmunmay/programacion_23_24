package U3.tarea2Cadenas;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las
        //palabras introducidas con espacios en blanco. Terminar de leer la frase cuando la palabra introducida
        //sea "fin" escrita con cualquier combinación de mayúsculas/minúsculas. La cadena "fin" no aparecerá en
        //la frase final.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce palabras para construir una frase. Escribe 'fin' para terminar.");

        StringBuilder frase = new StringBuilder();

        // Leer palabras hasta que se introduce "fin"
        String palabra;
        while (true) {
            System.out.print("Introduce una palabra: ");
            palabra = scanner.next();

            // Verificar si la palabra es "fin" (sin importar mayúsculas/minúsculas)
            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }

            // Agregar la palabra a la frase con un espacio en blanco
            frase.append(palabra).append(" ");
        }

        // Mostrar la frase completa
        System.out.println("Frase completa: " + frase.toString().trim());


    }
}
