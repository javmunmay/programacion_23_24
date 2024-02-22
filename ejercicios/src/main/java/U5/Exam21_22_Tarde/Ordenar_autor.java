package U5.Exam21_22_Tarde;

import java.util.Comparator;

public class Ordenar_autor implements Comparator<AgrupacionOficial> {


    @Override
    public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
        return o1.autor.compareTo(o2.autor);
    }
}
