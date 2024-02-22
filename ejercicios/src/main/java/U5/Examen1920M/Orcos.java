package U5.Examen1920M;

public class Orcos extends Personaje implements Atacar{
    private int tonelaje;

    public Orcos(String name, boolean bewitched, int tonelaje) {
        super(name, bewitched);
        this.tonelaje = tonelaje;
    }


    @Override
    public String toString() {
        return "Orcos{" +
                "tonelaje=" + tonelaje +
                super.toString();
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
}
