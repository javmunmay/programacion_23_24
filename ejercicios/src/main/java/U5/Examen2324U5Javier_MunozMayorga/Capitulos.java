package U5.Examen2324U5Javier_MunozMayorga;

public class Capitulos {
    protected int ID_Capitulo;

    public Capitulos(int ID_Capitulo) {
        this.ID_Capitulo = ID_Capitulo;
    }

    public int getID_Capitulo() {
        return ID_Capitulo;
    }

    public void setID_Capitulo(int ID_Capitulo) {
        this.ID_Capitulo = ID_Capitulo;
    }



    @Override
    public String toString() {
        return "Capitulos{" +
                "ID_Capitulo=" + ID_Capitulo +
                '}';
    }
}
