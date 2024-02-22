package U5.Examen_2021_Turno_Manana;

import java.util.Comparator;

public class CamionCajas extends Vehiculo {

    protected Caja[] cajas;
    protected int numCajas;
    protected String id;


    public CamionCajas(String matricula, int cargaMAx, Conductor[] conductor, Caja[] cajas, int numCajas, String id) {
        super(matricula, cargaMAx, conductor);
        this.cajas = cajas;
        this.numCajas = numCajas;
        this.id = id;
        this.cajas = new Caja[numCajas];
    }

    public void addCaja(Caja caja) {
        if (numCajas < cajas.length) {
            cajas[numCajas++] = caja;
        } else {
            System.out.println("No se puede añadir más cajas, capacidad máxima alcanzada.");
        }
    }

    public void removeCaja(Caja caja) {
        for (int i = 0; i < numCajas; i++) {
            if (cajas[i] == caja) {
                for (int j = i; j < numCajas - 1; j++) {
                    cajas[j] = cajas[j + 1];
                }
                cajas[numCajas - 1] = null;
                numCajas--;
                return;
            }
        }
        System.out.println("La caja especificada no está en el camión.");
    }

    @Override
    public void descargar() {
        int totalPrendas = 0;
        for (Caja caja : cajas) {
            if (caja != null) {
                totalPrendas += caja.numPrendas;
            }
        }
        System.out.println("Descargando " + numCajas + "cajas y" + totalPrendas + "prendas");
    }

    //Todas las cajas transportadas por los CamionCajas tienen una capacidad máxima de 5 prendas de ropa y será identificado por un id.


    //Añadir y borrar una caja a un CamiónCajas

}
