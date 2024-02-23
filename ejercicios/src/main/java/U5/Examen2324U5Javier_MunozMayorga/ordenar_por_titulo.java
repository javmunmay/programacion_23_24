package U5.Examen2324U5Javier_MunozMayorga;

import java.util.Comparator;

public class ordenar_por_titulo implements Comparator<Multimedia> {

    @Override
    public int compare(Multimedia o1, Multimedia o2) {
        return o1.Titulo.compareTo(o2.Titulo);
    }
}
