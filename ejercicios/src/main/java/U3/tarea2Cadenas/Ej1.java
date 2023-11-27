package U3.tarea2Cadenas;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        //Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.


        Scanner scanner = new Scanner(System.in);

        // Introducir la primera palabra
        System.out.print("Introduce la primera palabra: ");
        String palabra1 = scanner.nextLine();

        // Introducir la segunda palabra
        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        // Comparar longitudes y mostrar el resultado
        if (palabra1.length() < palabra2.length()) {
            System.out.println("La palabra más corta es: " + palabra1);
        } else if (palabra1.length() > palabra2.length()) {
            System.out.println("La palabra más corta es: " + palabra2);
        } else {
            System.out.println("Ambas palabras tienen la misma longitud.");
        }


    }
}
