package U6.Tarea2.Ej1;

import java.io.*;

public class main {
    public static void main(String[] args) {
        try {
            // Pedir al usuario que ingrese un número double
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Por favor ingresa un número double: ");
            double numDouble = Double.parseDouble(br.readLine());

            String fileName = "archivo.bin";

            File f1 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea2\\Ej1\\" + fileName);


            // Guardar el número double en el archivo binario
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(f1))) {
                dos.writeDouble(numDouble);
                System.out.println("El número double ha sido guardado en el archivo binario '" + fileName + "'.");
            } catch (IOException e) {
                System.out.println("Error al guardar el número double en el archivo.");
                e.printStackTrace();
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Entrada inválida.");
            e.printStackTrace();
        }
    }
}
