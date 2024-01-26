package U4.Entregable23_24;

public class Escenario {

    private String nombre;
    private String ubicacion;
    private int capacidad;
    private Cantante[] listaCantantes;
    private int numCantantes;

    public Escenario(String nombre, String ubicacion, int capacidad, int maxCantantes) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.listaCantantes = new Cantante[maxCantantes];
        this.numCantantes = 0;

    }


    public void agregarCantante(Cantante cantante) {
        if (numCantantes < listaCantantes.length) {
            listaCantantes[numCantantes++] = cantante;
        } else {
            System.out.println("No se pueden agregar más cantantes. El escenario está completo.");
        }
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Cantante[] getListaCantantes() {
        return listaCantantes;
    }

    public int getNumCantantes() {
        return numCantantes;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setListaCantantes(Cantante[] listaCantantes) {
        this.listaCantantes = listaCantantes;
    }

    public void setNumCantantes(int numCantantes) {
        this.numCantantes = numCantantes;
    }



    public void mostrarDetalles() {
        System.out.println(" ");
        System.out.println(" Detalles del Escenario ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Cantantes en el Escenario:");

        for (int i = 0; i < numCantantes; i++) {
            System.out.println(listaCantantes[i].mostrarInformacion());

        }


    }
}



