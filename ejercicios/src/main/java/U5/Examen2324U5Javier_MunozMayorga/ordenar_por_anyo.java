package U5.Examen2324U5Javier_MunozMayorga;

import java.util.Comparator;

public class ordenar_por_anyo  implements Comparator<Multimedia> {
    @Override
    public int compare(Multimedia o1, Multimedia o2) {
        if (o1.AnoEstreno > o2.AnoEstreno) {
            return 1;
        } else if (o1.AnoEstreno < o2.AnoEstreno) {
            return -1;
        } else {
            return 0;
        }
    }
}
