package U3.tarea3Arrays;


import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        //Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta.
        //La aplicación genera de forma aleatoria, una combinación secreta de n dígitos del 1 al 5
        //(siendo n la longitud indicada anteriormente por el usuario). El jugador introduce ahora
        //una combinación de prueba. En cada intento se mostrará como pista, para cada dígito, si es
        //mayor menor o igual que el correspondiente de la combinación secreta.


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicitar al jugador la longitud de la clave
        System.out.print("Introduzca longitud de la clave: ");
        int longitudClave = scanner.nextInt();

        // Generar la clave secreta de forma aleatoria
        int[] claveSecreta = new int[longitudClave];
        for (int i = 0; i < longitudClave; i++) {
            claveSecreta[i] = random.nextInt(5) + 1;  // Números del 1 al 5

        }

        System.out.println("¡Clave secreta generada!");

        // Iniciar el juego
        boolean acertado = false;
        int intentos = 0;

        while (!acertado) {
            // Solicitar al jugador una combinación de prueba
            System.out.print("Intente acertarla: ");
            System.out.println();
            System.out.println("INFO: Introducir numeros de 1 en 1");
            int[] combinacionPrueba = new int[longitudClave];
            for (int i = 0; i < longitudClave; i++) {
                combinacionPrueba[i] = scanner.nextInt();
            }

            // Comparar la combinación de prueba con la clave secreta
            boolean igual = true;
            boolean mayor = false;
            boolean menor = false;

            for (int i = 0; i < longitudClave; i++) {
                if (combinacionPrueba[i] < claveSecreta[i]) {
                    mayor = true;
                    igual = false;
                } else if (combinacionPrueba[i] > claveSecreta[i]) {
                    menor = true;
                    igual = false;
                }
            }

            // Mostrar pistas
            if (igual) {
                System.out.println("¡Felicidades! Has acertado la clave secreta.");
                acertado = true;

            } else {
                System.out.println("Pistas:");

                for (int i = 0; i < longitudClave; i++) {
                    if (mayor && menor) {
                        System.out.println(combinacionPrueba[i] + " es diferente");
                    } else if (mayor) {
                        System.out.println(combinacionPrueba[i] + " es mayor");
                    } else {
                        System.out.println(combinacionPrueba[i] + " es menor");
                    }
                }
            }

            intentos++;
        }

        System.out.println("¡Número de intentos: " + intentos + "!");


    }
}
