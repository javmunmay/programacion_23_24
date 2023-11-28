package U3.tarea3Arrays;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        //Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
        //Realizar la media de los números positivos, la media de los negativos, y contar el número de ceros introducidos.


        // Utilizar Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número n
        System.out.print("Ingrese un número n: ");
        int n = scanner.nextInt();

        // Crear un array para almacenar los n números
        int[] numeros = new int[n];

        // Variables para calcular las estadísticas
        int sumaPositivos = 0, sumaNegativos = 0, contadorCeros = 0;
        int contadorPositivos = 0, contadorNegativos = 0;

        // Solicitar al usuario que teclee n números y almacenarlos en el array
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Calcular estadísticas
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        // Calcular medias
        double mediaPositivos;
        if (contadorPositivos > 0) {
            mediaPositivos = (double) sumaPositivos / contadorPositivos;
        } else {
            mediaPositivos = 0;
        }

        double mediaNegativos;
        if (contadorNegativos > 0) {
            mediaNegativos = (double) sumaNegativos / contadorNegativos;
        } else {
            mediaNegativos = 0;
        }

        // Mostrar resultados
        System.out.println("\nEstadísticas de los números introducidos:");
        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        System.out.println("Número de ceros introducidos: " + contadorCeros);


    }
}
