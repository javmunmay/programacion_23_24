package U5.Examen1920M;

import java.util.Comparator;

public class OrdenarPorDefensa implements Comparator<Personaje> {
    @Override
    public int compare(Personaje o1, Personaje o2) {
        if (o1.getDefense() > o2.getDefense()) {
            return 1;
        } else if (o1.getDefense() < o2.getDefense()) {
            return -1;
        } else {
            return 0;
        }
    }
}
