package U5.Tarea1.Ej7;

public class Etiqueta {

    String nombreDestinatario;
    String direccion;

    public Etiqueta(String nombreDestinatario, String direccion) {
        this.nombreDestinatario = nombreDestinatario;
        this.direccion = direccion;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
