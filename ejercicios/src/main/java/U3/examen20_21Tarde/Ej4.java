package U3.examen20_21Tarde;

import java.util.Arrays;

public class Ej4 {

    /*

        Define la función convierteStringEnArray con la siguiente cabecera:

        public static int[] convierteArrayEnString(String a)
        Esta función toma como parámetro un String que solamente contiene
        números y devuelve una array con las cifras que contiene el número.
        Por ejemplo,

        si a = "", convierteStringEnArray(a) devuelve un array sin elementos;

        si a = "8", convierteStringEnArray(a) devuelve un array con el número 8;

        si a = 62501, convierteStringEnArray(a) devuelve un array tal como {6, 2, 5, 0, 1 }.

     */

    public static void main(String[] args) {
        String numero1 = "";
        String numero2 = "8";
        String numero3 = "62501";

        int[] resultado1 = convierteStringEnArray(numero1);
        int[] resultado2 = convierteStringEnArray(numero2);
        int[] resultado3 = convierteStringEnArray(numero3);

        // Mostrar los resultados
        System.out.println("Resultado 1: " + Arrays.toString(resultado1));
        System.out.println("Resultado 2: " + Arrays.toString(resultado2));
        System.out.println("Resultado 3: " + Arrays.toString(resultado3));
    }

    public static int[] convierteStringEnArray(String a) {

        int longitud = a.length();

        if (longitud == 0) {
            return new int[0];
        }

        int[] arrayResultado = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            char caracter = a.charAt(i);
            arrayResultado[i] = Character.getNumericValue(caracter);
        }


        return arrayResultado;
    }

}
