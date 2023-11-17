package U1.abecedario;

public class X {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra X
        System.out.println("Letra X:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar la letra X
                if (i == j || i + j == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
