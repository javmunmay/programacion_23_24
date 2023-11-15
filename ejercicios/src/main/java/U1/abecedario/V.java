package U1.abecedario;

public class V {
    public static void main(String[] args) {

        int altura = 7;

        // Dibujar un triángulo con la forma de una V
        System.out.println("Triángulo con la forma de una V:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 2 - 1; j++) {
                // Dibujar el triángulo con la forma de una V
                if ((i + j == altura - 1 || j - i == altura - 1) && i < altura - 1 ||
                        i == altura - 1 && (j > 0 && j < altura * 2 - 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
