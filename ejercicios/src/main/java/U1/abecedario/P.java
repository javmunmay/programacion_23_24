package U1.abecedario;

public class P {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra P
        System.out.println("Letra P:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales y horizontales de la letra P
                if (j == 0 || (i == 0 || i == altura / 2) && j < altura - 1 || (i < altura / 2 && j == altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
