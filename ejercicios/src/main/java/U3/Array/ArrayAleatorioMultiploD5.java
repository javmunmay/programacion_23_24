package U3.Array;

public class ArrayAleatorioMultiploD5 {

    /*
    Crea un array de enteros llamado n con 15 elementos.
    Llena el array con valores aleatorios entre 0 y 500.
    Muestra el array original.
    Ajusta cada elemento del array para que sea un múltiplo de 5.
    Muestra el array resultante después del ajuste.
     */

    public static void main(String[] args) {
        // Crea el array con valores aleatorios
        int[] n = new int[15];

        for (int i = 0; i < 15; i++) {
            n[i] = (int) (Math.random() * 501);
        }

        System.out.println("Array original:");

        for (int i = 0; i < 15; i++) {
            System.out.print(n[i] + "  ");
        }

        // // Multiplica cada elemento del array por 5
        for (int i = 0; i < 15; i++) {
            while (n[i] % 5 != 0) {
                n[i]++;
            }
            ;
        }

        // Muestra el resultado
        System.out.println("\n\nArray resultado:");

        for (int i = 0; i < 15; i++) {
            System.out.print(n[i] + "  ");
        }
    }

}

