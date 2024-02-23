package U5.Examen2324U5Javier_MunozMayorga;

public class Pelicula extends  Multimedia implements Reproducible {


    private String Director;
    private int Duracion;
    private String Productora;
    private String Pais;


    public Pelicula(int ID, Boolean finalizado, int anoEstreno, String titulo, String director, int duracion, String productora, String pais) {
        super(ID, finalizado, anoEstreno, titulo);
        Director = director;
        Duracion = duracion;
        Productora = productora;
        Pais = pais;
    }

    @Override
    public String getTitulo() {
        return Titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    public String getProductora() {
        return Productora;
    }

    public void setProductora(String productora) {
        Productora = productora;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }


    @Override
    public void dar_por_finalizado() {
        System.out.println("La Pelicula "+Titulo+" ha finalizado");
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo película "+ Titulo);
    }

    @Override
    public void pause() {
        System.out.println("Pausando película "+ Titulo);
    }

    @Override
    public void stop() {
        System.out.println("Parando película "+ Titulo);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "Director='" + Director + '\'' +
                ", Duracion=" + Duracion +
                ", Productora='" + Productora + '\'' +
                ", Pais='" + Pais + '\'' +
                '}';
    }
}
