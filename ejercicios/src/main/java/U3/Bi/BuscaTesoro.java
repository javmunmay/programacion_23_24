package U3.Bi;

import java.util.Scanner;

public class BuscaTesoro {
    // Se definen constantes para representar el contenido de las celdas
    static final int VACIO = 0;
    static final int MINA = 1;
    static final int TESORO = 2;
    static final int INTENTO = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] cuadrante = new int[5][4];
        int x, y;

        // Inicializa el array
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 4; y++) {
                cuadrante[x][y] = VACIO;
            }
        }

        // Coloca la mina
        int minaX = (int) (Math.random() * 5);
        int minaY = (int) (Math.random() * 4);

        cuadrante[minaX][minaY] = MINA;

        // Coloca el tesoro
        int tesoroX, tesoroY;
        do {
            tesoroX = (int) (Math.random() * 5);
            tesoroY = (int) (Math.random() * 4);
        } while ((minaX == tesoroX) && (minaY == tesoroY));

        cuadrante[tesoroX][tesoroY] = TESORO;

        // Juego
        System.out.println("¡BUSCA EL TESORO!");

        boolean salir = false;

        do {
            // Pinta el cuadrante
            for (y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for (x = 0; x < 5; x++) {
                    if (cuadrante[x][y] == INTENTO) {
                        System.out.print("X ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println("  ----------\n  0 1 2 3 4\n");

            // Pide las coordenadas
            System.out.print("Coordenada x: ");
            x = scanner.nextInt();
            System.out.print("Coordenada y: ");
            y = scanner.nextInt();

            // Verifica si las coordenadas están dentro de los límites del cuadrante
            if (x >= 0 && x < 5 && y >= 0 && y < 4) {
                // Mira lo que hay en las coordenadas indicadas por el usuario
                switch (cuadrante[x][y]) {
                    case VACIO:
                        cuadrante[x][y] = INTENTO;
                        if ((Math.abs(x - minaX) < 2) && (Math.abs(y - minaY) < 2)) {
                            System.out.println("¡Cuidado! ¡Hay una mina cerca!");
                        }
                        break;
                    case MINA:
                        System.out.println("Lo siento, has perdido.");
                        salir = true;
                        break;
                    case TESORO:
                        System.out.println("Enhorabuena, has encontrado el tesoro.");
                        salir = true;
                }
            } else {
                System.out.println("Coordenadas fuera de los límites. Inténtalo de nuevo.");
            }
        } while (!salir);

        // Pinta el cuadrante final
        for (y = 3; y >= 0; y--) {
            System.out.print(y + " ");
            for (x = 0; x < 5; x++) {
                switch (cuadrante[x][y]) {
                    case VACIO -> System.out.print("  ");
                    case MINA -> System.out.print("* ");
                    case TESORO -> System.out.print("€ ");
                    case INTENTO -> System.out.print("x ");
                }
            }
            System.out.println();
        }
        System.out.println("  ----------\n  0 1 2 3 4\n");
    }
}



