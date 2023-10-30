package U1.ExamenTarde;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número entero
        System.out.print("Introduzca un número entero: ");
        long numero = scanner.nextLong();

        // Inicializar variables para los dígitos que aparecen y los que no aparecen
        String digitosAparecen = "";
        String digitosNoAparecen = "0123456789";

        // Procesar cada dígito del número
        while (numero > 0) {
            int digito = (int) (numero % 10);

            // Eliminar el dígito de los que no aparecen
            digitosNoAparecen = digitosNoAparecen.replace(Integer.toString(digito), "");

            // Agregar el dígito a los que aparecen (si aún no está)
            if (digitosAparecen.indexOf(Integer.toString(digito)) == -1) {
                digitosAparecen += digito + " ";
            }

            // Eliminar el último dígito del número
            numero /= 10;
        }

        // Mostrar los dígitos que aparecen en el número
        System.out.println("Dígitos que aparecen en el número: " + digitosAparecen.trim());

        // Mostrar los dígitos que no aparecen en el número
        System.out.println("Dígitos que no aparecen: " + digitosNoAparecen);

        scanner.close();

    }
}
