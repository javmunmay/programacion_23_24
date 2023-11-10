package U3.tarea1Funciones;

public class Ej6 {
    public static void main(String[] args) {
        //Crear una función que, mediante un booleano, indique si el carácter que se pasa como parámetro de entrada corresponde con una vocal.

        char caracter = 'a';
        boolean esVocal = esVocal(caracter);
        System.out.println(esVocal); // Esto imprimirá true
    }

    static boolean esVocal(char caracter) {
        // Definimos las vocales en minúsculas y mayúsculas
        String vocales = "aeiouAEIOU";

        // Verificamos si el carácter está en la cadena de vocales
        return vocales.indexOf(caracter) != -1;
    }
}


