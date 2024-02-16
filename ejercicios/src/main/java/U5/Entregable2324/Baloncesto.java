package U5.Entregable2324;

public class Baloncesto extends Deporte {

    private int numeroEquipos;
    public Baloncesto(String nombreDeporte, String nombrePabellon, TipoParticipante tipoParticipantes) {
        super(nombreDeporte, nombrePabellon, tipoParticipantes);
        this.numeroEquipos = numeroEquipos;
    }

    public int getNumeroEquipos() {
        return numeroEquipos;
    }

    public void setNumeroEquipos(int numeroEquipos) {
        this.numeroEquipos = numeroEquipos;
    }
}
