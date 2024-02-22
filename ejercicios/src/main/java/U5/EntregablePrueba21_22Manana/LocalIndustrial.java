package U5.EntregablePrueba21_22Manana;

public class LocalIndustrial extends Local implements MostrarPrecioVenta {


    protected double consumoElectrico;

    public LocalIndustrial(int anoDeConstruccion, String direccion, int metrosCuadrados, int precio, String propietario, double consumoElectrico) {
        super(anoDeConstruccion, direccion, metrosCuadrados, precio, propietario);
        this.consumoElectrico = consumoElectrico;
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un local Industrial con un consumo maximo " + consumoElectrico + " y valgo: " + super.precio);
    }


    public void mostrarPropiedad() {
        System.out.println("Fecha: " + java.time.LocalDate.now());
        System.out.println("Clase: Vivienda");
        System.out.println("Año de construcción: " + super.AnoDeConstruccion);
        System.out.println("Dirección: " + super.Direccion);
        System.out.println("Metros cuadrados: " + super.MetrosCuadrados);
        System.out.println("Consumo Electrico: " + consumoElectrico);
        System.out.println("Precio: " + super.precio);
    }
}
