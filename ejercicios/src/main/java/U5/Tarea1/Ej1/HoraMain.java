package U5.Tarea1.Ej1;

import U4.Entregable23_24.Festival;

public class HoraMain {
    public static void main(String[] args) {
        Hora h1 = new Hora(23, 59);

        System.out.println(h1.toString());
        h1.inc();
        System.out.println(h1.toString());


    }


}
