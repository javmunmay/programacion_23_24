package U5.Entregable2324;

import java.util.ArrayList;
import java.util.List;

public class Juegos {
    private int ayoCelebracion;
    private String sede;
    private List<Pais> paisesParticipantes;
    private List<Deporte> deportes;

    public Juegos(int ayoCelebracion, String sede) {
        if (ayoCelebracion % 4 != 0) {
            System.out.println("No es un año múltiplo de 4, no se puede celebrar.");
        }
        this.ayoCelebracion = ayoCelebracion;
        this.sede = sede;
        this.paisesParticipantes = new ArrayList<>();
        this.deportes = new ArrayList<>();
    }

    public void ayadirPais(Pais pais) {
        this.paisesParticipantes.add(pais);
    }

    public void quitarPais(Pais pais) {
        this.paisesParticipantes.remove(pais);
    }

    public void ayadirDeporte(Deporte deporte) {
        this.deportes.add(deporte);
    }

    public void quitarDeporte(Deporte deporte) {
        this.deportes.remove(deporte);
    }

    public int getAyoCelebracion() {
        return ayoCelebracion;
    }

    public String getSede() {
        return sede;
    }

    public List<Pais> getPaisesParticipantes() {
        return paisesParticipantes;
    }

    public List<Deporte> getDeportes() {
        return deportes;
    }

    public void setAyoCelebracion(int ayoCelebracion) {
        this.ayoCelebracion = ayoCelebracion;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setPaisesParticipantes(List<Pais> paisesParticipantes) {
        this.paisesParticipantes = paisesParticipantes;
    }

    public void setDeportes(List<Deporte> deportes) {
        this.deportes = deportes;
    }
}