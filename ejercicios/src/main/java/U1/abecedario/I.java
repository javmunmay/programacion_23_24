package U1.abecedario;

public class I {
    public static void main(String[] args) {

        int altura = 7; // Altura de la letra I

        // Dibujar la letra I con barras horizontales arriba y abajo
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar las barras horizontales de la letra I
                if (i == 0 || i == altura - 1) {
                    System.out.print("*");
                } else if (j == altura / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
