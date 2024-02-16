package U5.Entregable2324;

public abstract class Participante {
    private String nombre;
    private int edad;

    // Constructor
    public Participante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    // Método abstracto
    public abstract void hacerJuramento();
}

