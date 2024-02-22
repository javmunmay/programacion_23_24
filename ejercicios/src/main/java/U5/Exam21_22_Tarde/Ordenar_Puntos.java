package U5.Exam21_22_Tarde;

import java.util.Comparator;

public class Ordenar_Puntos implements Comparator<AgrupacionOficial> {

    @Override
    public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
        if (o1.PuntosObtenidos > o2.PuntosObtenidos) {
            return 1;
        } else if (o1.PuntosObtenidos < o2.PuntosObtenidos) {
            return -1;
        } else {
            return 0;
        }
    }

}

