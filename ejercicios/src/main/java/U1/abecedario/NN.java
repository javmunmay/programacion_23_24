package U1.abecedario;

public class NN {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra Ñ
        System.out.println("Letra Ñ:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales, la diagonal y la parte superior de la letra Ñ
                if (j == 0 || j == altura - 1 || (i > 0 && i < altura - 1 && j == i) || (i > 0 && i < altura - 1 && j == altura - i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
