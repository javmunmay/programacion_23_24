package U5.Examen1920M;

public class Guerreros extends Hombres implements Atacar {
    private int edad;

    public Guerreros(String name, boolean bewitched, int edad) {
        super(name, bewitched);
        this.edad = edad;
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

    @Override
    public String toString() {
        return "Guerreros{" +
                "edad=" + edad +
                super.toString();
    }
}