package U1.ExamenTarde;

import java.util.Random;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicitar al usuario que introduzca un número
        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();

        // Inicializar variables para la suma total de cifras y la clave criptográfica
        int sumaTotal = 0;

        // Procesar cada cifra del número
        while (numero > 0) {
            int cifra = numero % 10;
            int claveCriptografica = random.nextInt(9000) + 1000;

            // Mostrar la clave criptográfica generada para la cifra actual
            System.out.println("La clave criptográfica generada para " + cifra + " es: " + claveCriptografica);

            // Calcular la suma de las cifras totales para la cifra actual
            int sumaParcial = cifra;
            while (claveCriptografica > 0) {
                sumaParcial += claveCriptografica % 10;
                claveCriptografica /= 10;
            }
            System.out.println("La suma de las cifras totales para " + cifra + " es: " + sumaParcial);

            // Agregar la suma parcial a la suma total
            sumaTotal += sumaParcial;

            // Eliminar la última cifra del número
            numero /= 10;
        }

        // Mostrar el número resultante
        System.out.println("El número resultante es: " + sumaTotal);

        scanner.close();

    }
}
