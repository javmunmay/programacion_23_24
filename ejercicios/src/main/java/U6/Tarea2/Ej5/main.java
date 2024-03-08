package U6.Tarea2.Ej5;

import java.io.*;

public class main {
    public static void main(String[] args) {
        try {
            // Nombre del archivo binario
            String fileName = "archivo_guarda.bin";

            File f1 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea2\\Ej4\\" + fileName);


            // Leer la tabla de números double desde el archivo binario
            try (DataInputStream dis = new DataInputStream(new FileInputStream(f1))) {
                // Determinar la cantidad de números en la tabla
                int numDoubles = dis.available() / 8; // cada double ocupa 8 bytes

                // Crear un arreglo para almacenar los números double
                double[] numerosDouble = new double[numDoubles];

                // Leer los números double desde el archivo
                for (int i = 0; i < numDoubles; i++) {
                    numerosDouble[i] = dis.readDouble();
                }

                // Mostrar los números double por consola
                System.out.println("Contenido de la tabla de números double:");
                for (double num : numerosDouble) {
                    System.out.println(num);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo binario.");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
