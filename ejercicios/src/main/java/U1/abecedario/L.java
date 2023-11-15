package U1.abecedario;

public class L {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra L
        System.out.println("Letra L:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales y el borde inferior de la letra L
                if (j == 0 || (i == altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
