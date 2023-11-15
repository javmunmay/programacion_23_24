package U3.tarea1Funciones;

import U1.ejercicioDepuracion.Main;

public class Ej10 {
    public static void main(String[] args) {
        //Escribir una función que decida si dos números enteros positivos son amigos.
        //Dos números son amigos si la suma de los divisores propios (distinto de él mismo)
        //del primer número es igual al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)

        int numero1 = 220;
        int numero2 = 284;

        if (sonAmigos(numero1, numero2)) {
            System.out.println(numero1 + " y " + numero2 + " son números amigos.");
        } else {
            System.out.println(numero1 + " y " + numero2 + " no son números amigos.");
        }
    }

    public static boolean sonAmigos(int num1, int num2) {
        return (sumaNumerosAmigos(num1) == num2 && sumaNumerosAmigos(num2) == num1);
    }

    public static int sumaNumerosAmigos(int num) {
        int sumaDivisores = 1; // Iniciar con 1 para incluir el divisor 1

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores;
    }
}