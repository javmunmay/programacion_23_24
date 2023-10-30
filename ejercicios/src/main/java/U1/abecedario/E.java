package U1.abecedario;

public class E {
    public static void main(String[] args) {

        int altura = 5; // Altura de las letras
        int espacio = 3; // Espacio entre las letras

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
