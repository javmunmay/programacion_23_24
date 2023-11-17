package U1.RecuperacionExamen23_24;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

    //Crear programa que pinte una flecha doble hacia la izquierda. Se pide al usuario la altura de la figura, que debe ser un número impar mayor o igual que 3. La distancia entre cada flecha de asteriscos es siempre de 5 espacios. Si la altura introducida por el usuario no es un número impar mayor o igual que 3, el programa debe mostrar un mensaje de error.
        //
        //Ejemplo 1: Introduce la altura de la flecha: 7
        //
        //   *   *
        //  *   *
        // *   *
        //*   *
        // *   *
        //  *   *
        //   *   *
        //Ejemplo 2: Introduce la altura de la flecha: 3
        //
        // *   *
        //*   *
        // *   *

        int altura;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la  altura: ");
             altura = sc.nextInt();

        }while ( 0 == altura % 2 || altura<3);


        // Dibujar la letra
        System.out.println("Flecha: ");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar la letra X
                if (j==i && i>altura/2 || i + j == altura - 1 && j>altura/2 -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j < altura; j++) {
                // Dibujar la letra X
                if (j==i && i>altura/2 || i + j == altura - 1 && j>altura/2 -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }




    }
}
