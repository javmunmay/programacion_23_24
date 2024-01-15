package U4.Tarea1.ej4CuentaCorriente;

public class cuentaCorrienteMain4 {

    public static void main(String[] args) {
        // Crear una cuenta corriente
        cuentaCorriente4 cuenta = new cuentaCorriente4("Carlos Salcedo", "123456789A", "Banco Paradais");

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

        //Muestra el nombre del banco actual
        cuenta.mostrarNombreBanco();

        // Cambiar el nombre del banco.
        cuenta.cambiarNombreBanco("Banco Luxury");

        // Mostrar información actualizada de la cuenta
        cuenta.mostrarInformacion();


    }

}

