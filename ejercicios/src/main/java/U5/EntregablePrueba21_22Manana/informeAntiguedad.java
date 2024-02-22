package U5.EntregablePrueba21_22Manana;

import java.util.Comparator;

public class informeAntiguedad implements Comparator<Propiedad> {
    @Override
    public int compare(Propiedad o1, Propiedad o2) {
        if (o1.AnoDeConstruccion > o2.AnoDeConstruccion) {
            return 1;
        } else if (o1.AnoDeConstruccion < o2.AnoDeConstruccion) {
            return -1;
        } else {
            return 0;
        }
    }
}

