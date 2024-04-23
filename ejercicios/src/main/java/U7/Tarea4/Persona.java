package U7.Tarea4;

public class Persona implements Serializable {
    String nombre;
    String dni;
    int edad;
    double estatura;

    // Constructor de la clase Persona
    public Persona(String nombre, String dni, int edad, double estatura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Método toString para mostrar los datos de la persona
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Edad: " + edad + ", Estatura: " + estatura;
    }
}
