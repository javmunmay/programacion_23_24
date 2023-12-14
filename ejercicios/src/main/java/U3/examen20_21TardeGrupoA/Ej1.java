package U3.examen20_21TardeGrupoA;

public class Ej1 {

    public static void main(String[] args) {
        int[] a1 = {8, 9, 0};
        int[] b1 = {1, 2, 3};
        mostrarArray(mezcla(a1, b1)); // Debería imprimir {8, 1, 9, 2, 0, 3 }

        int[] a2 = {4, 3};
        int[] b2 = {7, 8, 9, 10};
        mostrarArray(mezcla(a2, b2)); // Debería imprimir {4, 7, 3, 8, 9, 10}

        int[] a3 = {8, 9, 0, 3};
        int[] b3 = {1};
        mostrarArray(mezcla(a3, b3)); // Debería imprimir {8, 1, 9, 0, 3}

        int[] a4 = {};
        int[] b4 = {1, 2, 3};
        mostrarArray(mezcla(a4, b4)); // Debería imprimir {1, 2, 3}
    }

    public static int[] mezcla(int[] a, int[] b) {
        int[] resultado = new int[a.length + b.length];
        int contadorA = 0, contadorB = 0, contadorResultado = 0;

        while (contadorA < a.length || contadorB < b.length) {
            if (contadorA < a.length) {
                resultado[contadorResultado] = a[contadorA];
                contadorA++;
                contadorResultado++;
            }

            if (contadorB < b.length) {
                resultado[contadorResultado] = b[contadorB];
                contadorB++;
                contadorResultado++;
            }
        }

        return resultado;
    }

    public static void mostrarArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}


