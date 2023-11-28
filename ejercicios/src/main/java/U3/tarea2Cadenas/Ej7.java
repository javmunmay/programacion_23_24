package U3.tarea2Cadenas;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        //En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor",
        //según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.


        Scanner scanner = new Scanner(System.in);

        // Jugador 1 introduce la contraseña
        System.out.print("Jugador 1, introduce la contraseña: ");
        String contrasena = scanner.nextLine();

        // Jugador 2 intenta adivinar la contraseña
        System.out.println("\nJugador 2, adivina la contraseña:");

        System.out.print("Introduce tu intento: ");
        String intento = scanner.nextLine();

        // Comparar la palabra introducida con la contraseña alfabéticamente
        int comparacion = intento.compareTo(contrasena);

        // Dar pistas según la comparación
        if (comparacion == 0) {
            System.out.println("¡Acertaste! La contraseña es correcta.");
        } else if (comparacion < 0) {
            System.out.println("Fallaste. La contraseña es mayor alfabéticamente.");
        } else {
            System.out.println("Fallaste. La contraseña es menor alfabéticamente.");
        }


    }
}
