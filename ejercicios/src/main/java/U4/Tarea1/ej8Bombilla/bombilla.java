package U4.Tarea1.ej8Bombilla;

public class bombilla {
    private static boolean int_general;
    private boolean estado;

    public void interruptor() {
        if (estado = true) {
            estado = false;
        }
        estado = !estado;
    }

    public void mostrar_estado() {
        if (estado && int_general) {
            System.out.println("Encendida");
        } else {
            System.out.println("Apagada");
        }
    }
}
