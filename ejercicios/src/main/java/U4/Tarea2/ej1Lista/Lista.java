package U4.Tarea2.ej1Lista;

import java.util.Arrays;

public class Lista {

    private Integer[] tabla;
    private Integer indice = 0; //indice es como un contador

    //Constructores
    public Lista() {
        this.tabla = new Integer[10];
    }

    public Lista(Integer capacidad) {
        this.tabla = new Integer[capacidad];
    }


    //Obtener el número de elementos insertados en la lista.

    public int numerosInsertados() {
        return indice;
    }


    //Insertar un número al final de la lista.
    public void insertarNumeroFinal(Integer numero) {
        if (indice >= tabla.length) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
        }

        tabla[indice] = numero;
        indice++;

    }


    //Insertar un número al principio de la lista.
    public void insertarNumeroInicial(Integer numero) {
        Integer[] copia = Arrays.copyOf(tabla, indice);
        System.out.println(Arrays.toString(copia));
        tabla[0] = numero;
        for (int i = 0; i < copia.length; i++) {
            tabla[i + 1] = copia[i];
        }
        indice++;
    }

    //Insertar un número en un lugar de la lista cuyo índice se pasa como parámetro.
    public void insertarNumeroPosicion(int posicion, Integer numero) {
        Integer[] copia = Arrays.copyOf(tabla, indice);
        System.out.println(Arrays.toString(copia));
        tabla[posicion] = numero;

        for (int i = posicion; i < copia.length; i++) {
            tabla[i + 1] = copia[i];
        }
        indice++;
    }

    //Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
    public void insertarListaFinal(Integer[] Lista) {

        for (int i = 0; i < Lista.length; i++) {
            insertarNumeroFinal(Lista[i]);
        }
    }

    //Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
    public void eliminarNumero(int posicion) {
        if (posicion >= 0 && posicion < indice) {
            Integer[] copia = Arrays.copyOf(tabla, indice);
            System.out.println(Arrays.toString(copia));

            for (int i = posicion + 1; i < copia.length; i++) {
                tabla[i - 1] = copia[i];
            }
            indice--;
        }
    }


    //Obtener el elemento cuyo índice se pasa como parámetro.

    public Integer obtenerNumero(int posicion) {
        if (posicion >= 0 && posicion < indice) {
            return tabla[posicion];
        } else {
            return null;
        }

    }

    //Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no está, devolver -1.

    public int buscarNumero(Integer numero) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i].equals(numero)) {
                return i;
            }
        }
        return -1;
    }

    //Representar la lista con una cadena de caracteres.
    public void mostrarLista() {
        for (int i = 0; i < indice; i++) {
            System.out.print(" " + tabla[i]);
        }
    }

}
