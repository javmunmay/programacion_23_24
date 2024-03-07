package U6.Tarea1.Ej2;

import java.io.*;
import java.util.Scanner;

public class datostxt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir nombre y edad al usuario
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        String edad = sc.nextLine();

        String nombre_fichero = "datos.txt";
        File f1 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea1\\Ej2\\" + nombre_fichero);


        // Escribir en el archivo datos.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f1))) {
            writer.write("Nombre: " + nombre + "\n");
            writer.write("Edad: " + edad + "\n");
            System.out.println("Datos guardados correctamente en datos.txt.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
