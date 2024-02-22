package U5.Examen1920M;

public class Elfos extends Personaje implements Atacar{
private Tipo tipoElfo;
    public Elfos(String name, boolean bewitched, Tipo tipoElfo) {
        super(name,  bewitched);
        this.tipoElfo=tipoElfo;
    }

    @Override
    public void atacarPersonaje( Personaje o2) {
        System.out.println(super.name + " ATACANDO!");
        if (this.getClass() == o2.getClass()) {
            System.out.println("La lucha ha acabado y ambos quedan como empezaron");
        } else {
            int danno;
            if (o2.bewitched) {
                danno = (this.attack - o2.defense) * 2;
            } else {
                danno = (this.attack - o2.defense);
            }
            o2.energy = o2.energy - danno;
        }
    }

    public enum Tipo{
        BOSQUE,
        COSTA
    }

    @Override
    public String toString() {
        return "Elfos{" +
                "tipoElfo=" + tipoElfo +
                super.toString();
    }
}
