package U6.Tarea2.Ej2;

import java.io.*;

public class main {
    public static void main(String[] args) {
        try {
            // Nombre del archivo binario
            String fileName = "archivo.bin";

            File f1 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea2\\Ej1\\" + fileName);


            // Abrir el archivo binario y leer el número double
            try (DataInputStream dis = new DataInputStream(new FileInputStream(f1))) {
                double numDouble = dis.readDouble();
                System.out.println("El número double leído del archivo '" + fileName + "' es: " + numDouble);
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
