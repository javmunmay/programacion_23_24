package U7.Tarea3Map.ej4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Traductor {
    private Map<String, String> diccionario;I

    public Traductor(String nombreArchivo) {
        diccionario = new HashMap<>();
        cargarDiccionario(nombreArchivo);
    }

    public static void main(String[] args) {
        Traductor traductor = new Traductor("diccionario.txt");

        // Ejemplo de uso
        String palabra = "hola";
        System.out.println(palabra + " en inglés es: " + traductor.traducir(palabra));

        String frase = "gracias por todo";
        System.out.println("Traducción de la frase: " + traductor.traducirFrase(frase));
    }

    private void cargarDiccionario(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(", ");
                if (partes.length == 2) {
                    diccionario.put(partes[0], partes[1]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar el diccionario desde el archivo: " + e.getMessage());
        }
    }

    public String traducir(String palabra) {
        return diccionario.getOrDefault(palabra, "Palabra no encontrada en el diccionario");
    }

    public String traducirFrase(String frase) {
        StringBuilder traduccion = new StringBuilder();
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            traduccion.append(traducir(palabra)).append(" ");
        }
        return traduccion.toString().trim();
    }
}
