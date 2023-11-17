package U1.Figuras;

public class Romboide {
    public static void main(String[] args) {
        int altura = 5;  // Puedes ajustar la altura del romboide
        int base = 8;    // Puedes ajustar la base del romboide

        // Dibujar el romboide
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < base; j++) {
                // Verificar si estamos en el perímetro o en el interior
                if (j == 0 || j == base - 1 || i == 0 || i == altura - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  // Dos espacios para el interior vacío
                }
            }
            System.out.println();
        }
    }
}
