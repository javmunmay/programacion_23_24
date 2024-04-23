package U7.Tarea5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalificacionPruebas {

    private List<Integer> idsAspirantes;

    public CalificacionPruebas() {
        idsAspirantes = new ArrayList<>();
    }

    public void leerIdsAspirantes() {
        try (Scanner scanner = new Scanner(new File("ids_aspirantes.dat"))) {
            while (scanner.hasNextLine()) {
                int id = Integer.parseInt(scanner.nextLine());
                idsAspirantes.add(id);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void guardarFichero() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("calificaciones.dat"))) {
            for (Integer id : idsAspirantes) {
                outputStream.writeObject(id);
                // Aquí podrías leer la calificación de la última prueba y escribirla
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
