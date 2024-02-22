package U5.Exam21_22_Tarde;

public class Cuarteto extends AgrupacionOficial implements Callejera {


    protected int NumeroDeMiembros;


    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetras, String tipoDisfraz, Double puntosObtenidos, Integrante[] integrantes, int indice_integrantes, int numeroDeMiembros) {
        super(nombre, autor, autorMusica, autorLetras, tipoDisfraz, puntosObtenidos, integrantes, indice_integrantes);
        NumeroDeMiembros = numeroDeMiembros;
    }

    public int getNumeroDeMiembros() {
        return NumeroDeMiembros;
    }

    public void setNumeroDeMiembros(int numeroDeMiembros) {
        NumeroDeMiembros = numeroDeMiembros;
    }


    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Cuarteto con nombre " + super.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Cuarteto " + super.nombre + " con el tipo de disfraz: " + super.tipoDisfraz);
    }

    @Override
    public void caminitoDelFalla() {
        System.out.println("El Cuarteto " + super.nombre + " va caminito al falla");
    }


    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Cuarteto " + super.nombre);
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                "NumeroDeMiembros=" + NumeroDeMiembros +
                '}';
    }
}
