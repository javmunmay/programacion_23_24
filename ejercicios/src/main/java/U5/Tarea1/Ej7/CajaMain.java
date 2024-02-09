package U5.Tarea1.Ej7;

import U5.Tarea1.Ej1.Hora;

public class CajaMain {
    public static void main(String[] args) {

        System.out.println("Bienvenido a Transportes Paqueteria Express");
        System.out.println(" ");
        System.out.println("Paquetes: ");
        Etiqueta etiqueta1 = new Etiqueta("Javier Munoz", "Sevilla 41000");
        Etiqueta etiqueta2 = new Etiqueta("Carlos Breuer", "Sevilla 41000");
        Caja caja1 = new Caja(50, 30, 40, Caja.Unidades.CM, etiqueta1);
        System.out.println(caja1.getVolumen());
        System.out.println(caja1.toString());
        Caja caja2 = new Caja(20, 25, 30, Caja.Unidades.M, etiqueta2);
        System.out.println(caja2.getVolumen());
        System.out.println(caja2.toString());


    }
}
