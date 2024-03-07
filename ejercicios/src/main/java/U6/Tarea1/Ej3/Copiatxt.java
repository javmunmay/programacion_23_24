package U6.Tarea1.Ej3;

import java.io.*;

public class Copiatxt {


    public static void main(String[] args) {
        String nombreArchivoFuente = "original.txt";
        String nombreArchivoDestino = "copia.txt";

        File f1 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea1\\Ej3\\" + nombreArchivoFuente);
        File f2 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea1\\Ej3\\" + nombreArchivoDestino);


        try {
            File archivoFuente = new File(nombreArchivoFuente);
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);

            File archivoDestino = new File(nombreArchivoDestino);
            FileWriter fw = new FileWriter(f2);
            BufferedWriter bw = new BufferedWriter(fw);

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            br.close();
            bw.close();
            System.out.println("El archivo se ha duplicado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al duplicar el archivo: " + e.getMessage());
        }
    }
}




