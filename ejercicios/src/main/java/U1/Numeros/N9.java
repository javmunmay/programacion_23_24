package U1.Numeros;

public class N9 {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar el número 9
        System.out.println("Número 9:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar el número 9
                if (i == 0 || i == altura - 1 || i == altura / 2 || j == altura - 1 || (j == 0 && i <= altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
