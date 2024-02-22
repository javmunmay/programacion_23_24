package U5.Examen1920M;

import static U5.Examen1920M.Elfos.Tipo.BOSQUE;
import static U5.Examen1920M.Elfos.Tipo.COSTA;

public class MainGame {
    public static void main(String[] args) {
        Elfos elfo1 = new Elfos("Legolas", false, COSTA);
        Elfos elfo2 = new Elfos("Dobi", false, BOSQUE);
        Orcos orc1 = new Orcos("Thrall", true, 200);
        Enanos enano1 = new Enanos("Gimli", false, 140);
        Guerreros guerrero1 = new Guerreros("Aragorn", false, 30);
        Magos mago1 = new Magos("Gandalf", false, 50);
        RPG game1 = new RPG();

        game1.addPersonaje(elfo1);
        game1.addPersonaje(orc1);
        game1.addPersonaje(mago1);
        game1.showPj();
        System.out.println();


        elfo1.setEnergy(800);
        elfo1.setAttack(90);
        elfo1.setDefense(70);
        System.out.println(elfo1);
        System.out.println();

        enano1.setEnergy(900);
        guerrero1.setEnergy(850);
        elfo2.setEnergy(750);

        orc1.setEnergy(0);
        orc1.setAttack(80);
        orc1.setDefense(60);
        System.out.println(orc1);
        System.out.println();

        mago1.setEnergy(0);
        System.out.println(mago1);
        game1.addPersonaje(mago1);
        System.out.println();

        game1.deletePersonaje();
        game1.showPj();

        elfo1.atacarPersonaje(orc1);
        System.out.println();

        game1.showPj();
        System.out.println();

        elfo1.atacarPersonaje(elfo2);
        System.out.println();

        game1.isWinner();

        game1.addPersonaje(elfo2);
        game1.addPersonaje(enano1);
        game1.addPersonaje(guerrero1);
        game1.showPj();
        game1.showEstado();


    }
}
