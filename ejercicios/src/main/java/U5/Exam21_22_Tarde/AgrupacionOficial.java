package U5.Exam21_22_Tarde;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion {

    protected Integrante[] integrantes;
    protected int indice_integrantes; //Llevar el numero actual de integrantes en las agrupaciones


    public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String tipoDisfraz, Double puntosObtenidos, Integrante[] integrantes, int indice_integrantes) {
        super(nombre, autor, autorMusica, autorLetras, tipoDisfraz, puntosObtenidos);
        this.integrantes = integrantes;
        this.indice_integrantes = indice_integrantes;
    }

    @Override
    public void cantar_la_presentacion() {

    }

    @Override
    public void hacer_tipo() {

    }

    public void insertar_integrante(Integrante i) {
        if (indice_integrantes == integrantes.length) {
            integrantes = Arrays.copyOf(integrantes, integrantes.length + 1);
        }
        integrantes[indice_integrantes] = i;
        indice_integrantes++;

    }

    public boolean eliminar_integrante(Integrante i) {

        Integrante[] copia = new Integrante[integrantes.length - 1];
        int contador_copia = 0;
        for (int j = 0; j < integrantes.length; j++) {
            if (!integrantes[j].equals(i)) {
                copia[contador_copia] = integrantes[j];
                contador_copia++;
                return true;
            }
        }
        integrantes = copia;
        return false;

    }

    public abstract void caminitoDelFalla();


    @Override
    public String toString() {
        return "AgrupacionOficial{" +
                "integrantes=" + Arrays.toString(integrantes) +
                ", indice_integrantes=" + indice_integrantes +
                '}';
    }
}
