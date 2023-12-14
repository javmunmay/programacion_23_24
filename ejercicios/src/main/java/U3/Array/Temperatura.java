package U3.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Temperatura {



        /*
        Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado
        año y que muestre a continuación un diagrama de barras horizontales con esos datos. Las barras
        del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
         */


    public static void main(String[] args) {
        String[] mes = {
                "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };

        int[] temperatura = new int[12];
        int i;

        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < 12; i++) {
            System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
            temperatura[i] = scanner.nextInt();
        }

        System.out.println();

        for (i = 0; i < 12; i++) {
            System.out.printf("%12s │ %s\n", mes[i], generarAsteriscos(temperatura[i])); //System.out.printf("%12s │ %dºC\n", mes[i], temperatura[i]);
        }
    }

    private static String generarAsteriscos(int cantidad) {
        StringBuilder asteriscos = new StringBuilder();
        for (int i = 0; i < cantidad; i++) {
            asteriscos.append("*");
        }
        return asteriscos.toString();
    }
}
