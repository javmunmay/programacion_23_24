package U7.Tarea5;

public class Aspirante implements Serializable {
    private static final long serialVersionUID = 1L; // Identificador para la serialización
    private String nombre;
    private String dni;
    private String telefono;
    private int numeroAspirante;

    public Aspirante(String nombre, String dni, String telefono, int numeroAspirante) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.numeroAspirante = numeroAspirante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getNumeroAspirante() {
        return numeroAspirante;
    }

    @Override
    public String toString() {
        return "Aspirante{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono='" + telefono + '\'' +
                ", numeroAspirante=" + numeroAspirante +
                '}';
    }
}
