package U5.Exam21_22_Tarde;

import java.util.Arrays;

public class COAC {

    private AgrupacionOficial[] agrupaciones;

    private int indice_agrupaciones;

    public COAC() {
        this.agrupaciones = new AgrupacionOficial[10]; // Inicializando el arreglo con un tamaño inicial de 10
        this.indice_agrupaciones = 0;
    }

    public COAC(AgrupacionOficial[] agrupaciones, int indice_agrupaciones) {
        this.agrupaciones = agrupaciones;
        this.indice_agrupaciones = indice_agrupaciones;
    }

    public void inscribir_agrupacion(AgrupacionOficial agrupacion) {
        if (indice_agrupaciones == agrupaciones.length) {
            agrupaciones = Arrays.copyOf(agrupaciones, agrupaciones.length + 1);
        }
        agrupaciones[indice_agrupaciones] = agrupacion;
        indice_agrupaciones++;

    }

    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
        AgrupacionOficial[] copia = new AgrupacionOficial[agrupaciones.length - 1];
        int contador_copia = 0;
        for (int i = 0; i < agrupaciones.length; i++) {
            if (!agrupaciones[i].equals(agrupacion)) {
                copia[contador_copia] = agrupaciones[i];
                contador_copia++;
                //return true;
            }
        }
        agrupaciones = copia;
        return true; //antes era false

    }

    public void ordenar_por_puntos() {
        Arrays.sort(agrupaciones, new Ordenar_Puntos());
    }

    public void ordenar_por_nombre() {
        Arrays.sort(agrupaciones, new Ordenar_por_nombre());
    }

    public void ordenar_por_autor() {
        Arrays.sort(agrupaciones, new Ordenar_autor());

    }

    @Override
    public String toString() {
        return "COAC{" +
                "agrupaciones=" + Arrays.toString(agrupaciones) +
                ", indice_agrupaciones=" + indice_agrupaciones +
                '}';
    }
}
