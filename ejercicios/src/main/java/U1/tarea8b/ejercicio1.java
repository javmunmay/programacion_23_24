package U1.tarea8b;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        //Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
        //El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje
        //Lo siento, esa no es la combinación y si acertamos se nos dirá La caja fuerte se ha abierto satisfactoriamente.
        //Tendremos cuatro oportunidades para abrir la caja fuerte.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al control de seguridad de:");
        System.out.println("BANCO WIZE");
        System.out.println("__________");

        int contador = 0;


        do {

            System.out.println("Para acceder a la caja fuerte introduzca la combinación correcta (4 Oportunidades): ");
            int contrasenna = teclado.nextInt();

            if (contrasenna == 4598) {

                System.out.println("La caja fuerte se ha abierto satisfactoriamente");

            } else {

                System.out.println("Lo siento, esa no es la combinación");

            }

            contador++;

        } while (contador != 4);


    }
}
