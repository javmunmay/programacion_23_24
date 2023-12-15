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
        Scanner scanner = new Scanner(System.in);

        // Solicitar la posición de la Reina
        System.out.print("Introduzca la posición de la Reina, por ejemplo d5: ");
        String posicionReina = scanner.nextLine();

        // Obtener las coordenadas de la posición de la Reina
        int columnaReina = posicionReina.charAt(0) - 'a' + 1;
        int filaReina = Character.getNumericValue(posicionReina.charAt(1));

        System.out.println("La Reina puede moverse a las siguientes posiciones:");


        for (int fila = 8; fila >= 1; fila--) {
            for (int columna = 1; columna <= 8; columna++) {
                // Verificar si la posición permite un movimiento diagonal de la Reina
                if ((Math.abs(filaReina - fila) == Math.abs(columnaReina - columna))
                        && (filaReina != fila && columnaReina != columna)) {
                    // Imprimir la posición posible de la Reina en formato ajedrez
                    System.out.print((char) (columna + 'a' - 1) + "" + fila + " ");
                }
            }
        }
    }
}




