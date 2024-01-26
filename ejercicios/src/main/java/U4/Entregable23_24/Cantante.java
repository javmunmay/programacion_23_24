package U4.Entregable23_24;

import java.util.Arrays;

public class Cantante {
    private String nombreReal;
    private String nombreArtistico;
    private int edad;
    private String ciudadOrigen;
    private Cancion[] listaCanciones;
    private int numCanciones;

    public Cantante(String nombreReal, String nombreArtistico, int edad, String ciudadOrigen, int maxCanciones) {
        this.nombreReal = nombreReal;
        this.nombreArtistico = nombreArtistico;
        this.edad = edad;
        this.ciudadOrigen = ciudadOrigen;
        this.listaCanciones = new Cancion[maxCanciones];
        this.numCanciones = 0; //contador
    }

    //Getter
    public String getNombreReal() {
        return nombreReal;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public Cancion[] getListaCanciones() {
        return listaCanciones;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    //Setter
    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public void setListaCanciones(Cancion[] listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }



    public void agregarCancion(Cancion cancion) {
        if (numCanciones < listaCanciones.length) {
            listaCanciones[numCanciones++] = cancion;
        } else {
            System.out.println("No se pueden agregar más canciones. La lista de canciones está llena.");
        }
    }


    public String mostrarInformacion() {
        return "Cantante{" +
                "nombreReal='" + nombreReal + '\'' +
                ", nombreArtistico='" + nombreArtistico + '\'' +
                ", edad=" + edad +
                ", ciudadOrigen='" + ciudadOrigen + '\'' +
                ", listaCanciones=" + Arrays.toString(listaCanciones) +
                ", numCanciones=" + numCanciones +
                '}';
    }
}




