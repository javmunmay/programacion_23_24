package U3.tarea1Funciones;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        int numeroUno = scanner.nextInt();
        System.out.println("Introduzca un segundo numero: ");
        int numeroDos = scanner.nextInt();

        mostrarNumerosComprendidos(numeroUno, numeroDos);


    }

    public static void mostrarNumerosComprendidos(int inicio, int fin) {

        if (inicio > fin) {
            System.out.println("El primer nunmero debe de ser menor o igual al segundo. ");
        }

        System.out.println("Numeros comprendidos entre " + inicio + " y " + fin + ":");

        for (int i = inicio; i <= fin; i++) {
            System.out.println(i);
        }
    }
}
