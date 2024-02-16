package U5.Entregable2324;

class PeladorGambas extends Participante {
    private int pesoCategoria;

    // Constructor
    public PeladorGambas(String nombre, int edad, int pesoCategoria) {
        super(nombre, edad);
        this.pesoCategoria = pesoCategoria;
    }

    public int getPesoCategoria() {
        return pesoCategoria;
    }

    public void setPesoCategoria(int pesoCategoria) {
        this.pesoCategoria = pesoCategoria;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo " + getNombre() + ", como pelador, juro los valores deportivos mundiales");
    }

    // Método específico para PeladorGambas
    public void pelar() {
        System.out.println("Voy a pelar mis gambas");
    }
}
