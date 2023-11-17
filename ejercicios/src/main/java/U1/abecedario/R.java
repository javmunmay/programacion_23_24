package U1.abecedario;

public class R {
    public static void main(String[] args) {
        int altura = 7;

        // Dibujar la letra R
        System.out.println("Letra R:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Verificar si estamos en el borde, en la diagonal descendente o en el palo de abajo a la derecha
                if (j == 0 || (i == 0 || i == altura / 2) && j < altura - 1 || (i < altura / 2 && j == altura - 1) || (i >= altura / 2 && (j == i + altura / 2 || (i == altura - 1 && j >= altura / 2)))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
