package U7.U6U7_Entregable_2324;

import java.io.*;
import java.util.*;
import java.io.Serializable;
public class Maraton implements Serializable{

    private Map<Integer, Atleta> atletas;

    public Maraton() {
        atletas = new HashMap<>();
    }

    public void cargarAtletas(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            atletas = (Map<Integer, Atleta>) ois.readObject();
            System.out.println("Atletas cargados correctamente.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar los alumnos: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



    public void guardarAtletas(String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(atletas);
            System.out.println("Atletas guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los alumnos: " + e.getMessage());
        }
    }

    public void inscribirAtleta(Atleta atleta) {
        atletas.put(atleta.getDorsal(), atleta);
    }

    public void guardarTiempo(int dorsal, int tiempo) {
        Atleta atleta = atletas.get(dorsal);
        if (atleta != null) {
            atleta.setMarca(tiempo);
        }
    }

    public void borrarAtleta(int dorsal) {
        atletas.remove(dorsal);

    }

    public void mostrarListaFinishers() {
        List<Atleta> finishers = new ArrayList<>(atletas.values());
        finishers.sort(Comparator.comparingInt(a -> a.isFinisher() ? a.getMarca() : Integer.MAX_VALUE));
        for (Atleta atleta : finishers) {
            if (atleta.isFinisher()) {
                System.out.println(atleta);
            }
        }
    }

    public void mostrarListaCategoria(String categoria) {
        List<Atleta> atletasCategoria = new ArrayList<>(atletas.values());
        atletasCategoria.removeIf(a -> !a.getCategoria().equals(categoria));
        atletasCategoria.sort(Comparator.comparingInt(a -> a.isFinisher() ? a.getMarca() : Integer.MAX_VALUE));
        for (Atleta atleta : atletasCategoria) {
            System.out.println(atleta);
        }
    }


    public int participantesPorPais(String pais) {
        return (int) atletas.values().stream()
                .filter(atleta -> atleta.getPais().equals(pais))
                .count();
    }


}
