package U4.Entregable23_24;

public class Concierto {
    private String nombre;
    private String fecha;
    private Escenario[] listaEscenarios;
    private int numEscenarios;

    public Concierto(String nombre, String fecha, int maxEscenarios) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.listaEscenarios = new Escenario[maxEscenarios];
        this.numEscenarios = 0;
    }


    //Getter
    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public Escenario[] getListaEscenarios() {
        return listaEscenarios;
    }

    public int getNumEscenarios() {
        return numEscenarios;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setListaEscenarios(Escenario[] listaEscenarios) {
        this.listaEscenarios = listaEscenarios;
    }

    public void setNumEscenarios(int numEscenarios) {
        this.numEscenarios = numEscenarios;
    }

    public void agregarEscenario(Escenario escenario) {
        if (numEscenarios < listaEscenarios.length) {
            listaEscenarios[numEscenarios++] = escenario;
        } else {
            System.out.println("No se pueden agregar más escenarios. El concierto está completo.");
        }
    }

    public void programarConcierto(String fecha) {
        this.fecha = fecha;
        System.out.println("Concierto " + nombre + " programado para el " + fecha + ".");
    }

    public void mostrarCartelera() {
        System.out.println(" Cartelera del Concierto ");
        System.out.println("Nombre del Concierto: " + nombre);
        System.out.println("Fecha: " + fecha);
        for (int i = 0; i < numEscenarios; i++) {
            listaEscenarios[i].mostrarDetalles();
        }
    }

    public void mostrarInformacion() {
        System.out.println(" ");
        System.out.println("Concierto: " + nombre);
        System.out.println("Fecha: " + fecha);
    }
}