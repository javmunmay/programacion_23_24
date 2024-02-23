package U5.Examen_2021_Turno_Manana;

public class Caja {

    protected int id;
    protected int numPrendas;
    private Prendas[] prendas;
    private int CapacidadMaxima = 5;

    public Caja(int id, int numPrendas, Prendas[] prendas) {
        this.id = id;
        this.numPrendas = numPrendas;
        this.prendas = new Prendas[CapacidadMaxima];
    }

    //Añádir y borrar prendas a una caja.

    public void addPrenda(Prendas prenda) {
        if (numPrendas < CapacidadMaxima) {
            prendas[numPrendas++] = prenda;
        } else {
            System.out.println("La caja está llena, no se puede añadir más prendas.");
        }
    }

    public void removePrenda(int index) {
        if (index >= 0 && index < numPrendas) {
            for (int i = index; i < numPrendas - 1; i++) {
                prendas[i] = prendas[i + 1];
            }
            prendas[numPrendas - 1] = null;
            numPrendas--;
        } else {
            System.out.println("Indice invalido para eliminar la prenda de la caja.");
        }
    }
}
