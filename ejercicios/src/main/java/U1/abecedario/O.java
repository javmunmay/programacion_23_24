package U1.abecedario;

public class O {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra O
        System.out.println("Letra O:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales y horizontales de la letra O
                if (i == 0 || i == altura - 1 || j == 0 || j == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
