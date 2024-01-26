package U4.Entregable23_24;

public class Cancion {

    private String titulo;
    private int duracion;
    private String genero;
    private Cantante autor;

    public Cancion(String titulo, int duracion, String genero, Cantante autor) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.autor = autor;
    }

    //Getter
    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public Cantante getAutor() {
        return autor;
    }

    //Setter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAutor(Cantante autor) {
        this.autor = autor;
    }

    public void mostrarDetalles() {
        System.out.println(" ");
        System.out.println(" Detalles de la Canción ");
        System.out.println(" ");
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracion + " segundos");
        System.out.println("Género: " + genero);
        System.out.println("Autor: " + autor);
        System.out.println("------------------------------------");
    }
}







