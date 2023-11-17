package U1.Figuras;

public class Cuadrado {
    public static void main(String[] args) {
        int lado = 5;  // Puedes ajustar el tamaño del cuadrado cambiando este valor

        // Dibujar el cuadrado con el perímetro de asteriscos
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                // Verificar si estamos en el perímetro o en el interior
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  // Dos espacios para el interior vacío
                }
            }
            System.out.println();
        }
    }
}
