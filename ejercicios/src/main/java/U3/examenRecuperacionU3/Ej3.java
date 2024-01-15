package U3.examenRecuperacionU3;

import java.util.Scanner;

public class Ej3 {
    /*
    Utilizando vectores bidimensionales en la función, realizar la siguiente función para un juego de ajedrez:

    public static boolean jaque(String posRey,String posReina)
    Y nos devuelva si reina está en posición de jaque al rey.

    Las posiciones que recibe la función son posiciones de ajedrez:

    a5, h4,c8

    Para recordar una imagen de un tablero con las posiciones:
     */

    public static void main(String[] args) {

        String[][] tablero;
        tablero = new String[8][8];

        String letras = "abcdefgh";

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(" " + letras.charAt(j) + (tablero.length - i));
            }
            System.out.println();
        }

        // Ejemplo de uso de la función jaque
        boolean jaque = jaque("f2", "b6");
        System.out.println("¿Jaque? " + jaque);
    }

    public static boolean jaque(String posRey, String posReina) {
        int reyX = posRey.charAt(0) - 'a';
        int reyY = '8' - posRey.charAt(1);

        int reinaX = posReina.charAt(0) - 'a';
        int reinaY = '8' - posReina.charAt(1);

        // Verificar si la reina está en la misma fila o columna que el rey
        if (reyX == reinaX || reyY == reinaY) {
            return true;
        }

        // Verificar si la reina está en la misma diagonal que el rey
        if (reyX - reinaX == reyY - reinaY) {
            return true;
        }

        return false;
    }


}




