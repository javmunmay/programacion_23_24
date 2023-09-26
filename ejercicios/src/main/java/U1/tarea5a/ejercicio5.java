package U1.tarea5a;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        //Crea un programa que pida tres números enteros
        //largos al usuario y diga cuál es el mayor de los tres.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero:");
        long numero1 = teclado.nextLong();

        System.out.println("Introduzca un segundo numero:");
        long numero2 = teclado.nextLong();

        System.out.println("Introduzca un tercer numero:");
        long numero3 = teclado.nextLong();

        long maximo = numero1;

        if (numero2 > maximo) {
            maximo = numero2;
        }
        if (numero3 > maximo) {
            maximo = numero3;
        }

        System.out.println("El numero mas alto es: " + maximo);
    }
}
