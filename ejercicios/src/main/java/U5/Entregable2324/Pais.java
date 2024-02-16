package U5.Entregable2324;

public class Pais {
    private String nombre;
    private int numeroParticipantes;

    // Constructor
    public Pais(String nombre, int numeroParticipantes) {
        this.nombre = nombre;
        this.numeroParticipantes = numeroParticipantes;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }
}
