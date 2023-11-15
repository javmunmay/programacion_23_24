package U1.abecedario;

public class Q {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra Q con la cola hacia la derecha
        System.out.println("Letra Q:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura + 2; j++) {
                // Dibujar los bordes verticales y horizontales de la letra Q
                if ((i == 0 || i == altura - 1) && (j > 0 && j < altura + 1)) {
                    System.out.print("*");
                } else if ((i > 0 && i < altura - 1) && (j == 0 || j == altura)) {
                    System.out.print("*");
                } else if (i >= altura / 2 && j > altura / 2 && (i + j == altura + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
