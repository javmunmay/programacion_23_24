package U7.PreparacionExamenU6U7;

import java.io.Serializable;

public class Perro implements Serializable {

    private String nombre;
    private int edad;
    private double peso;
    private boolean vacunasCompletas;
    private Propietario propietario;
    private String raza;

    // Constructor
    public Perro(String nombre, int edad, double peso, boolean vacunasCompletas, Propietario propietario, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunasCompletas = vacunasCompletas;
        this.propietario = propietario;
        this.raza = raza;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacunasCompletas() {
        return vacunasCompletas;
    }

    public void setVacunasCompletas(boolean vacunasCompletas) {
        this.vacunasCompletas = vacunasCompletas;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Método toString para representar el objeto como cadena
    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunasCompletas=" + vacunasCompletas +
                ", propietario=" + propietario +
                ", raza='" + raza + '\'' +
                '}';
    }
}
