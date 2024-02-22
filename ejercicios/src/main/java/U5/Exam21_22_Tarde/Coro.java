package U5.Exam21_22_Tarde;

public class Coro extends AgrupacionOficial {

    protected int NumeroDeBandurrias;
    protected int NumerodeGuitarras;


    public Coro(String nombre, String autor, String autorMusica, String autorLetras, String tipoDisfraz, Double puntosObtenidos, Integrante[] integrantes, int indice_integrantes, int numeroDeBandurrias, int numerodeGuitarras) {
        super(nombre, autor, autorMusica, autorLetras, tipoDisfraz, puntosObtenidos, integrantes, indice_integrantes);
        NumeroDeBandurrias = numeroDeBandurrias;
        NumerodeGuitarras = numerodeGuitarras;
    }

    public int getNumeroDeBandurrias() {
        return NumeroDeBandurrias;
    }

    public void setNumeroDeBandurrias(int numeroDeBandurrias) {
        NumeroDeBandurrias = numeroDeBandurrias;
    }

    public int getNumerodeGuitarras() {
        return NumerodeGuitarras;
    }

    public void setNumerodeGuitarras(int numerodeGuitarras) {
        NumerodeGuitarras = numerodeGuitarras;
    }


    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Coro con nombre " + super.nombre);
    }

    //La Chirigota/Coro/....XXXXX va de YYYYY"), siendo XXXXX
    // el nombre de la agrupación e YYYYY el tipo (disfraz)
    @Override
    public void hacer_tipo() {
        System.out.println("El Coro " + super.nombre + " con el tipo de disfraz: " + super.tipoDisfraz);
    }

    @Override
    public void caminitoDelFalla() {
        System.out.println("El Coro " + super.nombre + " va caminito al falla");
    }


    @Override
    public String toString() {
        return "Coro{" +
                "NumeroDeBandurrias=" + NumeroDeBandurrias +
                ", NumerodeGuitarras=" + NumerodeGuitarras +
                '}';
    }
}
