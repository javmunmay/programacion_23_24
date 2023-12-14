package U3.examen20_21Tarde;

public class Ej1 {
    /*

    Implementa una función con nombre subcorteza que sea capaz
    de extraer la capa siguiente a la exterior de un array bidimensional.
    Esta capa se extrae en forma de array de una dimensión. La extracción
    de números comienza en la esquina superior izquierda y continúa en el
    sentido de las agujas del reloj. Se debe entregar tanto el código de la
    función como el código de prueba que la usa. La cabecera de la función es
    la siguiente:

    public static int[] subcorteza(int[][] n)
    Por ejemplo, si el array bidimensional a es el que se muestra a continuación:

    45 92 14 20 25 78
    35 72 24 45 42 60
    97 65 83 71 36 12
    32 42 64 23 41 39
    98 45 94 11 18 48
    El array unidimensional generado por subcorteza(a) sería el siguiente:

    72 24 45 42 36 41 23 64 42 65

     */


    public static void main(String[] args) {
        int[][] matriz = {
                {45, 92, 14, 20, 25, 78},
                {35, 72, 24, 45, 42, 60},
                {97, 65, 83, 71, 36, 12},
                {32, 42, 64, 23, 41, 39},
                {98, 45, 94, 11, 18, 48}
        };

        int[] resultado = subcorteza(matriz);

        // Imprimir el resultado
        System.out.println("Array unidimensional generado por subcorteza:");
        for (int num : resultado) { //tantas filas como tenga el resultado
            System.out.print(num + " ");
        }
    }

    public static int[] subcorteza(int[][] n) {
        int filas = n.length;
        int columnas = n[0].length;

        // Calcular el tamaño del array unidimensional resultante
        int tamannoResultado = 2 * (filas - 1) + 2 * (columnas - 1);

        // Inicializar el array unidimensional resultante
        int[] resultado = new int[tamannoResultado];

        int indice = 0;

        // Extraer la capa siguiente a la exterior en sentido de las agujas del reloj
        for (int i = 0; i < columnas; i++) {
            resultado[indice++] = n[0][i]; // Parte superior
        }
        for (int i = 1; i < filas; i++) {
            resultado[indice++] = n[i][columnas - 1]; // Parte derecha
        }
        for (int i = columnas - 2; i >= 0; i--) {
            resultado[indice++] = n[filas - 1][i]; // Parte inferior
        }
        for (int i = filas - 2; i > 0; i--) {
            resultado[indice++] = n[i][0]; // Parte izquierda
        }

        return resultado;
    }


}
