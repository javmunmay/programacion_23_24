package U5.EntregablePrueba21_22Manana;

import java.util.Arrays;

public class Vivienda extends Propiedad implements MostrarPrecioVenta {

    protected int numeroBanos;
    protected int numeroHabitaciones;
    protected int CapacidadMax;

    protected Personas[] personas;
    protected int indice_integrantes; //Llevar el numero actual de integrantes en las agrupaciones
    private Vivienda[] viviendas;

    //Además deberemos poder ordenar las Viviendas por
    //el número de habitaciones que tengan.

    public Vivienda(int anoDeConstruccion, String direccion, int metrosCuadrados, int precio, int numeroBanos, int numeroHabitaciones, int capacidadMax, Personas[] persona) {
        super(anoDeConstruccion, direccion, metrosCuadrados, precio);
        this.numeroBanos = numeroBanos;
        this.numeroHabitaciones = numeroHabitaciones;
        CapacidadMax = capacidadMax;
        personas = new Personas[capacidadMax];
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy una Vivienda con capacidad máxima" + CapacidadMax + " y valgo: " + super.precio);
    }

    public void informeHabitaciones() {
        Arrays.sort(viviendas, new informeHabitaciones());
    }


    //Metodo añadir_persona

    public void annadirPersona(Personas i) {
        if (indice_integrantes == personas.length) {
            personas = Arrays.copyOf(personas, personas.length + 1);
        }
        personas[indice_integrantes] = i;
        indice_integrantes++;

    }

    //Metodo quitar_persona

    public boolean quitar_persona(Personas i) {

        Personas[] copia = new Personas[personas.length - 1];
        int contador_copia = 0;
        for (int j = 0; j < personas.length; j++) {
            if (!personas[j].equals(i)) {
                copia[contador_copia] = personas[j];
                contador_copia++;
                return true;
            }
        }
        personas = copia;
        return false;

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
