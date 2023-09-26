package U1.tarea5a;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        //Crea un programa que pida un número entero al usuario y diga si
        //es positivo (mayor que cero) o si, por el contrario, no lo es (usando "else").

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int numero1 = teclado.nextInt();

        if (numero1 > 0) {
            System.out.println("El numero introducido es positivo ");
        } else {
            System.out.println("El numero introducido es negativo ");

        }

    }
}
