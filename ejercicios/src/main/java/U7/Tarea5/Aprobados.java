package U7.Tarea5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Aprobados {

    private List<Integer> idsAspirantes;
    private List<Double> calificaciones;

    public Aprobados() {
        idsAspirantes = new ArrayList<>();
        calificaciones = new ArrayList<>();
    }

    public void leerFicheros() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("calificaciones.dat"));
             ObjectInputStream aspirantesStream = new ObjectInputStream(new FileInputStream("aspirantes.dat"))) {

            while (true) {
                try {
                    int id = (int) inputStream.readObject();
                    double calificacion = calcularMedia(id); // Aquí deberías calcular la media
                    idsAspirantes.add(id);
                    calificaciones.add(calificacion);
                    Aspirante aspirante = (Aspirante) aspirantesStream.readObject();
                    System.out.println(aspirante.toString() + " Calificación Media: " + calificacion);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    private double calcularMedia(int id) {
        // Aquí implementa el cálculo de la media para un aspirante dado su ID
        return 0.0; // Solo es un placeholder
    }

    public void generarInforme() {
        // Aquí podrías ordenar la lista de acuerdo al nombre de los aspirantes antes de mostrarla
        System.out.println("Nombre\tDNI\tCalificación Media");
        for (int i = 0; i < idsAspirantes.size(); i++) {
            System.out.println(idsAspirantes.get(i) + "\t" + calificaciones.get(i));
        }
    }

}
