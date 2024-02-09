package SistemaInformatico.Ej2;

import java.io.*;

public class PazBinario {

    public static void escribirEnArchivoBinario(String nombreArchivo, MensajePaz mensaje) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            outputStream.writeObject(mensaje);
            System.out.println("Información escrita en el archivo binario exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo binario: " + e.getMessage());
        }
    }

    public static void leerArchivoBinarioYMostrar(String nombreArchivo) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            MensajePaz mensaje = (MensajePaz) inputStream.readObject();
            System.out.println("Contenido del archivo binario:");
            System.out.println(mensaje.contenido);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer el archivo binario: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String nombreArchivoBinario = "DiaDeLaPaz.bin";
        MensajePaz mensaje = new MensajePaz("En la paz encontramos la tranquilidad.");

        // Escribir y leer fichero binario
        escribirEnArchivoBinario(nombreArchivoBinario, mensaje);
        leerArchivoBinarioYMostrar(nombreArchivoBinario);
    }

    static class MensajePaz implements Serializable {
        private static final long serialVersionUID = 1L; // Identificador de versión para la serialización
        String contenido;

        public MensajePaz(String contenido) {
            this.contenido = contenido;
        }
    }
}


