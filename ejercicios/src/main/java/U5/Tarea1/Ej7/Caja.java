package U5.Tarea1.Ej7;

public class Caja {

    //ancho, un alto y un fondo
    private final double ancho; //es final porque se mantiene inmutable
    private final double alto;
    private final double fondo;
    private Etiqueta etiqueta;
    private Unidades unidades;

    public Caja(double ancho, double alto, double fondo, Unidades unidades, Etiqueta etiqueta) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidades = unidades;
        this.etiqueta = etiqueta;

    }

    public double getVolumen() {
        double anchoCM;
        double altoCM;
        double fondoCM;
        double resultado = 0;

        if (unidades == Unidades.CM) {
            anchoCM = ancho / 100;
            altoCM = alto / 100;
            fondoCM = fondo / 100;

            resultado = anchoCM * altoCM * fondoCM;
            System.out.println("Resultado en CM");
            return resultado;
        } else {
            resultado = ancho * alto * fondo;
            System.out.println("resultado en Metros (M)");
            return resultado;
        }


    }

    @Override
    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", unidades=" + unidades +
                ", Nombre=" + etiqueta.nombreDestinatario +
                ", Direccion=" + etiqueta.direccion +
                '}';
    }

    public enum Unidades {

        CM, M

    }


}
