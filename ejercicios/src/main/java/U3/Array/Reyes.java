package U3.Array;

import java.util.Scanner;

public class Reyes {

    /*
    Solicita al usuario que introduzca el número total de nombres de reyes.
    Crea un array de cadenas llamado reyes con el tamaño especificado por el usuario.
    Pide al usuario que introduzca los nombres de los reyes, uno por uno.
    Itera sobre el array de reyes y, para cada rey, cuenta cuántas veces aparece en la lista hasta ese punto.
    Muestra cada nombre de rey junto con su posición de orden (primero, segundo, tercero, etc.)
    basándose en el orden de entrada.
     */


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca el número total de nombres de reyes: ");
        int n = Integer.parseInt(s.nextLine());

        String[] reyes = new String[n];

        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");

        for (int i = 0; i < n; i++) {
            reyes[i] = s.nextLine();
        }

        for (int i = 0; i < n; i++) {
            int orden = 1;

            for (int j = 0; j < i; j++) {
                if (reyes[i].equals(reyes[j])) {
                    orden++;
                }
            }
            System.out.println(reyes[i] + " " + orden + "º");
        }
    }


}
