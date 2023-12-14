package U3.PreparacionExamen;

import java.util.Scanner;

public class PlantillaDeArrays {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce la longitud del array: ");
        int longitud = sn.nextInt();

        int[] numeros = new int[longitud];

        int num = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Inserte un numero en la posicion " + i);

            do {

                num = sn.nextInt();

                if (!(num >= 0 && num <= 10)) {
                    System.out.println("ERROR solo numeros del 0 al 10. " +
                            "Inserte un numero en la posicion " + i);

                }

            } while (!(num >= 0 && num <= 10));

            numeros[i] = num;

        }

        System.out.println("Estos son los numeros que has introducido: ");
        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

        }

    }


}
