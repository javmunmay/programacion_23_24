package U1.Numeros;

public class N8 {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar el número 8
        System.out.println("Número 8:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar el número 8 sin asteriscos en el centro
                if ((i > 0 && i < altura - 1) && (j == 0 || j == altura - 1) || i == 0 && (j > 0 && j < altura - 1) || i == altura - 1 && (j > 0 && j < altura - 1) || i == altura / 2 && (j > 0 && j < altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
