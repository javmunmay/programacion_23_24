package U1.Figuras;

public class TrianguloRectangulo {
    public static void main(String[] args) {
        int altura = 5;  // Puedes ajustar la altura del triángulo

        // Dibujar el triángulo rectángulo con el perímetro de asteriscos
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                // Verificar si estamos en el perímetro o en el interior
                if (j == 0 || i == altura - 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
