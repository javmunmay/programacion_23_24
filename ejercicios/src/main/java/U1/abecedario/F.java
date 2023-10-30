package U1.abecedario;

public class F {
    public static void main(String[] args) {

        int altura = 7; // Altura de las letras


        // Dibujar la letra F
        System.out.println("Letra F:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales y horizontales de la letra F
                if ((j == 0) || (i == 0 || i == altura / 2) && j < altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Espacio entre las letras
        System.out.println();


    }
}

