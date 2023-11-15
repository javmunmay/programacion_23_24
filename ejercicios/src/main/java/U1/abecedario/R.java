package U1.abecedario;

public class R {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra R corregida
        System.out.println("Letra R:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (j == 0 || (i == 0 || i == altura / 2) && j < altura - 1 || (i < altura / 2 && j == altura - 1) || (i >= altura / 2 && (j == i + altura / 2 || (i == altura - 1 && j == altura - 1)))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
