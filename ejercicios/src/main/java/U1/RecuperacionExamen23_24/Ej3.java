package U1.RecuperacionExamen23_24;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        //Realiza un programa lea un número entero positivo de la pantalla y que lo pase a binario.

        long numero;
        long nBinario = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            numero = sc.nextLong();

        } while (numero < 0);

        long cociente = 0;
        long invertido = 0;
        long numeroNuevo;



        //voy dividiendo cada numero y scandole el resto(nBinario)

        for (int i = 0; i <= numero; i++) {

            if (numero > 0) {
                nBinario = numero % 2;





                System.out.print(" " + nBinario);
                numero = numero / 2;

            }


        }

        cociente = numero;


        //  invertimos el número
        while (cociente != 0) {
            invertido = invertido * 10 + cociente % 10;
            cociente = cociente / 10;


        }



        System.out.print(" "+invertido);

        System.out.println(" <--");











    }
}
