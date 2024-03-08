package U6.Tarea2.Ej7;

import java.io.*;

public class main {
    public static void main(String[] args) {
        try {
            // Pedir al usuario que ingrese una frase
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Por favor ingresa una frase: ");
            String frase = br.readLine();

            // nombre del archivo binario

            String fileName = "frase.bin";
            File f1 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea2\\Ej7\\" + fileName);


            // Guardar la frase en el archivo binario
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(f1))) {
                dos.writeUTF(frase);
                System.out.println("La frase ha sido guardada en el archivo binario '" + fileName + "'.");
            } catch (IOException e) {
                System.out.println("Error al guardar la frase en el archivo binario.");
                e.printStackTrace();
            }

            // Leer la frase del archivo binario y mostrarla por pantalla
            try (DataInputStream dis = new DataInputStream(new FileInputStream(f1))) {
                String fraseRecuperada = dis.readUTF();
                System.out.println("La frase recuperada del archivo binario es: " + fraseRecuperada);
            } catch (IOException e) {
                System.out.println("Error al leer la frase del archivo binario.");
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
