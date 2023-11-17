package U1.RecuperacionExamen23_24;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //Escribe un programa que diga si un número introducido por teclado es o no capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El programa debe aceptar números de cualquier longitud siempre que lo permita el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar long en lugar de int ya que el primero admite números más largos.
        //
        //NOTA: No puedo utilizar funciones de cadenas.
        //
        //Ejemplo 1:
        //
        //Por favor, introduzca un número entero positivo: 678
        //El 678 no es capicúa.
        //Ejemplo 2:
        //
        //Por favor, introduzca un número entero positivo: 2019102
        //El 2019102 es capicúa.

        Scanner sc = new Scanner(System.in);

        long numero;
        int contador;
        long inicio;


        do {
            System.out.println("Introduzca un numero entero positivo: ");
            numero = sc.nextLong();

            long invertido = 0;
            contador = 0;
            long cociente = numero;

            // Contamos el número de cifrass
            while (cociente != 0) {
                invertido = invertido * 10 + numero % 10;
                cociente = cociente / 10;
                contador++;
            }

            // Comprobamos que sea positivo
        } while (numero <0);


        // Dividimos en dos partes
        inicio = numero / 1000;
        long fin = numero % 1000;



        System.out.println("Los números son " + inicio + " y " + fin);


        long cocienteI = inicio;
        long invertido = 0;

        //  invertimos el número
        while (cocienteI != 0) {
            invertido = invertido * 10 + cocienteI % 10;
            cocienteI = cocienteI / 10;
        }

        if (invertido == fin){
            System.out.println("es capicua");
        }else {
            System.out.println("no son capicua");
        }


    }


    }

