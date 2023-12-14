package U3.examenU3_23_24;


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
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la palabra a adivinar:");
        String original = sc.next();

        String parcial = "";

        for (int i = 0; i < original.length(); i++) {
            parcial = parcial + "-";
        }

        while (!original.equals(parcial)) {
            System.out.println("Introduzca una letra: ");
            char letra = sc.next().charAt(0);

            parcial = palabraAhorcado(original, parcial, letra);

            System.out.println(parcial);

        }

    }

    public static String palabraAhorcado(String original, String parcial, char letra) {

        String resultado = "";

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == letra) {
                resultado = resultado + letra;
            } else {
                resultado = resultado + parcial.charAt(i);
            }
        }

        return resultado;
    }
}
