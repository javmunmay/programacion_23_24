package U7.Entregable2021Tarde;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Instituto implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Unidad> unidades;

    public Instituto() {
        this.unidades = new ArrayList<>();
    }

    public void addUnidad(Unidad unidad) {
        unidades.add(unidad);
    }

    public void mostrarTodosAlumnosOrdenados() {
        List<Alumno> todosLosAlumnos = new ArrayList<>();
        for (Unidad unidad : unidades) {
            todosLosAlumnos.addAll(unidad.getAlumnos());
        }
    }

    public Unidad obtenerUnidadAlumno(int idAlumno) {
        for (Unidad unidad : unidades) {
            for (Alumno alumno : unidad.getAlumnos()) {
                if (alumno.getIdAlumno() == idAlumno) {
                    return unidad;
                }
            }
        }
        return null; // Si no se encuentra el alumno
    }


    public void mostrarAlumnosUnidad(String nombreUnidad) {
        for (Unidad unidad : unidades) {
            if (unidad.getNombreUnidad().equals(nombreUnidad)) {
                List<Alumno> alumnosUnidad = unidad.getAlumnos();
                Collections.sort(alumnosUnidad, Comparator.comparing(Alumno::getDni));
                for (Alumno alumno : alumnosUnidad) {
                    System.out.println("Nombre: " + alumno.getNombre());
                    System.out.println("Apellidos: " + alumno.getApellidos());
                    System.out.println("DNI: " + alumno.getDni());
                    System.out.println("ID Alumno: " + alumno.getIdAlumno());
                    System.out.println("--------------------------");
                }
                return;
            }
        }
        System.out.println("No se encontró la unidad con nombre: " + nombreUnidad);
    }

    public void addAlumnoUnidad(Alumno alumno, String nombreUnidad) {
        Unidad unidadExistente = null;
        for (Unidad unidad : unidades) {
            if (unidad.getNombreUnidad().equals(nombreUnidad)) {
                unidadExistente = unidad;
                break;
            }
        }

        if (unidadExistente == null) {
            unidadExistente = new Unidad(nombreUnidad);
            unidades.add(unidadExistente);
        }

        unidadExistente.agregarAlumno(alumno);
    }

    public void cargarAlumnos() {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("alumnos.dat"))) {
            List<Alumno> alumnos = (List<Alumno>) entrada.readObject();
            for (Alumno alumno : alumnos) {
                addAlumnoUnidad(alumno, alumno.getUnidad().getNombreUnidad());
            }
            System.out.println("Alumnos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los alumnos: " + e.getMessage());
        }
    }

    public void guardarAlumnos() {
        List<Alumno> todosLosAlumnos = new ArrayList<>();
        for (Unidad unidad : unidades) {
            todosLosAlumnos.addAll(unidad.getAlumnos());
        }

        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("alumnos.dat"))) {
            salida.writeObject(todosLosAlumnos);
            System.out.println("Alumnos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los alumnos: " + e.getMessage());
        }
    }


}
