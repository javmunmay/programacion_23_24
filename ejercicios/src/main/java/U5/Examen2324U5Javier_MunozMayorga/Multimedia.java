package U5.Examen2324U5Javier_MunozMayorga;

public abstract class Multimedia {

    protected int ID;
    //Tienen un identificador único que se genera automáticamente al crear el elemento,
    // increméntalo en 1 cada vez que se crea un elemento nuevo.
    private Boolean Finalizado;
    protected int AnoEstreno;
    protected String Titulo;


    public Multimedia(int ID, Boolean finalizado, int anoEstreno, String titulo) {
        this.ID = ID;
        Finalizado = finalizado;
        AnoEstreno = anoEstreno;
        Titulo = titulo;
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Boolean getFinalizado() {
        return Finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        Finalizado = finalizado;
    }


    public int getAnoEstreno() {
        return AnoEstreno;
    }

    public void setAnoEstreno(int anoEstreno) {
        AnoEstreno = anoEstreno;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public abstract void  dar_por_finalizado();

    @Override
    public String toString() {
        return "Multimedia{" +
                "ID=" + ID +
                ", Finalizado=" + Finalizado +
                ", AnoEstreno=" + AnoEstreno +
                ", Titulo='" + Titulo + '\'' +
                '}';
    }
}
