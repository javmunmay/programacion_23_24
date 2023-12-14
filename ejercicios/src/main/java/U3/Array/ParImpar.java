package U3.Array;

import java.util.Scanner;

public class ParImpar {

    /*
        Realiza un programa que pida 8 números enteros y que luego muestre esos números
        junto con la palabra "par" o "impar" según proceda.
     */


    public static void main(String[] args) {
        int[] numeros = new int[8];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 8 números enteros:");

        for (int i = 0; i < 8; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println();

        for (int numero : numeros) {
            System.out.println(numero + (numero % 2 == 0 ? " par" : " impar"));
        }

        scanner.close();
    }
}


