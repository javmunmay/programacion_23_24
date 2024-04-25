package U7.Entregable2021Tarde;

import java.io.*;
import java.util.*;
import java.io.Serializable;

public class Instituto implements Serializable {
    private static final long serialVersionUID = 1L;
    String nombre_fichero = "alumnos.dat";
    File f1 = new File("C:\\Users\\javi1\\programacion_23_24\\ejercicios\\src\\main\\java\\U6\\Tarea1\\Ej1\\" + nombre_fichero);
    private Map<String, Unidad> unidades;

    public Instituto() {
        this.unidades = new HashMap<>();
    }

    public void addUnidad(Unidad unidad) {
        unidades.put(unidad.getNombreUnidad(), unidad);
    }


    public void mostrarTodosAlumnosOrdenados() {
        Map<Integer, Alumno> todosLosAlumnos = new HashMap<>();
        for (Unidad unidad : unidades.values()) {
            Map<Integer, Alumno> alumnosUnidad = unidad.getAlumnos(); // Obtener el mapa de alumnos de la unidad
            todosLosAlumnos.putAll(alumnosUnidad); // Agregar todos los alumnos de la unidad al mapa general
        }

        List<Alumno> listaAlumnosOrdenada = new ArrayList<>(todosLosAlumnos.values());
        Collections.sort(listaAlumnosOrdenada, Comparator.comparing(Alumno::getApellidos));

        System.out.println("Todos los alumnos ordenados por apellido:");
        for (Alumno alumno : listaAlumnosOrdenada) {
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellidos: " + alumno.getApellidos());
            System.out.println("DNI: " + alumno.getDni());
            System.out.println("ID Alumno: " + alumno.getIdAlumno());
            // No se puede acceder a la unidad directamente, debes modificar la forma de almacenarla o mostrarla
            System.out.println("Unidad: " + obtenerNombreUnidadAlumno(alumno.getIdAlumno()));
            System.out.println("--------------------------");
        }
    }

    // Método auxiliar para obtener el nombre de la unidad de un alumno por su ID
    private String obtenerNombreUnidadAlumno(int idAlumno) {
        for (Unidad unidad : unidades.values()) {
            Map<Integer, Alumno> alumnosUnidad = unidad.getAlumnos(); // Obtener el mapa de alumnos de la unidad
            if (alumnosUnidad.containsKey(idAlumno)) {
                return unidad.getNombreUnidad(); // Retornar el nombre de la unidad si se encuentra al alumno
            }
        }
        return "Unidad no encontrada";
    }


    public Unidad obtenerUnidadAlumno(int idAlumno) {
        for (Map.Entry<String, Unidad> entry : unidades.entrySet()) {
            Unidad unidad = entry.getValue();
            Map<Integer, Alumno> alumnosUnidad = unidad.getAlumnos(); // Obtener el mapa de alumnos de la unidad
            Alumno alumno = alumnosUnidad.get(idAlumno); // Obtener al alumno por su ID del mapa de alumnos
            if (alumno != null) {
                return unidad; // Si se encuentra al alumno, retornar la unidad
            }
        }
        return null; // Si no se encuentra el alumno en ninguna unidad
    }


    public void mostrarAlumnosUnidad(String nombreUnidad) {
        Unidad unidad = unidades.get(nombreUnidad);
        if (unidad != null) {
            Map<Integer, Alumno> alumnosUnidad = unidad.getAlumnos(); // Obtener el mapa de alumnos de la unidad
            List<Alumno> listaAlumnos = new ArrayList<>(alumnosUnidad.values()); // Obtener una lista de alumnos a partir de los valores del mapa
            Collections.sort(listaAlumnos, Comparator.comparing(Alumno::getDni)); // Ordenar la lista de alumnos por DNI
            for (Alumno alumno : listaAlumnos) {
                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Apellidos: " + alumno.getApellidos());
                System.out.println("DNI: " + alumno.getDni());
                System.out.println("ID Alumno: " + alumno.getIdAlumno());
                System.out.println("--------------------------");
            }
        } else {
            System.out.println("No se encontró la unidad con nombre: " + nombreUnidad);
        }
    }


    public void addAlumnoUnidad(Alumno alumno, String nombreUnidad) {
        Unidad unidadExistente = unidades.get(nombreUnidad);

        if (unidadExistente == null) {
            unidadExistente = new Unidad(nombreUnidad);
            unidades.put(nombreUnidad, unidadExistente);
        }

        unidadExistente.agregarAlumno(alumno);
    }


    public void cargarAlumnos() {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(f1))) {
            List<Alumno> alumnos = (List<Alumno>) entrada.readObject();
            for (Alumno alumno : alumnos) {
                String nombreUnidad = alumno.getUnidad().getNombreUnidad();
                Unidad unidadExistente = unidades.get(nombreUnidad);
                if (unidadExistente == null) {
                    unidadExistente = new Unidad(nombreUnidad);
                    unidades.put(nombreUnidad, unidadExistente);
                }
                unidadExistente.agregarAlumno(alumno);
            }
            System.out.println("Alumnos cargados correctamente.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar los alumnos: " + e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void guardarAlumnos() {
        List<Alumno> todosLosAlumnos = new ArrayList<>();
        for (Map.Entry<String, Unidad> entry : unidades.entrySet()) {
            Unidad unidad = entry.getValue();
            Map<Integer, Alumno> alumnosUnidad = unidad.getAlumnos(); // Obtener el mapa de alumnos de la unidad
            todosLosAlumnos.addAll(alumnosUnidad.values()); // Agregar todos los valores (alumnos) del mapa a la lista
        }

        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(f1))) {
            salida.writeObject(todosLosAlumnos);
            System.out.println("Alumnos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los alumnos: " + e.getMessage());
        }
    }


}
