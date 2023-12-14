package U3.Bi;

import java.util.Scanner;


public class TresEnRayas {
    /**
     * 7.2 Arrays bidimensionales
     * <p>
     * 10. Realiza el juego de las tres en raya.
     */


    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de Tres en Raya!");

        int player = 1;

        while (true) {
            printBoard(board);
            System.out.println("Jugador " + player + ", es tu turno.");

            int row = getCoordinate("Introduce la fila: ", scanner);
            int col = getCoordinate("Introduce la columna: ", scanner);

            if (board[row][col] != ' ') {
                System.out.println("Posición ya ocupada. Inténtalo de nuevo.");
                continue;
            }

            board[row][col] = (player == 1) ? 'X' : 'O';

            if (checkWinner(board, player)) {
                printBoard(board);
                System.out.println("¡Felicidades! Jugador " + player + " gana.");
                break;
            }

            if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("¡Empate! No hay ganadores.");
                break;
            }

            player = (player == 1) ? 2 : 1;
        }

        scanner.close();
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static int getCoordinate(String prompt, Scanner scanner) {
        int coordinate;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Introduce un número.");
                System.out.print(prompt);
                scanner.next();
            }
            coordinate = scanner.nextInt() - 1;

            if (coordinate < 0 || coordinate >= 3) {
                System.out.println("Coordenada fuera de rango. Inténtalo de nuevo.");
            }
        } while (coordinate < 0 || coordinate >= 3);

        scanner.nextLine(); // Limpiar el buffer del scanner
        return coordinate;
    }

    public static boolean checkWinner(char[][] board, int player) {
        // Check horizontal lines
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] == (player == 1 ? 'X' : 'O')) {
                return true;
            }
        }

        // Check vertical lines
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] == (player == 1 ? 'X' : 'O')) {
                return true;
            }
        }

        // Check diagonal lines
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] ||
                board[0][2] == board[1][1] && board[1][1] == board[2][0]) &&
                board[1][1] == (player == 1 ? 'X' : 'O')) {
            return true;
        }

        return false;
    }


    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
