package U1.abecedario;

public class H {
    public static void main(String[] args) {

        int altura = 7; // Altura de las letras

        // Dibujar la letra H

        System.out.println("Letra H:");

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales de la letra H
                if ((j == 0 || j == altura - 1) || (i == altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}


