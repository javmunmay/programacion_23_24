package U1.abecedario;

public class K {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra K con la pata de abajo hacia la derecha
        System.out.println("Letra K:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales y diagonales de la letra K
                if (j == 0 || (i == altura / 2 && j <= altura / 2) || (i > altura / 2 && j + i == altura / 2 + altura) || (i < altura / 2 && j == altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
