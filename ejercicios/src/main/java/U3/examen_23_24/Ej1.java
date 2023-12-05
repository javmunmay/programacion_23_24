package U3.examen_23_24;

import java.util.Scanner;

public class Ej1 {

    /*

        Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas (la cadena a adivinar y el resultado parcial) y
        un carácter a buscar en la cadena a adivinar. Debe devolver el resultado de encontrar ese character en la cadena a adivinar.

        La función tendrá el siguiente prototipo:

        public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra)
        En el programa principal, se debe pedir al usuario que introduzca una palabra a adivinar y un carácter a buscar en la cadena.
        Se pedirá caracteres hasta que se consiga adivinar la palabra completa.

        NOTA: La palabra a adivinar no contendrá tildes ni caracteres extraños, además será en minúsculas para simplificar el ejercicio.

        Ejemplo:

        palabraAhorcado("programacion","------------",'o') debe devolver "--o-------o-"
        palabraAhorcado("programacion","--o-------on",'a') debe devolver "--o--a-a--on"
        palabraAhorcado("hola","----",'x') debe devolver "----"

     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] resultadoFinalMatriz = palabraAhorcado("programacion", "------------", 'o');

        for (int i = 0; i < resultadoFinalMatriz.length; i++) {

            System.out.println();

        }

        System.out.println("Introduce una palabra a  adivinar: ");
        String palabra = scanner.next();

        System.out.println("Introduzca un caracter a buscar en la cadena: ");
        String caracter = scanner.next();

        //palabraAhorcado(resultadoFinalMatriz);

    }

    public static String [] palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra){

        cadena_a_adivinar = cadena_a_adivinar.replaceAll(" ", "");
        // Elimina los espacios

        int filas = (int) Math.ceil((double) cadena_a_adivinar.length());
        String[] matriz = new String[filas];
        int contador = 0;

        for (int i = 0; i < filas; i++) {

        }

        return matriz;

    }
}
