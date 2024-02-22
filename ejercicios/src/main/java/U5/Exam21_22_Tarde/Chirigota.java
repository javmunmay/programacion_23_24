package U5.Exam21_22_Tarde;

public class Chirigota extends AgrupacionOficial implements Callejera {

    protected int NumeroDeCuples;


    public Chirigota(String nombre, String autor, String autorMusica, String autorLetras, String tipoDisfraz, Double puntosObtenidos, Integrante[] integrantes, int indice_integrantes, int numeroDeCuples) {
        super(nombre, autor, autorMusica, autorLetras, tipoDisfraz, puntosObtenidos, integrantes, indice_integrantes);
        NumeroDeCuples = numeroDeCuples;
    }

    public int getNumeroDeCuples() {
        return NumeroDeCuples;
    }

    public void setNumeroDeCuples(int numeroDeCuples) {
        NumeroDeCuples = numeroDeCuples;
    }


    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre " + super.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Chirigota " + super.nombre + " con el tipo de disfraz: " + super.tipoDisfraz);
    }

    @Override
    public void caminitoDelFalla() {
        System.out.println("La Chirigota " + super.nombre + " va caminito al falla");
    }


    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota " + super.nombre);
    }

    @Override
    public String toString() {
        return "Chirigota{" +
                "NumeroDeCuples=" + NumeroDeCuples +
                '}';
    }
}
