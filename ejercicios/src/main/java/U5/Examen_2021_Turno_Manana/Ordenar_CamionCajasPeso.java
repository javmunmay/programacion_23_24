package U5.Examen_2021_Turno_Manana;

import java.util.Comparator;

public class Ordenar_CamionCajasPeso implements Comparator<CamionCajas> {

    //Compara el peso
    @Override
    public int compare(CamionCajas o1, CamionCajas o2) {
        return Double.compare(o1.CargaMAx, o2.CargaMAx);
    }


}
