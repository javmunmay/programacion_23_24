package U1.Figuras;

public class Rectangulo {
    public static void main(String[] args) {
        int altura = 5;   // Puedes ajustar la altura del rectángulo
        int anchura = 8;  // Puedes ajustar la anchura del rectángulo

        // Dibujar el rectángulo con el perímetro de asteriscos
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                // Verificar si estamos en el perímetro o en el interior
                if (i == 0 || i == altura - 1 || j == 0 || j == anchura - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  // Dos espacios para el interior vacío
                }
            }
            System.out.println();
        }
    }
}
