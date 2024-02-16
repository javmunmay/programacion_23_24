package U5.Entregable2324;

class JugadorBaloncesto extends Participante {
    private double altura;

    // Constructor
    public JugadorBaloncesto(String nombre, int edad, double altura) {
        super(nombre, edad);
        this.altura = altura;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo " + getNombre() + ", como jugador de baloncesto, juro los valores deportivos mundiales");
    }

    // Método específico para JugadorBaloncesto
    public void encestar() {
        System.out.println("2 puntos!!!!!");
    }
}
