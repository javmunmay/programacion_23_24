package U3.tarea1Funciones;

public class Ej11 {
    public static void main(String[] args) {
        //Realizar una función que calcule a elevado a n, donde a es real, y n entero no negativo.
        //Realizar una versión iterativa y otra recursiva.

        double resultadoIterativo = potenciaIterativa(2.5, 3);
        System.out.println("Resultado Iterativo: " + resultadoIterativo);

        double resultadoRecursivo = potenciaRecursiva(2.5, 3);
        System.out.println("Resultado Recursivo: " + resultadoRecursivo);
    }

    public static double potenciaIterativa(double a, int n) {
        double resultado = 1;

        for (int i = 0; i < n; i++) {
            resultado *= a;
        }

        return resultado;
    }

    public static double potenciaRecursiva(double a, int n) {
        if (n == 0) {
            return 1;
        }

        return a * potenciaRecursiva(a, n - 1);
    }
}
