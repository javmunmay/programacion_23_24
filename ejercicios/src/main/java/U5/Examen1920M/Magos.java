package U5.Examen1920M;

public class Magos extends Hombres implements Magia {
    private int longBarba;

    public Magos(String name, boolean bewitched, int longBarba) {
        super(name, bewitched);
        this.longBarba = longBarba;
    }

    @Override
    public String toString() {
        return "Magos{" +
                "longBarba=" + longBarba +
                super.toString();
    }

    @Override
    public void encantar(Personaje pj) {
        pj.setBewitched(true);
        System.out.println("Quedas encantado");
    }

    @Override
    public void desencantar(Personaje pj) {
        pj.setBewitched(false);
        System.out.println("Quedas desencantado");
    }
}
