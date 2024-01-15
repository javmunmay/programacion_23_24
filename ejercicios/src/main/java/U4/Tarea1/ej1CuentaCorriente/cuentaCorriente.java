package U4.Tarea1.ej1CuentaCorriente;

public class cuentaCorriente {
    //Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un objeto de ese tipo son:
    // saldo, límite de descubrimiento (cantidad de dinero que se permite sacar de una cuenta que ya está a cero),
    // nombre y DNI del titular. Las operaciones típicas con una cuenta corriente son:
    //
    //Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite de descubierto
    // será de -50 euros.
    //
    //Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto. El método debe indicar, por pantalla,
    // un mensaje que indique si ha sido posible llevar a cabo la operación. Además, deberá devolver un valor booleano
    // que indique lo mismo.
    //
    //Ingresar dinero: se incrementa el saldo.
    //
    //Mostrar información: muestra la información de la cuenta corriente.


    private String nombreTitular;
    private String dniTitular;
    private double saldo;
    private double limiteDescubierto;

    // Constructor para crear la cuenta con saldo inicial 0 y límite de descubierto de -50 euros.
    public cuentaCorriente(String nombreTitular, String dniTitular) {
        this.nombreTitular = nombreTitular;
        this.dniTitular = dniTitular;
        this.saldo = 0;
        this.limiteDescubierto = -50;
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


