package U5.Examen2324U5Javier_MunozMayorga;

import java.util.Arrays;

public class Catalogo {

    private static final int TAMANIO_MAXIMO = 100;
    private int indice_multimedia;
    private Multimedia[] multimedia = new Multimedia[TAMANIO_MAXIMO];

    public Catalogo(int indice_multimedia, Multimedia[] multimedia) {
        this.indice_multimedia = indice_multimedia;
        this.multimedia = multimedia;
    }



    public int getIndice_multimedia() {
        return indice_multimedia;
    }

    public void setIndice_multimedia(int indice_multimedia) {
        this.indice_multimedia = indice_multimedia;
    }

    public Multimedia[] getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia[] multimedia) {
        this.multimedia = multimedia;
    }

    //numero_de_elementos()
    public void numero_de_elementos(){
        System.out.println("Numeros de elementos Multimedia creados: "+multimedia.length);
    }


    //add_multimedia(Multimedia elemento)
    public void add_multimedia(Multimedia elemento) {
        if (indice_multimedia == multimedia.length) {
            multimedia = Arrays.copyOf(multimedia, multimedia.length + 1);
        }
        multimedia[indice_multimedia] = elemento;
        indice_multimedia++;

    }


    //eliminar_multimedia(Multimedia elemento)

    public boolean eliminar_multimedia(Multimedia elemento) {
        Multimedia[] copia = new Multimedia[multimedia.length - 1];
        int contador_copia = 0;
        for (int i = 0; i < multimedia.length; i++) {
            if (!multimedia[i].equals(elemento)) {
                copia[contador_copia] = multimedia[i];
                contador_copia++;
                return true;
            }
        }
        multimedia = copia;
        return false;

    }


    @Override
    public String toString() {
        return "Catalogo{" +
                "indice_multimedia=" + indice_multimedia +
                ", multimedia=" + Arrays.toString(multimedia) +
                '}';
    }
}
