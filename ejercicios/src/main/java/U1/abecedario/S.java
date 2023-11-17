package U1.abecedario;

public class S {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra S
        System.out.println("Letra S:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes de la letra S
                if ((i == 0 || i == altura - 1) && (j > 0 && j < altura - 1) ||
                        (i < altura / 2 && j == 0) ||
                        (i == altura / 2) ||
                        (i > altura / 2 && j == altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
