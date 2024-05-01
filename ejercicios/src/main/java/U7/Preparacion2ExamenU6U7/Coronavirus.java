package U7.Preparacion2ExamenU6U7;

import java.io.*;
import java.util.*;

public class Coronavirus implements Serializable {
    private String nombreVirus;
    private String localidadOrigen;
    private Map<Character, List<Paciente>> pacientesPorCepa;

    // Constructor
    public Coronavirus(String nombreVirus, String localidadOrigen) {
        this.nombreVirus = nombreVirus;
        this.localidadOrigen = localidadOrigen;
        this.pacientesPorCepa = new HashMap<>();
    }

    // Método para añadir paciente a la lista de una cepa
    public void addPaciente(char cepa, Paciente paciente) {
        List<Paciente> pacientes = pacientesPorCepa.computeIfAbsent(cepa, k -> new ArrayList<>());
        pacientes.add(paciente);
    }

    // Método para dar de alta un paciente
    public void darDeAltaPaciente(Paciente paciente) {
        for (List<Paciente> pacientes : pacientesPorCepa.values()) {
            if (pacientes.remove(paciente)) {
                System.out.println("Paciente dado de alta.");
                return;
            }
        }
        System.out.println("No se ha encontrado el paciente.");
    }

    // Método para mostrar pacientes de un médico
    public void pacientesDeUnDoctor(int numColegiado) {
        boolean encontrado = false;
        for (List<Paciente> pacientes : pacientesPorCepa.values()) {
            for (Paciente paciente : pacientes) {
                if (paciente.getMedicoTratante().getNumColegiado() == numColegiado) {
                    System.out.println(paciente);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("Este médico/a no lleva ningún paciente.");
        }
    }

    // Método para mostrar pacientes de una cepa ordenados por peso
    public void pacientesporPeso(char cepa) {
        List<Paciente> pacientes = pacientesPorCepa.getOrDefault(cepa, new ArrayList<>());
        pacientes.sort(Comparator.comparingDouble(Paciente::getPeso).reversed());
        pacientes.forEach(System.out::println);
    }

    // Método para mostrar pacientes de una cepa ordenados por edad
    public void pacientesporEdad(char cepa) {
        List<Paciente> pacientes = pacientesPorCepa.getOrDefault(cepa, new ArrayList<>());
        pacientes.sort(Comparator.comparingInt(Paciente::getEdad).reversed());
        pacientes.forEach(System.out::println);
    }

    // Método para cargar pacientes desde un archivo binario
    public void cargarPacientes(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            List<Paciente> pacientes = (List<Paciente>) ois.readObject();
            for (Paciente paciente : pacientes) {
                addPaciente(paciente.getCepa(), paciente);
            }
            System.out.println("Pacientes cargados correctamente desde " + archivo);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar los pacientes: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("Error al cargar los pacientes desde " + archivo, e);
        }
    }

    // Método para guardar pacientes en un archivo binario
    public void guardarPacientes(String archivo) {
        List<Paciente> allPacientes = new ArrayList<>();
        for (List<Paciente> pacientes : pacientesPorCepa.values()) {
            allPacientes.addAll(pacientes);
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(allPacientes);
            System.out.println("Pacientes guardados correctamente en " + archivo);
        } catch (IOException e) {
            throw new RuntimeException("Error al guardar los pacientes en " + archivo, e);
        }
    }
}
