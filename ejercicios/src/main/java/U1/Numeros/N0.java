package U1.Numeros;

public class N0 {
    public static void main(String[] args) {

        int altura = 7;

        // Dibujar el número 1
        System.out.println("Número 1:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar el número 1
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
