package U7.Tarea4;

public class Empleado extends Persona implements Serializable {
    double sueldo;

    // Constructor de la clase Empleado
    public Empleado(String nombre, String dni, int edad, double estatura, double sueldo) {
        super(nombre, dni, edad, estatura);
        this.sueldo = sueldo;
    }

    // Método toString para mostrar los datos del empleado
    @Override
    public String toString() {
        return super.toString() + ", Sueldo: " + sueldo;
    }
}
