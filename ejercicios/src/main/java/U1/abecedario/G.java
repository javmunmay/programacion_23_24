package U1.abecedario;

public class G {
    public static void main(String[] args) {

        int altura = 7; // Altura de la letra G

        // Dibujar la letra G
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales y horizontales de la letra G
                if ((j == 0 || j == altura - 1) && i != 0 && i != altura - 1 || (i == 0 || i == altura - 1) && j > 0 && j < altura - 1 || (i == altura / 2) && j > altura / 2 || (j == altura - 1 && i > altura / 2 && i < altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

