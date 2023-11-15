package U3.tarea1Funciones;

public class Ej8 {
    public static void main(String[] args) {
        //Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.

        int numero = 24;
        int cantidadDivisoresPrimos = contarDivisoresPrimos(numero);
        System.out.println("El número " + numero + " tiene " + cantidadDivisoresPrimos + " divisores primos.");
    }

    public static int contarDivisoresPrimos(int numero) {
        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0 && esPrimo(i)) {
                contador++;
            }
        }

        return contador;
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}