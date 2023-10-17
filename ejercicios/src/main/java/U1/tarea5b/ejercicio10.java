package U1.tarea5b;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        //Escribe un programa que dada una hora determinada (horas y minutos),
        //calcule los segundos que faltan para llegar a la medianoche.

        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduce una determinada hora (después se le preguntará los minutos): (de 0 a 23) ");
        int hora = teclado.nextInt();
        System.out.println("Introduce los minutos de la hora que se desea introducir: (de 0 a 59) ");
        int minutos = teclado.nextInt();

        if (hora >= 0 && hora <= 23) {
            if (minutos >= 0 && minutos <= 59) {

                int segundosHastaMedianoche = 0;
                int segundosTotalesUnDia = 24 * 60 * 60;
                int segundosIntroducidos = hora * 60 * 60 + minutos * 60;

                System.out.println("La hora completa introducida es: " + hora + ":" + minutos);
                segundosHastaMedianoche = segundosTotalesUnDia - segundosIntroducidos;
                System.out.println("Segundos que faltan hasta media noche: " + segundosHastaMedianoche);


            } else {
                System.out.println("ERROR: Los valores introducidos no son correcto, en minutos debe introducir un valor entre 0 y 59");
            }
        } else {
            System.out.println("ERROR: Los valores introducidos no son correcto, en hora debe introducir un valor entre 0 y 23");
        }


    }
}
