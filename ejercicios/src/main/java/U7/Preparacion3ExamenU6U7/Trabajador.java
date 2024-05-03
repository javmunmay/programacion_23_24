package U7.Preparacion3ExamenU6U7;

import java.io.Serializable;

public class Trabajador implements Serializable {

    public String dni;
    public String nombre;
    public String apellidos;
    public int edad;
    public String FormacionAcademica;

    //dniTrabajador, nombreTrabajador, apellidosTrabajador, edadTrabajador, formacionAcademicaTrabajador para el main
    public Trabajador(String dni, String nombre, String apellidos, int edad, String formacionAcademica) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        FormacionAcademica = formacionAcademica;
    }

    public Trabajador(String dniTrabajador) {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFormacionAcademica() {
        return FormacionAcademica;
    }

    public void setFormacionAcademica(String formacionAcademica) {
        FormacionAcademica = formacionAcademica;
    }


    @Override
    public String toString() {
        return "Trabajador{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", FormacionAcademica='" + FormacionAcademica + '\'' +
                '}';
    }
}
