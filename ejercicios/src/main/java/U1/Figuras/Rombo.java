package U1.Figuras;

public class Rombo {
    public static void main(String[] args) {
        int altura = 5;  // Puedes ajustar la altura del rombo

        // Dibujar el rombo
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                // Verificar si estamos en el perímetro o en el interior
                if (j == 0 || j == 2 * i || i == 0 || i == altura - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  // Dos espacios para el interior vacío
                }
            }
            System.out.println();
        }
    }
}
