package U1;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        //Realiza un programa que solicite al usuario un número entero positivo con una cantidad
        // de cifras pares. Si el número que le pasamos no tiene una cantidad de cifras par deberá
        // volver a pedir un número.
        //
        //Una vez tengamos el número deberemos decir qué mitades son números primos o no.
        //
        //Ejemplo1:
        //
        //Introduce un número:
        //1213
        //12 no es número primo
        //13 es número primo
        //Ejemplo2:
        //
        //Introduce un número:
        //34567
        //Introduce un número:
        //1105
        //11- Es número primo
        //05 - Es número primo.

        Scanner teclado = new Scanner(System.in);

        int numero;
        do {
            System.out.println("Introduce un número:");
            numero = teclado.nextInt();
        } while (numero <= 0 || Integer.toString(numero).length() % 2 != 0);

        String numeroString = Integer.toString(numero); //Este codigo convierte el numero a cadena

        int longitudMitad = numeroString.length() / 2;


        String mitad1 = numeroString.substring(0, longitudMitad); //Aquí coge los primeros dos numero desde la posicion 0 (primer numero)
        //  en el caso de 4 numeros introducidos, hasta la longitudMitad que basicamente es hasta la mitad del numero introducido
        String mitad2 = numeroString.substring(longitudMitad);
        // y aquí la otra mitad


        System.out.println("Resultado:");


        int numMitad1 = Integer.parseInt(mitad1);
        boolean PrimoMitad1 = true;

        for (int i = 2; i <= numMitad1 / 2; ++i) {
            if (numMitad1 % i == 0) {
                PrimoMitad1 = false;
                break;
            }
        }


        if (PrimoMitad1) System.out.println(mitad1 + " es número primo");
        else System.out.println(mitad1 + " no es número primo");


        int numMitad2 = Integer.parseInt(mitad2);
        boolean PrimoMitad2 = true;

        for (int i = 2; i <= numMitad2 / 2; ++i) {
            if (numMitad2 % i == 0) {
                PrimoMitad2 = false;
                break;
            }
        }


        if (PrimoMitad2) System.out.println(mitad2 + " es número primo");
        else System.out.println(mitad2 + " no es número primo");
    }
}




