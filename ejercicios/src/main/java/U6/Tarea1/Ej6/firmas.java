package U6.Tarea1.Ej6;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class firmas {
    private static final String NOMBRE_ARCHIVO = "firmas.txt";

    public static void main(String[] args) {
        try {
            Set<String> firmas = cargarFirmas();

            // Mostrar las firmas existentes
            System.out.println("Firmas existentes:");
            for (String firma : firmas) {
                System.out.println(firma);
            }

            // Insertar nueva firma si se solicita
            if (args.length > 0 && args[0].equalsIgnoreCase("insertar")) {
                insertarFirma(firmas);
            }
        } catch (IOException e) {
            System.err.println("Error al manipular el archivo: " + e.getMessage());
        }
    }

    private static Set<String> cargarFirmas() throws IOException {
        Set<String> firmas = new HashSet<>();

        File archivo = new File(NOMBRE_ARCHIVO);
        if (archivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    firmas.add(linea);
                }
            }
        }

        return firmas;
    }

    private static void insertarFirma(Set<String> firmas) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Inserta el nombre a firmar: ");
        String nuevaFirma = reader.readLine();

        if (firmas.contains(nuevaFirma)) {
            System.out.println("Ese nombre ya está en el libro de firmas.");
        } else {
            firmas.add(nuevaFirma);
            guardarFirmas(firmas);
            System.out.println("Nombre añadido al libro de firmas correctamente.");
        }
    }

    private static void guardarFirmas(Set<String> firmas) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO))) {
            for (String firma : firmas) {
                writer.write(firma);
                writer.newLine();
            }
        }
    }
}
