package U3.tarea2Cadenas;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        //Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan
        //sus frases con "Javalín, javalón", para después hacer una pausa más o menos larga (la pausa se
        //representa mediante espacios en blanco) y a continuación expresan el mensaje. Existe un dialecto
        //que no comienza sus frases con la muletilla anterior, pero siempre las terminan con un silencio,
        //más o menos prolongado y la coletilla "javalén, len, len". Se pide diseñar un traductor que, en
        //primer lugar, nos diga si la frase está escrita en el idioma de Javalandia (en cualquiera de sus
        //dialectos), y en caso afirmativo, nos muestre el mensaje sin muletillas.


        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca una frase
        System.out.print("Introduce una frase en el idioma de Javalandia: ");
        String frase = scanner.nextLine();

        // Detectar el idioma y mostrar el mensaje sin muletillas
        if (esIdiomaJavalandia(frase)) {
            String mensajeSinMuletillas = quitarMuletillas(frase);
            System.out.println("Mensaje en Javalandia: " + mensajeSinMuletillas);
        } else {
            System.out.println("La frase no está en el idioma de Javalandia.");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Método para verificar si la frase está en el idioma de Javalandia
    private static boolean esIdiomaJavalandia(String frase) {
        return frase.startsWith("Javalín, javalón") && frase.endsWith("javalén, len, len");
    }

    // Método para quitar las muletillas y obtener el mensaje
    private static String quitarMuletillas(String frase) {
        String muletillaInicio = "Javalín, javalón";
        String muletillaFin = "javalén, len, len";

        // Obtener la posición de inicio y fin de mensaje
        int inicio = muletillaInicio.length();
        int fin = frase.length() - muletillaFin.length();

        // Extraer el mensaje sin muletillas
        return frase.substring(inicio, fin);
    }


}
