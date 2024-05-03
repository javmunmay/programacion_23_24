package U7.ExamenU6U7_2324;

import java.io.Serializable;

public class Artista implements Serializable {
    private String nombreArtistico;
    private String generoMusicalPrincipal;
    private String nacionalidad;
    private int idArtista;
    private static int contadorId = 1; // Contador estático


    public Artista(String nombreArtistico, String generoMusicalPrincipal, String nacionalidad) {
        this.nombreArtistico = nombreArtistico;
        this.generoMusicalPrincipal = generoMusicalPrincipal;
        this.nacionalidad = nacionalidad;
        this.idArtista = contadorId++;
    }


    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getGeneroMusicalPrincipal() {
        return generoMusicalPrincipal;
    }

    public void setGeneroMusicalPrincipal(String generoMusicalPrincipal) {
        this.generoMusicalPrincipal = generoMusicalPrincipal;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Artista.contadorId = contadorId;
    }

    //public void setMedicoTratante(Medico medicoTratante) {
    //        this.medicoTratante = medicoTratante;
    //    }
    //public void addActuacion(Caseta caseta){this.caseta = caseta;}

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtistico='" + nombreArtistico + '\'' +
                ", generoMusicalPrincipal='" + generoMusicalPrincipal + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", idArtista=" + idArtista +
                '}';
    }
}
