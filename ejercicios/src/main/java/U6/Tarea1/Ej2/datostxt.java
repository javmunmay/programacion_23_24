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

        // Escribir en el archivo datos.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt"))) {
            writer.write("Nombre: " + nombre + "\n");
            writer.write("Edad: " + edad + "\n");
            System.out.println("Datos guardados correctamente en datos.txt.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
