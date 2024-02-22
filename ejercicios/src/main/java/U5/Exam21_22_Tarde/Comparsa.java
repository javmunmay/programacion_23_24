package U5.Exam21_22_Tarde;

public class Comparsa extends AgrupacionOficial {

    protected String EmpresaDeAtrezo;


    public Comparsa(String nombre, String autor, String autorMusica, String autorLetras, String tipoDisfraz, Double puntosObtenidos, Integrante[] integrantes, int indice_integrantes, String empresaDeAtrezo) {
        super(nombre, autor, autorMusica, autorLetras, tipoDisfraz, puntosObtenidos, integrantes, indice_integrantes);
        EmpresaDeAtrezo = empresaDeAtrezo;
    }

    public String getEmpresaDeAtrezo() {
        return EmpresaDeAtrezo;
    }

    public void setEmpresaDeAtrezo(String empresaDeAtrezo) {
        EmpresaDeAtrezo = empresaDeAtrezo;
    }


    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Comparsa con nombre " + super.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Comparsa " + super.nombre + " con el tipo de disfraz: " + super.tipoDisfraz);
    }

    @Override
    public void caminitoDelFalla() {
        System.out.println("La Comparsa " + super.nombre + " va caminito al falla");
    }

    @Override
    public String toString() {
        return "Comparsa{" +
                "EmpresaDeAtrezo='" + EmpresaDeAtrezo + '\'' +
                '}';
    }
}
