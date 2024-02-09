package U5.Tarea1.Ej2;

public class Hora12 {
    int hora;
    int minuto;
    String periodo; // "am" o "pm"

    public Hora12(int hora, int minuto, String periodo) {
        setHora(hora);
        setMinuto(minuto);
        setPeriodo(periodo);
    }

    // Setter para la hora (1 a 12)
    public void setHora(int valor) {
        if (valor >= 1 && valor <= 12) {
            hora = valor;
        } else {
            System.out.println("Error: Valor de horas no válido");
        }
    }

    // Setter para el periodo (am o pm)
    public void setPeriodo(String periodo) {
        if ("am".equalsIgnoreCase(periodo) || "pm".equalsIgnoreCase(periodo)) {
            this.periodo = periodo.toLowerCase(); // Almacenar en minúsculas
        } else {
            System.out.println("Error: Valor de periodo no válido");
        }
    }

    // Setter para los minutos (0 a 59)
    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Error: Valor de minutos no válido");
        }
    }

    // Método para incrementar la hora en un minuto
    public void inc() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora = (hora + 1) % 12;
            if (hora == 0) {
                hora = 12;
            }
        }
    }

    //REVISAR ESTO ESTA MAL O NO LO HEMOS DADO
    @Override
    public String toString() {
        // Formatear la salida para tener dos dígitos en los minutos y mostrar el periodo
        return String.format("%d:%02d %s", hora, minuto, periodo);
    }
}

