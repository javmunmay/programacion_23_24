package U6.Tarea2.Ej3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        // Nombre del archivo binario
        String fileName = "numeros_enteros.bin";

        File f1 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea2\\Ej3\\" + fileName);


        // Pedir números enteros positivos por consola y guardarlos en el archivo binario
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(f1))) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<Integer> numeros = new ArrayList<>();

            System.out.println("Introduce números enteros positivos (introduce un número negativo para terminar): ");
            while (true) {
                String input = br.readLine();
                int numero = Integer.parseInt(input);

                if (numero < 0)
                    break;

                dos.writeInt(numero);
                numeros.add(numero);
            }

            // Leer del archivo todos los enteros guardados y mostrarlos por pantalla
            try (DataInputStream dis = new DataInputStream(new FileInputStream(f1))) {
                System.out.println("Números enteros guardados en el archivo:");
                while (true) {
                    int numero = dis.readInt();
                    System.out.println(numero);
                }
            } catch (EOFException e) {
                // Se alcanzó el final del archivo
            } catch (IOException e) {
                System.out.println("Error al leer el archivo binario.");
                e.printStackTrace();
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Entrada inválida.");
            e.printStackTrace();
        }
    }

}
