package U1.tarea8a;

import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        //Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir
        //probando números tratando de acertarlo. El programa debe indicar "mayor" o "menor" según
        //el número secreto sea mayor o menor que el introducido por el usuario. El proceso finaliza
        //cuando el usuario acierta o cuando se rinde (introduciendo un -1).

        Scanner teclado = new Scanner(System.in);

        int numero;
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        System.out.println("Bienvenido al juego AZAR");
        System.out.println("Acierta el número secreto");
        System.out.println("-------------------------");
        System.out.println("Pulse enter para comenzar");
        teclado.nextLine(); // Espera a que el usuario presione Enter
        System.out.println("NUMERO SECRETO GENERADO, SUERTE");
        System.out.println("JUEGO AZAR INICIADO");
        System.out.println("PARA RENDIRSE INTRODUZCA Nº NEGATIVO");
        System.out.println("-------------------------");

        do {

            System.out.println("Introduzca el numero: ");
            numero = teclado.nextInt();

            if (numero > numeroAleatorio) {
                System.out.println("El numero secreto es menor");
            } else {
                System.out.println("El numero secreto es mayor");
            }


        } while (numero != numeroAleatorio && numero > 0);

        if (numero == numeroAleatorio) {

            System.out.println("¡Enhorabuena! has ganado.");
            System.out.println("El numero secreto era el: " + numeroAleatorio);

        } else {

            System.out.println("Rendirse no es opción, la próxima vez será...");

        }
    }
}
