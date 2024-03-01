package U6.Tarea1.Ej1;

import java.io.*;
import java.util.Scanner;


public class Pruebatxt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ESCRIBE EL NOMBRE DEL FICHERO  por defecto ");
        String nombre_fichero = sc.nextLine();
        if (nombre_fichero.isEmpty()) {
            nombre_fichero = "prueba.txt";
        }


        File f1 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea1\\Ej1\\" + nombre_fichero);


        String texto = "";
        try (BufferedReader in = new BufferedReader(new FileReader(f1))) {
            String linea;
            while ((linea = in.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(texto);
    }


}
