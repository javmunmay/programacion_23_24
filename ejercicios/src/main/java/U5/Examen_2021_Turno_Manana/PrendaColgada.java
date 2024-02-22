package U5.Examen_2021_Turno_Manana;

public class PrendaColgada extends Prendas implements Doblar, Colgar {

    protected String alturaBarra;

    public PrendaColgada(double precio, String nombre, String codigoBarras, String prendaColgadaSioNo, int numeroDePrendas, String alturaBarra) {
        super(precio, nombre, codigoBarras, prendaColgadaSioNo, numeroDePrendas);
        this.alturaBarra = alturaBarra;
    }

    public void doblar() {
        System.out.println("La prenda " + super.Nombre + " no se puede doblar");
    }

    public void colgar() {
        System.out.println("La prenda " + super.Nombre + " está colgada");
    }
}
