package U5.Examen2324U5Javier_MunozMayorga;

public class Libro extends  Multimedia{


    private String Autor;
    private String Editorial;
    private String IdentificadorISBN;
    private int NumPaginas;


    public Libro(int ID, Boolean finalizado, int anoEstreno, String titulo, String autor, String editorial, String identificadorISBN, int numPaginas) {
        super(ID, finalizado, anoEstreno, titulo);
        Autor = autor;
        Editorial = editorial;
        IdentificadorISBN = identificadorISBN;
        NumPaginas = numPaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }


    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public String getIdentificadorISBN() {
        return IdentificadorISBN;
    }

    public void setIdentificadorISBN(String identificadorISBN) {
        IdentificadorISBN = identificadorISBN;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }

    @Override
    public void dar_por_finalizado() {
        System.out.println("El libro: "+Titulo+" ha finalizado");
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Autor='" + Autor + '\'' +
                ", Editorial='" + Editorial + '\'' +
                ", IdentificadorISBN='" + IdentificadorISBN + '\'' +
                ", NumPaginas=" + NumPaginas +
                '}';
    }
}
