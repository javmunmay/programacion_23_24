package U5.EntregablePrueba21_22Mañana;

public class Local extends Propiedad {
    protected String propietario;

    public Local(int anoDeConstruccion, String direccion, int metrosCuadrados, int precio, String propietario) {
        super(anoDeConstruccion, direccion, metrosCuadrados, precio);
        this.propietario = propietario;
    }

    public void mostrarPropiedad() {
        System.out.println("Fecha: " + java.time.LocalDate.now());
        System.out.println("Clase: Vivienda");
        System.out.println("Año de construcción: " + super.AnoDeConstruccion);
        System.out.println("Dirección: " + super.Direccion);
        System.out.println("Metros cuadrados: " + super.MetrosCuadrados);
        System.out.println("Propietario: " + propietario);
        System.out.println("Precio: " + super.precio);
    }
}