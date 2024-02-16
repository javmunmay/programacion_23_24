package U5.Entregable2324;


    public class Baloncestista extends Participante {
        private double altura;
        private String nombre;

        public Baloncestista(String nombre, int edad, double altura) {
            super(nombre, edad);
            this.altura = altura;
        }

        public double getAltura() {
            return altura;
        }

        @Override
        public String getNombre() {
            return nombre;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        @Override
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public void hacerJuramento() {
            System.out.println("Yo " + this.nombre + ", como jugador de baloncesto, juro los valores deportivos mundiales.");
        }

        public void encestar() {
            System.out.println("+2 puntos.");
        }

       
    }
