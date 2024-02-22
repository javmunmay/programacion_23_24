package U5.EntregablePrueba21_22Manana;


import java.util.Comparator;

public class informeSuperficie implements Comparator<Propiedad> {
    @Override
    public int compare(Propiedad o1, Propiedad o2) {
        if (o1.MetrosCuadrados > o2.MetrosCuadrados) {
            return 1;
        } else if (o1.MetrosCuadrados < o2.MetrosCuadrados) {
            return -1;
        } else {
            return 0;
        }
    }
}
