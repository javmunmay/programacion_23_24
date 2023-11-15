package U1.abecedario;

public class T {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra T
        System.out.println("Letra T:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales y horizontales de la letra T
                if (i == 0 || j == altura / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
