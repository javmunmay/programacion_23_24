package U1.abecedario;

public class M {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra M
        System.out.println("Letra M:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 2; j++) {
                // Dibujar los bordes verticales y diagonales de la letra M
                if (j == 0 || j == altura * 2 - 1 || (i < altura / 2 && (j == i * 2 + 1 || j == altura * 2 - i * 2 - 2))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
