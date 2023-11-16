package U1.Figuras;

public class Circulo {
    public static void main(String[] args) {
        int radio = 5;  // Puedes ajustar el radio del círculo

        // Dibujar el perímetro del círculo
        for (int i = -radio; i <= radio; i++) {
            for (int j = -radio; j <= radio; j++) {
                // Verificar si el punto (i, j) está en el perímetro del círculo
                if (i * i + j * j == radio * radio) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  // Dos espacios para el interior vacío
                }
            }
            System.out.println();
        }
    }
}
