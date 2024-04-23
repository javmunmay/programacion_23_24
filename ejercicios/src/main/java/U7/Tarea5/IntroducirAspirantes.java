package U7.Tarea5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntroducirAspirantes {

    private List<Aspirante> aspirantesList;
    private int contador;

    public IntroducirAspirantes() {
        aspirantesList = new ArrayList<>();
        contador = 1; // Inicializar el contador
    }

    public void insertaAspirante(String nombre, String dni, String telefono) {
        Aspirante aspirante = new Aspirante(nombre, dni, telefono, contador++);
        aspirantesList.add(aspirante);
    }

    public void guardarFicheros() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("aspirantes.dat"));
             PrintWriter idsWriter = new PrintWriter(new FileWriter("ids_aspirantes.dat"))) {

            for (Aspirante aspirante : aspirantesList) {
                outputStream.writeObject(aspirante);
                idsWriter.println(aspirante.getNumeroAspirante());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
