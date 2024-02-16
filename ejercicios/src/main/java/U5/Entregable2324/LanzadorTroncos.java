package U5.Entregable2324;

class LanzadorTroncos extends Participante {
    private String nombrePrueba;

    // Constructor
    public LanzadorTroncos(String nombre, int edad, String nombrePrueba) {
        super(nombre, edad);
        this.nombrePrueba = nombrePrueba;
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo " + getNombre() + ", como lanzador, juro los valores deportivos mundiales");
    }

    // Método específico para LanzadorTroncos
    public void lanzar() {
        System.out.println("Voy a lanzar");
    }

    //crear lista(enum) nombre prueba

}
