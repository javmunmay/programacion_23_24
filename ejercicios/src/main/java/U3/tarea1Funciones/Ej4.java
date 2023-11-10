package U3.tarea1Funciones;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        // Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.

        int numeroUno = 0;
        int numeroDos = 0;


        System.out.println("Introduce el primer numero: ");
        Scanner scanner = new Scanner(System.in);
        numeroUno = scanner.nextInt();

        System.out.println("Introduce el segundo numero: ");
        numeroDos = scanner.nextInt();
        int mayor = masGrande(numeroUno, numeroDos);
        System.out.println(mayor);

    }

    public static int masGrande(int num1, int num2) {

        if (num1 < num2) {
            System.out.print("El numero más grande es: ");
            return num2;
        } else {
            System.out.print("El numero más grande es: ");
            return num1;
        }

    }


}
