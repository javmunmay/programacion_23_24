package U1.tarea5b;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        //Amplía el programa anterior para que diga la nota del boletín
        //(insuficiente, suficiente, bien, notable o sobresaliente).

        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa para calcular la nota media de tres notas: ");

        System.out.println("Introduzca la primera nota: ");
        double primeraNota = teclado.nextDouble();

        System.out.println("Introduzca la segunda nota: ");
        double segundaNota = teclado.nextDouble();

        System.out.println("Introduzca la tercera nota: ");
        double terceraNota = teclado.nextDouble();


        double notaMedia = (primeraNota + segundaNota + terceraNota) / 3;

        System.out.println("La nota media es: " + notaMedia);

        if (notaMedia < 5) {

            System.out.println("La nota del boletin es: INSUFICIENTE ");

        } else if (notaMedia < 6) {

            System.out.println("La nota del boletin es: SUFICIENTE ");

        } else if (notaMedia < 7) {

            System.out.println("La nota del boletin es: BIEN ");

        } else if (notaMedia < 9) {

            System.out.println("La nota del boletin es: NOTABLE ");

        } else {

            System.out.println("La nota del boletin es: SOBRESALIENTE ");

        }


    }
}
