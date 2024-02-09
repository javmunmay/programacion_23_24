package U5.Tarea1.Ej2;

public class Hora12Main {
    public static void main(String[] args) {
        // Crear instancias de Hora12 y probar los métodos
        Hora12 hora1 = new Hora12(5, 30, "pm");
        Hora12 hora2 = new Hora12(11, 45, "am");

        // Mostrar la hora actual
        System.out.println("Hora actual 1: " + hora1);

        // Incrementar la hora
        hora1.inc();
        System.out.println("Después de incrementar 1 minuto: " + hora1);

        // Establecer nuevos valores
        hora1.setHora(9);
        hora1.setMinuto(15);
        hora1.setPeriodo("am");
        System.out.println("Después de cambiar valores: " + hora1);

        // Mostrar otra instancia de Hora12
        System.out.println("Hora actual 2: " + hora2);
    }
}
