package U7.PreparacionExamenU6U7;

import java.io.*;
import java.util.*;

import U7.PreparacionExamenU6U7.Perro;


public class Concurso {
    private String nombreConcurso;
    private String localidad;
    private Map<String, List<Perro>> perrosPorRaza; // Mapa para almacenar perros por raza

    // Constructor
    public Concurso(String nombreConcurso, String localidad) {
        this.nombreConcurso = nombreConcurso;
        this.localidad = localidad;
        this.perrosPorRaza = new HashMap<>();
    }

    // Getter y Setter para nombreConcurso y localidad
    public String getNombreConcurso() {
        return nombreConcurso;
    }

    public void setNombreConcurso(String nombreConcurso) {
        this.nombreConcurso = nombreConcurso;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    // Método para añadir un perro al concurso por su raza
    public void addDog(String raza, Perro perro) {
        List<Perro> perros = perrosPorRaza.getOrDefault(raza, new ArrayList<>());
        perros.add(perro);
        perrosPorRaza.put(raza, perros);
    }

    // Método para descalificar un perro del concurso
    public void disqualifyDog(Perro perro) {
        boolean removed = false;
        for (List<Perro> perros : perrosPorRaza.values()) {
            if (perros.remove(perro)) {
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Perro no inscrito");
        }
    }

    // Método para mostrar los perros de un dueño determinado
    public void ownerDogs(int numeroSocio) {
        boolean found = false;
        for (List<Perro> perros : perrosPorRaza.values()) {
            for (Perro perro : perros) {
                if (perro.getPropietario().getNumeroSocio() == numeroSocio) {
                    System.out.println(perro);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Este socio no tiene perros inscritos");
        }
    }

    // Método para mostrar los perros de una raza ordenados por peso
    public void perrosPorPeso(String raza) {
        List<Perro> perros = perrosPorRaza.getOrDefault(raza, new ArrayList<>());
        perros.sort(Comparator.comparingDouble(Perro::getPeso).reversed());
        perros.forEach(System.out::println);
    }

    // Método para mostrar los perros de una raza ordenados por edad
    public void perrosPorEdad(String raza) {
        List<Perro> perros = perrosPorRaza.getOrDefault(raza, new ArrayList<>());
        perros.sort(Comparator.comparingInt(Perro::getEdad).reversed());
        perros.forEach(System.out::println);
    }

    // Método para cargar perros desde un archivo binario
    public void cargarPerros(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            List<Perro> perros = (List<Perro>) ois.readObject();
            for (Perro perro : perros) {
                addDog(perro.getRaza(), perro);
            }
            System.out.println("Perros cargados correctamente desde " + archivo);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar los perros: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("Error al cargar los perros desde " + archivo, e);
        }
    }

    // Método para guardar perros en un archivo binario
    public void guardarPerros(String archivo) {
        List<Perro> allPerros = new ArrayList<>();
        for (List<Perro> perros : perrosPorRaza.values()) {
            allPerros.addAll(perros);
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(allPerros);
            System.out.println("Perros guardados correctamente en " + archivo);
        } catch (IOException e) {
            throw new RuntimeException("Error al guardar los perros en " + archivo, e);
        }
    }
}