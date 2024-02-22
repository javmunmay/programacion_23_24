package U5.Examen_2021_Turno_Manana;

import java.util.Comparator;

public class Ordenar_CamionPerchasNumeroPrendas implements Comparator<CamionPerchas> {
    @Override
    public int compare(CamionPerchas o1, CamionPerchas o2) {
        return Double.compare(o1.numPrendasColgadas, o2.numPrendasColgadas);
    }
}
