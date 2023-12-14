package U3.Array;

import java.util.Scanner;


public class MaxMin10Numeros {

    /*
    Parece que este código solicita al usuario que introduzca 10 números enteros
    y luego muestra cada número, indicando si es el máximo o el mínimo entre los
    introducidos.
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Introduce 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            maximo = Math.max(maximo, numeros[i]);
            minimo = Math.min(minimo, numeros[i]);
        }

        System.out.println("\nResultados:");

        for (int numero : numeros) {
            System.out.print(numero);
            if (numero == maximo) {
                System.out.print(" máximo");
            }
            if (numero == minimo) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }

        scanner.close();
    }
}



