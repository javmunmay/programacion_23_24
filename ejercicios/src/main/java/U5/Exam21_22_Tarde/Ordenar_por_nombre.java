package U5.Exam21_22_Tarde;

import java.util.Comparator;

public class Ordenar_por_nombre implements Comparator<AgrupacionOficial> {
    @Override
    public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
        return o1.nombre.compareTo(o2.nombre);
    }


}
