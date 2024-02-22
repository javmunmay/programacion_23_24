package U5.Examen_2021_Turno_Manana;

public class CamionPerchas extends Vehiculo {

    protected PrendaColgada[] prendasColgadas;
    protected int numPrendasColgadas;


    public CamionPerchas(String matricula, int cargaMAx, Conductor[] conductor, PrendaColgada[] prendasColgadas, int numPrendasColgadas) {
        super(matricula, cargaMAx, conductor);
        this.prendasColgadas = prendasColgadas;
        this.numPrendasColgadas = numPrendasColgadas;
    }

    public void addPrendaColgada(PrendaColgada prendaColgada) {
        if (numPrendasColgadas < prendasColgadas.length) {
            prendasColgadas[numPrendasColgadas++] = prendaColgada;
        } else {
            System.out.println("No se puede añadir más prendas colgadas, capacidad máxima alcanzada.");
        }
    }

    public void removePrendaColgada(PrendaColgada prendaColgada) {
        for (int i = 0; i < numPrendasColgadas; i++) {
            if (prendasColgadas[i] == prendaColgada) {
                for (int j = i; j < numPrendasColgadas - 1; j++) {
                    prendasColgadas[j] = prendasColgadas[j + 1];
                }
                prendasColgadas[numPrendasColgadas - 1] = null;
                numPrendasColgadas--;
                return;
            }
        }
        System.out.println("La prenda colgada especificada no está en el camión.");
    }

    @Override
    public void descargar() {
        System.out.println("Descargando " + prendasColgadas.length + " Prendas");
    }


    //Añadir y borrar prendas Colgadas a un CamiónPerchas.

}
