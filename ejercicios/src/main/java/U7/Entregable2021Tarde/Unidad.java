package U7.Entregable2021Tarde;

import java.util.List;
import java.util.ArrayList;

public class Unidad implements Serializable {
    protected String nombreUnidad;
    protected List<Alumno> alumnos;

    public Unidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }
}

