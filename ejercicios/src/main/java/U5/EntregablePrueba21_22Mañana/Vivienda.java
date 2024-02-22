package U5.EntregablePrueba21_22Mañana;

import java.util.Arrays;

public class Vivienda extends Propiedad implements MostrarPrecioVenta {

    protected int numeroBanos;
    protected int numeroHabitaciones;
    protected int CapacidadMax;
    protected Personas[] persona;

    private Vivienda[] viviendas;

    public Vivienda(int anoDeConstruccion, String direccion, int metrosCuadrados, int precio, int numeroBanos, int numeroHabitaciones, int capacidadMax, Personas[] persona) {
        super(anoDeConstruccion, direccion, metrosCuadrados, precio);
        this.numeroBanos = numeroBanos;
        this.numeroHabitaciones = numeroHabitaciones;
        CapacidadMax = capacidadMax;
        persona = new Personas[capacidadMax];
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy una Vivienda con capacidad máxima" + CapacidadMax + " y valgo: " + super.precio);
    }

    //Además deberemos poder ordenar las Viviendas por
    //el número de habitaciones que tengan.

    public void informeHabitaciones() {
        Arrays.sort(viviendas, new informeHabitaciones());
    }


    public void mostrarPropiedad() {
        System.out.println("Fecha: " + java.time.LocalDate.now());
        System.out.println("Clase: Vivienda");
        System.out.println("Año de construcción: " + super.AnoDeConstruccion);
        System.out.println("Dirección: " + super.Direccion);
        System.out.println("Metros cuadrados: " + super.MetrosCuadrados);
        System.out.println("Número de baños: " + numeroBanos);
        System.out.println("Número de habitaciones: " + numeroHabitaciones);
        System.out.println("Capacidad máxima: " + CapacidadMax);
        System.out.println("Precio: " + super.precio);
    }
}
