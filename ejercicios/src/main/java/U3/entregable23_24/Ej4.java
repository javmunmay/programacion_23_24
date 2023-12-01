package U3.entregable23_24;

public class Ej4 {

/*

    JAVIER MUÑOZ MAYORGA

    Crear una función matrizLetras que:

    Reciba una cadena de caracteres
    Devuelve una matriz donde se ha dividido esa frase en filas
    que tengan 5 columnas. No serán tenidos en cuenta los espacios


 */



    public static void main(String[] args) {

        String frase = "Hola que tal estas hoy martes?";
        char[][] resultadoFinalMatriz = matrizConLetras(frase);

        // Imprime por pantalla la matriz
        for (int i = 0; i < resultadoFinalMatriz.length; i++) {
            for (int j = 0; j < resultadoFinalMatriz[i].length; j++) {
                System.out.print(resultadoFinalMatriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] matrizConLetras(String frase) {
        frase = frase.replaceAll(" ", "");
        // Elimina los espacios


        int filas = (int) Math.ceil((double) frase.length() / 5);
        char[][] matriz = new char[filas][5];
        int contador = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 5; j++) {
                if (contador < frase.length()) {
                    matriz[i][j] = frase.charAt(contador);
                    contador++;
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        return matriz;
    }


}
