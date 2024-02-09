package U5.Tarea1.Ej1;

import com.sun.source.tree.UsesTree;

public class Hora {

    //Diseñar la clase Hora que representa un instante de tiempo compuesto por una hora (de 0 a 23) y los minutos.
    //
    //Dispone del constructor:
    //
    //Hora (hora,minuto), que construye un objeto con los datos pasados como parámetro
    //y de los métodos:
    //
    //inc(), que incrementa la hora en un minuto
    //setMinutos(valor), que da valor a los minutos, siempre y cuando sea un valor con sentido
    //setHora(valor),que da valor a la hora, siempre y cuando sea un valor con sentido
    //toString(), que devuelve un String con la representación del reloj.

    int hora;
    int minuto;


    public Hora(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    //Setter

    public void setHora(int valor) {
        if (valor >= 0 && valor < 24) {
            minuto = valor;
        } else {
            System.out.println("Error: Valor de horas no válido");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        }
    }

    // Método para incrementar la hora en un minuto
    public void inc() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora = (hora + 1) % 24;
        }
    }

    // Método para establecer los minutos, siempre y cuando sea un valor con sentido
    public void setMinutos(int valor) {
        if (valor >= 0 && valor < 60) {
            minuto = valor;
        } else {
            System.out.println("Error: Valor de minutos no válido");
        }
    }


    @Override
    public String toString() {
        return hora + " : " + minuto;
    }
}

