package U1.tarea2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        System.out.println("Introduce el primer número entero: ");
        Scanner teclado = new Scanner(System.in);
        int numero1 =teclado.nextInt();
        System.out.println("Introduce el segundo número entero: ");
        int numero2 =teclado.nextInt();

        System.out.println("El resto del dividendo de ambos numeros es: ");
        System.out.println(numero1%numero2);


    }
}
