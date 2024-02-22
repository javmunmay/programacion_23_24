package U5.Examen_2021_Turno_Manana;

public abstract class Vehiculo {

    protected String matricula;
    protected int CargaMAx;
    protected Conductor[] conductor;

    public Vehiculo(String matricula, int cargaMAx, Conductor[] conductor) {
        this.matricula = matricula;
        CargaMAx = cargaMAx;
        this.conductor = conductor;
    }

    //Al decir que no es instanciable quiere decir que es abstract.

    public abstract void descargar();

}
