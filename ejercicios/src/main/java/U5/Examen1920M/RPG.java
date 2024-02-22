package U5.Examen1920M;

import java.util.Arrays;

public class RPG {
    private Personaje[] listapersonajes;
    private int indexPj;

    public RPG() {
        this.listapersonajes = new Personaje[10];
        this.indexPj = 0;
    }

    //metodos
    public void addPersonaje(Personaje pj) {
        if (indexPj == 10) {
            System.out.println("No pueden añadirse más personajes");
            return;
        } else if (indexPj == listapersonajes.length) {
            listapersonajes = Arrays.copyOf(listapersonajes, listapersonajes.length + 1);
        }
        listapersonajes[indexPj] = pj;
        indexPj++;
    }

    public void deletePersonaje() {
        int i = 0;
        while (i < indexPj) {
            if (listapersonajes[i].getEnergy() <= 0 && listapersonajes[i] != null) {
                for (int j = i; j < indexPj - 1; j++) {
                    listapersonajes[j] = listapersonajes[j + 1];
                }
                listapersonajes[indexPj - 1] = null;
                indexPj--;
            } else {
                i++;
            }
        }
    }

    public void isWinner() {
        Personaje winner = null;
        int countNonNull = 0;
        for (Personaje i : listapersonajes) {
            if (i != null) {
                countNonNull++;
                winner = i;
            }
        }
        if (countNonNull == 1) {
            System.out.println("Ganador: " + winner.getName());
        } else {
            System.out.println("Error: No hay jugadores en la lista o todos son nulos.");
        }
    }

    public void showPj() {
        for (Personaje i : listapersonajes) {
            System.out.println(i);
        }
    }

    //Ordenar no funcionan
    public void showEstado() {
        Arrays.sort(listapersonajes, new OrdenarPorEnergia());
        showPj();
    }

    public void showAtaque() {
        Arrays.sort(listapersonajes, new OrdenarPorAtaque());
        showPj();
    }

    public void showDefensa() {
        Arrays.sort(listapersonajes, new OrdenarPorDefensa());
        showPj();
    }
}