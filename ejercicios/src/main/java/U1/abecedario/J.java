package U1.abecedario;

public class J {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra J
        System.out.println("Letra J:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales y horizontales de la letra J
                if (j == altura / 2 || (i == 0 && j < altura / 2) || (i == altura - 1 && j <= altura / 2) || (i > altura / 2 && j == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
