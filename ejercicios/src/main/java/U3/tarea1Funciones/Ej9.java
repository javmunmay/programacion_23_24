package U3.tarea1Funciones;

public class Ej9 {
    public static void main(String[] args) {
        //Implementar la función divisoresPrimos() que muestra, por consola,
        //todos los divisores primos del número que se le pasa como parámetro

        int numero = 36;
        System.out.println("Divisores primos de " + numero + ":");
        divisoresPrimos(numero);
    }

    public static void divisoresPrimos(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0 && esPrimo(i)) {
                System.out.println(i);
            }
        }
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