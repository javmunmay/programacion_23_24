package U3.tarea1Funciones;

public class Ej12 {
    public static void main(String[] args) {
        //Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es 1.

        int n = 5;
        long resultado = calcularFactorial(n);
        System.out.println("El factorial de " + n + " es: " + resultado);
    }

    public static long calcularFactorial(int n) {
        if (n == 0) {
            return 1; // Caso base: factorial de 0 es 1
        }

        return n * calcularFactorial(n - 1); // Llamada recursiva
    }
}