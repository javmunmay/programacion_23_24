package U6.Tarea2.Ej6;

import java.io.*;

public class main {
    public static void main(String[] args) {
        // Pedir al usuario el nombre del archivo binario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String fileName = "archivo_guarda.bin";
        File f1 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea2\\Ej4\\" + fileName);


        // Leer los números double del archivo binario y mostrarlos por pantalla
        try (DataInputStream dis = new DataInputStream(new FileInputStream(f1))) {
            while (true) {
                try {
                    double numDouble = dis.readDouble();
                    System.out.println(numDouble);
                } catch (EOFException e) {
                    // Se alcanzó el final del archivo
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo binario.");
            e.printStackTrace();
        }
    }
}
