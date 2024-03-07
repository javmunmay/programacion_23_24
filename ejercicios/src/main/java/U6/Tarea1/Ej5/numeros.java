package U6.Tarea1.Ej5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class numeros {

    public static void main(String[] args) {
        // Nombre del archivo de texto a leer
        String nombreArchivo = "numeros.txt";

        File f1 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea1\\Ej5\\" + nombreArchivo);


        // Variables para almacenar el menor y el mayor
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;

        try (BufferedReader br = new BufferedReader(new FileReader(f1))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Convertir la línea a un número entero
                int numero = Integer.parseInt(linea.trim());

                // Actualizar el menor y el mayor
                menor = Math.min(menor, numero);
                mayor = Math.max(mayor, numero);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir un número: " + e.getMessage());
            return;
        }

        // Imprimir resultados
        System.out.println("El número menor es: " + menor);
        System.out.println("El número mayor es: " + mayor);
    }
}
