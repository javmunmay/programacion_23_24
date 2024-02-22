package U5.Examen_2021_Turno_Manana;

public class Prendas implements Devolver, Doblar {

    protected double precio;
    protected String Nombre;
    protected String CodigoBarras;
    protected String prendaColgadaSioNo; // o un string con si o no
    protected int NumeroDePrendas;


    public Prendas(double precio, String nombre, String codigoBarras, String prendaColgadaSioNo, int numeroDePrendas) {
        this.precio = precio;
        Nombre = nombre;
        CodigoBarras = codigoBarras;
        this.prendaColgadaSioNo = prendaColgadaSioNo;
        NumeroDePrendas = numeroDePrendas;
    }

    public void devolver() {
        System.out.println("Devolviendo la prenda con nombre " + Nombre + " y precio " + precio);
    }

    public void doblar() {
        System.out.println("La prenda " + Nombre + " se puede doblar");
    }


}
