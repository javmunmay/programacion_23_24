package U5.EntregablePrueba21_22Manana;

public class Propiedad {

    protected int AnoDeConstruccion;
    protected String Direccion;
    protected int MetrosCuadrados;

    protected int precio;

    public Propiedad(int anoDeConstruccion, String direccion, int metrosCuadrados, int precio) {
        AnoDeConstruccion = anoDeConstruccion;
        Direccion = direccion;
        MetrosCuadrados = metrosCuadrados;
        this.precio = precio;
    }
}
