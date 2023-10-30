package U1.ExamenTarde;

public class Ej1 {
    public static void main(String[] args) {


        int altura = 5; // Altura de las letras
        int espacio = 3; // Espacio entre las letras


        // Dibujar la letra A

        


         /*   // Dibujar la letra B

            for (int j = 0; j < altura; j++) {
                if (j == 0 || (j == altura / 2 && i != 0 && i != altura
                        - 1) || (i == 0 || i == altura - 1) && j < altura / 2 || (i == altura /
                        2 && j > 0 && j < altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }


            // Agregar espacio

            for (int j = 0; j < espacio; j++) {
                System.out.print(" ");
            }
*/

        int i;
        for (i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar la letra E
                if (j == 0 || i == 0 || i == altura - 1 || (i == altura / 2)) { //arriba / lateral / abajo / medio.
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }
    }
}
