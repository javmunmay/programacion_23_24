package U5.Tarea1.Ej9;

public class Lavadora extends Electrodomestico {

    private double carga;

    // Constructor por defecto
    public Lavadora() {
        super();
        this.carga = 5;
    }

    // Constructor con precio y peso
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    // Constructor con carga y resto de atributos heredados
    public Lavadora(double carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // Método get de carga
    public double getCarga() {
        return carga;
    }

    // Método para calcular el precio final
    @Override
    public double getPrecioFinal() {
        double precioFinal = super.getPrecioFinal();

        if (carga > 30) {
            precioFinal += 50;
        }

        return precioFinal;
    }

    // Método toString
    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", precioFinal=" + getPrecioFinal() +
                '}';
    }
}
