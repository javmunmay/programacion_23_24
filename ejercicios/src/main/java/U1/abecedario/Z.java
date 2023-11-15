package U1.abecedario;

public class Z {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra Z
        System.out.println("Letra Z:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar la letra Z
                if (i == 0 || i == altura - 1 || i + j == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
