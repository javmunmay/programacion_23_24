package U5.Exam21_22_Tarde;

import java.util.Arrays;

abstract class Agrupacion {

    protected String nombre;
    protected String autor;
    protected String autorMusica;
    protected String autorLetras;
    protected String tipoDisfraz;
    protected Double PuntosObtenidos;

    public Agrupacion(String nombre, String autor, String autorMusica, String autorLetras, String tipoDisfraz, Double puntosObtenidos) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipoDisfraz = tipoDisfraz;
        PuntosObtenidos = puntosObtenidos;
    }

    public abstract void cantar_la_presentacion();

    public abstract void hacer_tipo();

    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                ", PuntosObtenidos=" + PuntosObtenidos +
                '}';
    }
}
