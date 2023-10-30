package U1;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //Escribe un programa que solicite al usuario los siguientes números:
        //
        //Un número entero positivo
        //Una cifra entre 0 y 9 (ambos inclusive)
        //Una vez introducidos los dos números nos debe decir cuántas ocurrencias de la cifra
        // hay en el primer número y cuáles son las posiciones (en orden en las que se han
        // encontrado).
        //
        //Ejemplo 1:
        //
        //Introduzca un número:
        //3456759
        //Una cifra:
        //5
        //
        //Resultado:
        //2 ocurrencias
        //Posiciones: 2 - 5

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero entero: ");
        int numero = teclado.nextInt();


        System.out.println("Introduzca una cifra: (Entre el 0 y el 9 ambos inclusive)");
        int cifra = teclado.nextInt();


        String numeroString = Integer.toString(numero);


        int ocurrencias = 0;
        String posiciones = "";


        for (int i = 0; i < numeroString.length(); i++) {

            int digito = Character.getNumericValue(numeroString.charAt(i)); //charAt hace que se divida por celdas y pueda
            // sacar ell caracter que solicita el usuario


            if (digito == cifra) {
                ocurrencias++;

                posiciones += (i + 1) + " - ";
            }
        }


        posiciones = posiciones.substring(0, posiciones.length() - 2);


        System.out.println("Resultado:");
        System.out.println(ocurrencias + " ocurrencias");
        System.out.println("Posiciones: " + posiciones);
    }
}




