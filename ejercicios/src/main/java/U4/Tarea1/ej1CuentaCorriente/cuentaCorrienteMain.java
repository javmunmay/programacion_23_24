package U4.Tarea1.ej1CuentaCorriente;

public class cuentaCorrienteMain {


    public static void main(String[] args) {
        // Crear una cuenta corriente
        cuentaCorriente cuenta = new cuentaCorriente("Miguel Ortiz", "123456789A");

        // Mostrar información de la cuenta
        cuenta.mostrarInformacion();

        // Sacar dinero (intenta sacar más del límite de descubierto)
        boolean operacion1 = cuenta.sacarDinero(60);
        System.out.println("Operación 1: " + (operacion1 ? "Realizada" : "No realizada"));

        // Ingresar dinero
        cuenta.ingresarDinero(100);

        // Sacar dinero (dentro del límite de descubierto)
        boolean operacion2 = cuenta.sacarDinero(30);
        System.out.println("Operación 2: " + (operacion2 ? "Realizada" : "No realizada"));

        // Mostrar información actualizada de la cuenta
        cuenta.mostrarInformacion();
    }
}


