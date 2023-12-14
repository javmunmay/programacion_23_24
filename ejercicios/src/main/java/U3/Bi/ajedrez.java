package U3.Bi;

import java.util.Scanner;

public class ajedrez {

    /**
     * 7.2 Arrays bidimensionales
     * <p>
     * 8. Escribe un programa que, dada una posición en un tablero de ajedrez,
     * nos diga a qué casillas podría saltar un alfil que se encuentra en esa
     * posición. Como se indica en la figura, el alfil se mueve siempre en
     * diagonal. El tablero cuenta con 64 casillas.
     * Las columnas se indican con las letras de la "a" a la "h" y las filas
     * se indican del 1 al 8.
     * Ejemplo:
     * Introduzca la posición del alfil: d5
     * El alfil puede moverse a las siguientes posiciones: h1 a2 g2 b3 e3 c4 e4 c6 e6 b7 f7 a8 g8
     *
     * @author Luis José Sánchez
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la posición del alfil
        System.out.print("Introduzca la posición del alfil, por ejemplo d5: ");
        String posicionAlfil = scanner.nextLine();

        // Obtener las coordenadas de la posición del alfil
        int columnaAlfil = posicionAlfil.charAt(0) - 'a' + 1;
        int filaAlfil = Character.getNumericValue(posicionAlfil.charAt(1));

        System.out.println("El alfil puede moverse a las siguientes posiciones:");

        // Iterar sobre todas las posiciones del tablero
        for (int fila = 8; fila >= 1; fila--) {
            for (int columna = 1; columna <= 8; columna++) {
                // Verificar si la posición permite un movimiento diagonal del alfil
                if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
                        && (filaAlfil != fila && columnaAlfil != columna)) {
                    // Imprimir la posición posible del alfil en formato ajedrez
                    System.out.print((char) (columna + 'a' - 1) + "" + fila + " ");
                }
            }
        }
    }
}




