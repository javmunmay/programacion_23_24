package U5.Tarea1.Ej9;

public class Television extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;

    // Constructor por defecto
    public Television() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    // Constructor con precio y peso
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    // Constructor con resolución, sintonizador TDT y resto de atributos heredados
    public Television(int resolucion, boolean sintonizadorTDT, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Método get de resolución
    public int getResolucion() {
        return resolucion;
    }

    // Método get de sintonizador TDT
    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    // Método para calcular el precio final
    @Override
    public double getPrecioFinal() {
        double precioFinal = super.getPrecioFinal();

        if (resolucion > 40) {
            precioFinal *= 1.3;
        }

        if (sintonizadorTDT) {
            precioFinal += 50;
        }

        return precioFinal;
    }

    // Método toString
    @Override
    public String toString() {
        return "Television{" +
                "resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                ", precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", precioFinal=" + getPrecioFinal() +
                '}';
    }
}
