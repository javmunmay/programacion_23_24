package U3.tarea1Funciones;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        // Diseñar una función eco() a la que se le pasa como parámetro un número n, y muestra por pantalla n veces el mensaje "Eco..."

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numeroEco = scanner.nextInt();

        // Llamamos a la función eco con el número ingresado
        EcoFunction.eco(numeroEco);
    }
}

class EcoFunction {
    public static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Eco...");
        }
    }
}