package U5.EntregablePrueba21_22Manana;

public class LocalComercial extends Local implements MostrarPrecioVenta {

    protected String Descripcion;

    public LocalComercial(int anoDeConstruccion, String direccion, int metrosCuadrados, int precio, String propietario, String descripcion) {
        super(anoDeConstruccion, direccion, metrosCuadrados, precio, propietario);
        Descripcion = descripcion;
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy una LocalComercial que me dedico: " + Descripcion + " y valgo: " + super.precio);
    }

    public void mostrarPropiedad() {
        System.out.println("Fecha: " + java.time.LocalDate.now());
        System.out.println("Clase: Vivienda");
        System.out.println("Año de construcción: " + super.AnoDeConstruccion);
        System.out.println("Dirección: " + super.Direccion);
        System.out.println("Metros cuadrados: " + super.MetrosCuadrados);
        System.out.println("Descripcion: " + Descripcion);
        System.out.println("Precio: " + super.precio);
    }
}
