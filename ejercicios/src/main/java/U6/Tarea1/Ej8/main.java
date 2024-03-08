package U6.Tarea1.Ej8;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        String file1 = "perso1.txt";
        String file2 = "perso2.txt";
        String outputFile = "todos.txt";

        String path = "C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea1\\Ej8\\";

        mergeFiles(path + file1, path + file2, path + outputFile);
    }

    public static void mergeFiles(String file1, String file2, String outputFile) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            List<String> names = new ArrayList<>();

            String line;
            while ((line = reader1.readLine()) != null) {
                names.add(line);
            }
            while ((line = reader2.readLine()) != null) {
                names.add(line);
            }

            Collections.sort(names);

            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }

            reader1.close();
            reader2.close();
            writer.close();

            System.out.println("Merged files successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
