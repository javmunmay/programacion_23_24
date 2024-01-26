package U4.Entregable23_24;

public class Festival {

    private Concierto[] listaConciertos;
    private String organizador;
    private int numConciertos;

    public Festival(String organizador, int maxConciertos) {
        this.organizador = organizador;
        this.listaConciertos = new Concierto[maxConciertos];
        this.numConciertos = 0;
    }

    //Getter
    public Concierto[] getListaConciertos() {
        return listaConciertos;
    }

    public String getOrganizador() {
        return organizador;
    }

    public int getNumConciertos() {
        return numConciertos;
    }

    //Setter
    public void setListaConciertos(Concierto[] listaConciertos) {
        this.listaConciertos = listaConciertos;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public void setNumConciertos(int numConciertos) {
        this.numConciertos = numConciertos;
    }

    public void agregarConcierto(Concierto concierto) {
        if (numConciertos < listaConciertos.length) {
            listaConciertos[numConciertos++] = concierto;
        } else {
            System.out.println("No se pueden agregar más conciertos. El festival está completo.");
        }
    }

    public void mostrarInformacion() {
        System.out.println(" ");
        System.out.println(" Información del Festival ");
        System.out.println("Organizador: " + organizador);
        for (int i = 0; i < numConciertos; i++) {
            listaConciertos[i].mostrarInformacion();
            System.out.println(" ");
        }
    }

}
