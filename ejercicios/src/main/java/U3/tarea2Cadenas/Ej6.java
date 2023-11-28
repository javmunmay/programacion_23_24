package U3.tarea2Cadenas;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        //Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo,
        //debe insertar otra intentando acertarla con las pistas que le dará el programa: número de caracteres,
        //primera y última letra. El programa debe escribir "Acertaste" o "Fallaste".


        Scanner scanner = new Scanner(System.in);

        // Jugador 1 introduce la contraseña
        System.out.print("Jugador 1, introduce la contraseña: ");
        String contrasena = scanner.nextLine();

        // Obtener pistas para el Jugador 2
        int longitud = contrasena.length();
        char primeraLetra = contrasena.charAt(0);
        char ultimaLetra = contrasena.charAt(longitud - 1);

        // Jugador 2 intenta adivinar la contraseña
        System.out.println("\nJugador 2, adivina la contraseña:");
        System.out.println("Número de caracteres: " + longitud);
        System.out.println("Primera letra: " + primeraLetra);
        System.out.println("Última letra: " + ultimaLetra);

        System.out.print("Introduce tu intento: ");
        String intento = scanner.nextLine();

        // Verificar si el intento es correcto
        if (intento.equals(contrasena)) {
            System.out.println("¡Acertaste! La contraseña es correcta.");
        } else {
            System.out.println("Fallaste. La contraseña no es correcta.");
        }


    }
}
