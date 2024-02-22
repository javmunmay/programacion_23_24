package U5.Examen1920M;

import java.util.Comparator;

public class OrdenarPorAtaque implements Comparator<Personaje> {
    @Override
    public int compare(Personaje o1, Personaje o2) {
        if (o1.getAttack() > o2.getAttack()) {
            return 1;
        } else if (o1.getAttack() < o2.getAttack()) {
            return -1;
        } else {
            return 0;
        }
    }
}
