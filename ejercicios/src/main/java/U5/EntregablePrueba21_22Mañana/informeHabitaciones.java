package U5.EntregablePrueba21_22Mañana;

import java.util.Comparator;

public class informeHabitaciones implements Comparator<Vivienda> {

    //Ordenar por Habitaciones
    @Override
    public int compare(Vivienda o1, Vivienda o2) {
        if (o1.numeroHabitaciones > o2.numeroHabitaciones) {
            return 1;
        } else if (o1.numeroHabitaciones < o2.numeroHabitaciones) {
            return -1;
        } else {
            return 0;
        }
    }
}
