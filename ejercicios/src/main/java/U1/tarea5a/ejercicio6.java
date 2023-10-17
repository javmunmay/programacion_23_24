package U1.tarea5a;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        //Crea un programa que contenga una constante llamada gravedad = 9,8
        //solicite al usuario el valor de "tiempo", y calcule y muestre la velocidad
        //(velocidad=gravedad x tiempo). Nota: si el valor del tiempo es negativo o 0,
        //se mostrará el mensaje "Tiempo incorrecto"

        Scanner teclado = new Scanner(System.in);

        final double gravedad = 9.8;

        System.out.println("Introduzca un tiempo (en minutos): ");
        long tiempo = teclado.nextLong();

        double velocidad;

        velocidad = gravedad * tiempo;

        if (tiempo <= 0) {
            System.out.println("ERROR: Tiempo incorrecto");
        } else {
            System.out.println("La velocidad es igual a: " + velocidad);
        }


    }
}
