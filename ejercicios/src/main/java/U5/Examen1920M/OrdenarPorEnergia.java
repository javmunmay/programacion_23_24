package U5.Examen1920M;

import java.util.Comparator;

public class OrdenarPorEnergia implements Comparator <Personaje> {
    @Override
    public int compare(Personaje o1, Personaje o2) {
        if (o1.getEnergy()>o2.getEnergy()){
            return 1;
        } else if (o1.getEnergy()<o2.getEnergy()) {
            return -1;
        }
        return 0;
    }
}
