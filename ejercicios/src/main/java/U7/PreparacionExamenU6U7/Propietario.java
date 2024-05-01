package U7.PreparacionExamenU6U7;

import java.io.Serializable;

public class Propietario implements Serializable {
    private String nombre;
    private String apellidos;
    private int numeroSocio;
    private String paisOrigen;

    public Propietario(String nombre, String apellidos, int numeroSocio, String paisOrigen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroSocio = numeroSocio;
        this.paisOrigen = paisOrigen;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    // toString
    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroSocio=" + numeroSocio +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }
}