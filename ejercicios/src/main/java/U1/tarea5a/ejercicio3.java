package U1.tarea5a;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        //Crea un programa que diga si el número introducido
        //por el usuario es impar o no lo es.

        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca un numero:");
        int numero1 = teclado.nextInt();

        if (numero1 % 2 == 0) {
            System.out.println("El numero: " + numero1 + " es par. ");
        } else {
            System.out.println("El numero: " + numero1 + " es impar. ");
        }

    }


}
