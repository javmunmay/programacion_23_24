package U5.Examen2324U5Javier_MunozMayorga;

import java.util.Comparator;

public class ordenar_por_id implements Comparator<Multimedia> {
    @Override
    public int compare(Multimedia o1, Multimedia o2) {
        if (o1.ID > o2.ID) {
            return 1;
        } else if (o1.ID < o2.ID) {
            return -1;
        } else {
            return 0;
        }
    }
}
