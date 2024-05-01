package U7.Preparacion2ExamenU6U7;

import java.io.Serializable;

public class Paciente implements Serializable {
    private String nombre;
    private int edad;
    private double peso;
    private boolean vacunasCompletas;
    private Medico medicoTratante;
    private char cepa;

    // Constructor
    public Paciente(String nombre, int edad, double peso, boolean vacunasCompletas, Medico medicoTratante, char cepa) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunasCompletas = vacunasCompletas;
        this.medicoTratante = medicoTratante;
        this.cepa = cepa;
    }

    // Getters y Setters
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

    public Medico getMedicoTratante() {
        return medicoTratante;
    }

    public void setMedicoTratante(Medico medicoTratante) {
        this.medicoTratante = medicoTratante;
    }

    public char getCepa() {
        return cepa;
    }

    public void setCepa(char cepa) {
        this.cepa = cepa;
    }

    // toString para mostrar información del paciente
    @Override
    public String toString() {
        return "Paciente: " + nombre + ", Edad: " + edad + ", Peso: " + peso +
                ", Vacunas: " + (vacunasCompletas ? "Completas" : "Incompletas") +
                ", Médico: " + medicoTratante.getNombre() + " " + medicoTratante.getApellidos() +
                ", Cepa: " + cepa;
    }
}

