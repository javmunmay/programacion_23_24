package U7.Entregable2021Tarde;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Unidad implements Serializable {
    private String nombreUnidad;
    private Map<Integer, Alumno> alumnos; // Usamos un Map con el ID del alumno como clave


    public Unidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
        this.alumnos = new HashMap<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.put(alumno.getIdAlumno(), alumno); // Añadir al mapa usando el ID del alumno como clave
    }

    public Map<Integer, Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Map<Integer, Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }
}

