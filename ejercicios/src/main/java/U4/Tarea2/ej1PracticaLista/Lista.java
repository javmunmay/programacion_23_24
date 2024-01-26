package U4.Tarea2.ej1PracticaLista;

import java.util.Arrays;

public class Lista {
    private Integer[] tabla;
    private Integer indice = 0;

    //Constructores

    public Lista() {
        this.tabla = new Integer[10];
    }

    public Lista(Integer capacidad) {
        this.tabla = new Integer[capacidad];
    }

    //Obtener el numero de elementos insertados en la lista

    public int numerosInsertados() {
        return indice;
    }

    //insertar un numero al final de la lista
    public void numeroFinalLista(Integer numero) {
        if (indice >= tabla.length) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
        }

        tabla[indice] = numero;
        indice++;

    }

    //Insertar un numero al principio de la lista
    public void numeroAlPrincipio(Integer numero) {
        if (indice <= tabla.length) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
        }

        tabla[indice] = numero;
        indice++;
    }


    //Insertar un numero en un lugar de la lista cuyo indice se pasa
    //como parámetro

    public void numeroPorParametro(Integer posicion, Integer numero) {
        tabla[posicion] = numero;

    }
}
