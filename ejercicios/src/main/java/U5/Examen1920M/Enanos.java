package U5.Examen1920M;

public class Enanos extends Personaje implements Atacar{
    private int altura;

    public Enanos(String name, boolean bewitched, int altura) {
        super(name, bewitched);
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Enanos{" +
                "altura=" + altura +
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
