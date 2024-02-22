package U5.EntregablePrueba21_22Mañana;

public class EquipamientoDeServicios extends Propiedad {

    public EquipamientoDeServicios(int anoDeConstruccion, String direccion, int metrosCuadrados, int precio) {
        super(anoDeConstruccion, direccion, metrosCuadrados, precio);
    }

    public void mostrarPropiedad() {
        System.out.println("Fecha: " + java.time.LocalDate.now());
        System.out.println("Clase: Vivienda");
        System.out.println("Año de construcción: " + super.AnoDeConstruccion);
        System.out.println("Dirección: " + super.Direccion);
        System.out.println("Metros cuadrados: " + super.MetrosCuadrados);
        System.out.println("Tipo de Servicio: " + TipoServicio.OTROS);
        System.out.println("Precio: " + super.precio);
    }

    protected enum TipoServicio {
        EDUCATIVOS,
        SANITARIO,
        DEPORTIVO,
        OTROS
    }
}
