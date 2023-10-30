package U1.abecedario;

public class B {
    public static void main(String[] args) {
        int altura = 5;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar la letra B
                if ((j == 0 || j == altura - 1 || i == 0 || i == altura - 1 || i == altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Cambio de línea después de cada fila
        }
    }
}

/*
public class B {
    public static void main(String[] args) {

        int altura = 7; // Altura de la letra B

        // Dibujar la letra B
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales y horizontales de la letra B
                if ((j == 0 || j == altura - 1) || (i == 0 || i == altura - 1 || i == altura / 2) && j < altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
*/