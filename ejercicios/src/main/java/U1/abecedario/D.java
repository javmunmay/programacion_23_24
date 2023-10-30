package U1.abecedario;


public class D {
    public static void main(String[] args) {

        int altura = 10; // Altura de la letra D

        // Dibujar la letra D
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales y horizontales de la letra D
                if ((j == 0 || j == altura - 1) && i != altura - 1 || (i == 0 || i == altura - 1) && j > 0 && j < altura - 1 || (j == altura - 1 && i > 0 && i < altura - 1)) {
                    System.out.print("*");
                } else {
                    // Corregir la doble línea en la barra lateral derecha
                    if (j == altura - 2 && i > 0 && i < altura - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
