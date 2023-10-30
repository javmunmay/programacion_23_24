package U1.ExamenManana;

import java.util.Random;


public class Ej3 {
    public static void main(String[] args) {


        // Generar aleatoriamente el palo y la carta
        Random random = new Random();

        // Seleccionar aleatoriamente el palo
        int indicePalo = random.nextInt(4);
        String paloSeleccionado = "";
        for (int i = 0; i <= indicePalo; i++) {
            if (i == indicePalo) {
                paloSeleccionado = switch (i) {
                    case 0 -> "picas";
                    case 1 -> "corazones";
                    case 2 -> "diamantes";
                    case 3 -> "tréboles";
                    default -> paloSeleccionado;
                };
            }
        }

        // Seleccionar aleatoriamente la carta
        int indiceCarta = random.nextInt(13);
        String cartaSeleccionada = "";
        for (int i = 0; i <= indiceCarta; i++) {
            if (i == indiceCarta) {
                cartaSeleccionada = switch (i) {
                    case 0 -> "2";
                    case 1 -> "3";
                    case 2 -> "4";
                    case 3 -> "5";
                    case 4 -> "6";
                    case 5 -> "7";
                    case 6 -> "8";
                    case 7 -> "9";
                    case 8 -> "10";
                    case 9 -> "J";
                    case 10 -> "Q";
                    case 11 -> "K";
                    case 12 -> "A";
                    default -> cartaSeleccionada;
                };
            }
        }

        // Mostrar el resultado
        System.out.println("Palo - " + paloSeleccionado);
        System.out.println("Carta: " + cartaSeleccionada);

    }
}
