package U6.Tarea2.Ej4;

import java.io.*;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        try {
            // Pedir al usuario que ingrese un entero n
            Scanner scanner = new Scanner(System.in);
            System.out.print("Por favor ingresa un entero n: ");
            int n = scanner.nextInt();

            // Crear una tabla para almacenar los números double
            double[] numerosDouble = new double[n];

            // Pedir al usuario que ingrese n números double
            for (int i = 0; i < n; i++) {
                System.out.print("Por favor ingresa el número double " + (i + 1) + ": ");
                numerosDouble[i] = scanner.nextDouble();
            }

            //nombre del archivo binario

            String fileName = "archivo_guarda.bin";

            File f1 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea2\\Ej4\\" + fileName);


            // Guardar la tabla de números double en el archivo binario
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(f1))) {
                for (double num : numerosDouble) {
                    dos.writeDouble(num);
                }
                System.out.println("La tabla de números double ha sido guardada en el archivo binario '" + f1 + "'.");
            } catch (IOException e) {
                System.out.println("Error al guardar la tabla de números double en el archivo.");
                e.printStackTrace();
            }

            // Cerrar el scanner
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
