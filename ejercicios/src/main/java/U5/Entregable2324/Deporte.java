package U5.Entregable2324;

    // Clase abstracta para Deporte
    abstract class Deporte {
        private String nombreDeporte;
        private String nombrePabellon;
        private TipoParticipante tipoParticipantes;

        // Constructor
        public Deporte(String nombreDeporte, String nombrePabellon, TipoParticipante tipoParticipantes) {
            this.nombreDeporte = nombreDeporte;
            this.nombrePabellon = nombrePabellon;
            this.tipoParticipantes = tipoParticipantes;
        }


        public String getNombreDeporte() {
            return nombreDeporte;
        }

        public String getNombrePabellon() {
            return nombrePabellon;
        }

        public void setNombreDeporte(String nombreDeporte) {
            this.nombreDeporte = nombreDeporte;
        }

        public void setNombrePabellon(String nombrePabellon) {
            this.nombrePabellon = nombrePabellon;
        }

        public void setTipoParticipantes(TipoParticipante tipoParticipantes) {
            this.tipoParticipantes = tipoParticipantes;
        }

        public TipoParticipante getTipoParticipantes() {
            return tipoParticipantes;
        }


        public void quitarParticipante(String participante) {
            tipoParticipantes.remove(participante);
        }

        public void ayadirParticipante(Participante jugador2, TipoParticipante tipoParticipante) {
        }

//        public void mostrarParticipantes() {
//            System.out.println("Participantes del deporte " + nombreDeporte + ":");
//            for (String participante : tipoParticipantes) {
//                System.out.println(participante);
//            }
//        }


        @Override
        public String toString() {
            return "Deporte{" +
                    "nombreDeporte='" + nombreDeporte + '\'' +
                    ", nombrePabellon='" + nombrePabellon + '\'' +
                    ", tipoParticipantes=" + tipoParticipantes +
                    '}';
        }
    }



