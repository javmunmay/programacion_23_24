package U6.Tarea1.Ej4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cartatxt {
    public static void main(String[] args) {
        // Nombre del archivo de texto a leer
        String nombreArchivo = "carta.txt";

        File f1 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea1\\Ej4\\" + nombreArchivo);


        // Contadores para caracteres, líneas y palabras
        int contadorCaracteres = 0;
        int contadorLineas = 0;
        int contadorPalabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(f1))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Contar caracteres y líneas
                contadorCaracteres += linea.length();
                contadorLineas++;

                // Contar palabras
                String[] palabras = linea.split(" ");
                contadorPalabras += palabras.length;
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        // Imprimir resultados
        System.out.println("Número de caracteres: " + contadorCaracteres);
        System.out.println("Número de líneas: " + contadorLineas);
        System.out.println("Número de palabras: " + contadorPalabras);
    }
}
