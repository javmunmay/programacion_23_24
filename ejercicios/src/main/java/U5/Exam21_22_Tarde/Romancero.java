package U5.Exam21_22_Tarde;

public class Romancero extends Agrupacion implements Callejera {

    protected String TematicaDelCartelon;


    public Romancero(String nombre, String autor, String autorMusica, String autorLetras, String tipoDisfraz, Double puntosObtenidos, String tematicaDelCartelon) {
        super(nombre, autor, autorMusica, autorLetras, tipoDisfraz, puntosObtenidos);
        TematicaDelCartelon = tematicaDelCartelon;
    }

    public String getTematicaDelCartelon() {
        return TematicaDelCartelon;
    }

    public void setTematicaDelCartelon(String tematicaDelCartelon) {
        TematicaDelCartelon = tematicaDelCartelon;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Romancero con nombre " + super.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Romancero " + super.nombre + " con el tipo de disfraz: " + super.tipoDisfraz);
    }

    public void caminito_del_falla() {
        System.out.println("El Romancero " + super.nombre + " va caminito al falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha El Romancero " + super.nombre);
    }

    @Override
    public String toString() {
        return "Romancero{" +
                "TematicaDelCartelon='" + TematicaDelCartelon + '\'' +
                '}';
    }
}
