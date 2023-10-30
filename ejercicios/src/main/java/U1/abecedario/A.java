package U1.abecedario;

public class A {
    public static void main(String[] args) {

        int altura = 7; // Altura de las letras
        int espacio = 3; // Espacio entre las letras

        // Dibujar la letra A y la letra B
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (2 * altura - 1); j++) {
                // Dibujar la letra A
                if (j == altura - i - 1 || j == altura + i - 1 || i == altura / 2 && j > altura - i - 1 && j < altura + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }


            // Agregar espacio
            for (int j = 0; j < espacio; j++) {
                System.out.print(" ");
            }


            System.out.println();
        }


    }

}
