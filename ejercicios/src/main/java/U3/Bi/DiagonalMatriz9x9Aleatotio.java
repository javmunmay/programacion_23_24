package U3.Bi;

public class DiagonalMatriz9x9Aleatotio {

    /*
     Genera una matriz de 9x9 con números aleatorios entre 500 y 900,
     y luego calcula la diagonal desde la esquina inferior izquierda hasta
     la esquina superior derecha. Al igual que el ejercicio anterior, muestra
     el máximo, mínimo y la media de los números en esa diagonal.
     */


    public static void main(String[] args) {
        int[][] n = new int[9][9];

        // Genera el array y lo muestra
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                n[i][j] = (int) (Math.random() * 401) + 500;
                System.out.printf("%5d", n[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nDiagonal desde la esquina inferior izquierda ");
        System.out.println("a la esquina superior derecha: ");

        int maximo = 500;
        int minimo = 900;
        int suma = 0;

        for (int i = 0; i < n.length; i++) {
            int numero = n[8 - i][i];
            System.out.print(numero + " ");
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            suma += numero;
        }

        System.out.println("\nMáximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + ((double) suma / 10));
    }

}

