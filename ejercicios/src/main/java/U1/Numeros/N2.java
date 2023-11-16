package U1.Numeros;

public class N2 {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar el número 2
        System.out.println("Número 2:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar el número 2
                if (i == 0 || i == altura - 1 || i < altura / 2 && j == altura - 1 || i >= altura / 2 && j == 0 || i == altura / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
