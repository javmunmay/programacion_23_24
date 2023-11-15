package U1.Examen_23_24;

import java.util.Scanner;

public class Ej2_practica {
    public static void main(String[] args) {
        //Escribe un programa que solicite al usuario los siguientes números:
        //
        //Un número entero positivo
        //Un número entre 0 y 2 (ambos inclusive)
        //Una vez introducidos los dos números nos debe construir un número saltando las cifras según indique el segundo número.
        //
        //Ejemplo 1:
        //
        //Introduzca un número: 3456759
        //Introduzca el salto: 1
        //Resultado: 3579
        //Ejemplo 2:
        //
        //Introduzca un número: 3456759
        //Introduzca el salto: 2
        //Resultado: 369
        //Nota: No se pueden utilizar funciones de cadena.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        long numero = scanner.nextLong();
        int numeroSalto = 0;


        do {
            System.out.println("Introduzca el salto: ");
            numeroSalto = scanner.nextInt();
        } while (numeroSalto < 0 || numeroSalto > 2);

        long cociente = numero;
        long invertido = 0;

        while (cociente != 0) {

            invertido = invertido * 10 + cociente % 10;
            cociente = cociente / 10;

        }

        numero = 0;
        int contador = 0;

        while (invertido != 0) {
            if (contador == 0) {
                numero = numero * 10 + invertido % 10;
                contador = numeroSalto;

            } else {
                contador--;

            }

            invertido = invertido / 10;
        }
        System.out.println("El resultado es " + numero);
    }


}
