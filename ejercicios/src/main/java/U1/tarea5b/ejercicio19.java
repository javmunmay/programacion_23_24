package U1.tarea5b;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {

        //Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos),
        // calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de semana comienza
        // el viernes a las 15:00h. Se da por hecho que el usuario introducirá un día y hora correctos, anterior
        // al viernes a las 15:00h

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el día de la semana (lunes a viernes): ");
        String diaSemana = teclado.next();

        System.out.print("Introduce las horas (0 a 23): ");
        int horas = teclado.nextInt();

        System.out.print("Introduce los minutos (0 a 59): ");
        int minutos = teclado.nextInt();


        //NO LO LLEGO A COMPRENDER AL 100%

    }
}
