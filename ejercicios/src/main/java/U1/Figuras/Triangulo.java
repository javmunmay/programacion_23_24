package U1.Figuras;

public class Triangulo {
    public static void main(String[] args) {
        int altura = 5;  // Puedes ajustar la altura del triángulo

        // Dibujar el triángulo con el perímetro de asteriscos
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                // Verificar si estamos en el perímetro o en el interior
                if (j == 0 || j == 2 * i || i == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
