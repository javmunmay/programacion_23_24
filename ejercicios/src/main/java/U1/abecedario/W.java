package U1.abecedario;

public class W {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra W
        System.out.println("Letra W:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 3 - 2; j++) {
                // Dibujar los bordes inclinados de la letra W
                if ((i + j == altura - 1 || j - i == altura - 1) ||
                        (i + j == altura * 3 - 3 || j - i == altura * 3 - 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
