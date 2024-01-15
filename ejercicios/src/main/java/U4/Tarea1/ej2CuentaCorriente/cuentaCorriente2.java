package U4.Tarea1.ej2CuentaCorriente;

public class cuentaCorriente2 {
   
    private String nombreTitular;
    private String dniTitular;
    private double saldo;
    private double limiteDescubierto;

    // Constructor para crear la cuenta con saldo inicial 0 y límite de descubierto de 0 euros.
    public cuentaCorriente2(String nombreTitular, String dniTitular) {
        this.nombreTitular = nombreTitular;
        this.dniTitular = dniTitular;
        this.saldo = 0;
        this.limiteDescubierto = 0;
    }

    // Método para sacar dinero de la cuenta.
    public boolean sacarDinero(double cantidad) {
        if (cantidad <= (saldo + limiteDescubierto)) {
            saldo -= cantidad;
            System.out.println("Operación realizada. Nuevo saldo: " + saldo);
            return true;
        } else {
            System.out.println("Operación no realizada. Fondos insuficientes.");
            return false;
        }
    }

    // Método para ingresar dinero en la cuenta.
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
        System.out.println("Dinero ingresado. Nuevo saldo: " + saldo);
    }

    // Método para mostrar información de la cuenta corriente.
    public void mostrarInformacion() {
        System.out.println("Titular: " + nombreTitular);
        System.out.println("DNI: " + dniTitular);
        System.out.println("Saldo: " + saldo + " euros");
        System.out.println("Límite de descubierto: " + limiteDescubierto + " euros");
    }


}


