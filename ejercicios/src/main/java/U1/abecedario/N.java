package U1.abecedario;

public class N {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra N
        System.out.println("Letra N:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales y la diagonal de la letra N
                if (j == 0 || j == altura - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
