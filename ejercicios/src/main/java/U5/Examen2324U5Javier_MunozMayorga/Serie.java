package U5.Examen2324U5Javier_MunozMayorga;

import java.util.Arrays;

public class Serie extends  Multimedia implements Reproducible{


    private String Creador;
    private int numTemporadas;

    protected enum S01E01 {
        CAPITULO1,
        CAPITULO2
    }
    private int CapacidadMaxima = 30;
    private Capitulos[] capituloss;



    public Serie(int ID, Boolean finalizado, int anoEstreno, String titulo, String creador, int numTemporadas, Capitulos[] capituloss) {
        super(ID, finalizado, anoEstreno, titulo);
        Creador = creador;
        this.numTemporadas = numTemporadas;
        this.capituloss = capituloss;

    }



    @Override
    public String getTitulo() {
        return Titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getCreador() {
        return Creador;
    }

    public void setCreador(String creador) {
        Creador = creador;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public Capitulos[] getCapituloss() {
        return capituloss;
    }

    public void setCapituloss(Capitulos[] capituloss) {
        this.capituloss = capituloss;
    }

    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        CapacidadMaxima = capacidadMaxima;
    }

    @Override
    public void dar_por_finalizado() {
        System.out.println("La Serie "+Titulo+" ha finalizado");
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo Serie "+ Titulo+","+ S01E01.CAPITULO1);
    }

    @Override
    public void pause() {
        System.out.println("Pausando Serie "+ Titulo+","+ S01E01.CAPITULO1);
    }

    @Override
    public void stop() {
        System.out.println("Parando Serie "+ Titulo+","+ S01E01.CAPITULO1);
    }


    //add_capitulo(String capitulo)

    public void add_capitulo(Capitulos capitulos) {
        int numCont;
        if (capituloss.length < CapacidadMaxima) {
            numCont = capituloss.length;
            capituloss[numCont++] = capitulos;

        } else {
            System.out.println("Ha llegado al maximos de capitulos disponible , no se puede añadir más.");
        }
    }



    //eliminar_capitulo(String capitulo)
    //Devuelve true si lo ha eliminado, false si no lo ha eliminado

    public boolean eliminar_capitulo(Capitulos i) {

        Capitulos[] copia = new Capitulos[capituloss.length - 1];
        int contador_copia = 0;
        for (int j = 0; j < capituloss.length; j++) {
            if (!capituloss[j].equals(i)) {
                copia[contador_copia] = capituloss[j];
                contador_copia++;
                return true;
            }
        }
        capituloss = copia;
        return false;

    }


    @Override
    public String toString() {
        return "Serie{" +
                "Creador='" + Creador + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", CapacidadMaxima=" + CapacidadMaxima +
                ", capituloss=" + Arrays.toString(capituloss) +
                '}';
    }
}
