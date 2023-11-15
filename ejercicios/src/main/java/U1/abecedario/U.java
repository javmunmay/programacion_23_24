package U1.abecedario;

public class U {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra U
        System.out.println("Letra U:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales y la base de la letra U
                if ((j == 0 || j == altura - 1) && i < altura - 1 ||
                        i == altura - 1 && (j > 0 && j < altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
