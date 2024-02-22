package U5.Examen1920M;

public abstract class Personaje {
    protected String name;
    protected int energy;
    protected int attack;
    protected int defense;
    protected boolean bewitched;

    public Personaje(String name, boolean bewitched) {
        this.name = name;
        setEnergy(energy);
        setAttack(attack);
        setDefense(defense);
        this.bewitched = bewitched;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(int energy) {
        if (energy<0 || energy>1000){
            System.out.println("Introduzca otra energia");
        }else {
            this.energy = energy;
        }
    }

    public void setAttack(int attack) {
        if (attack<0||attack>100){
            System.out.println("Introduzca otro ataque");
        }else {
            this.attack = attack;
        }
    }

    public void setDefense(int defense) {
        if (defense<0||defense>1000){
            System.out.println("Introduzca otra defensa");
        }else {
            this.defense = defense;
        }
    }

    public void setBewitched(boolean bewitched) {
        this.bewitched = bewitched;
    }

    public boolean isBewitched() {
        return bewitched;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", attack=" + attack +
                ", defense=" + defense +
                ", bewitched=" + bewitched +
                '}';
    }
}
