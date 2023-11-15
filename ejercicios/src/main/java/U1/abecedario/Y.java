package U1.abecedario;

public class Y {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra Y
        System.out.println("Letra Y:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar la letra Y
                if (i == j && i < altura / 2 || i + j == altura - 1 && i < altura / 2 || j == altura / 2 && i >= altura / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
