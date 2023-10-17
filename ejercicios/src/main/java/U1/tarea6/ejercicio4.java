package U1.tarea6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio4 {

    //Crea un programa que pida dos números de tipo byte al usuario y cree a una variable
    //"menor", que tenga el valor del menor de esos dos números. Hazlo primero con un "if"
    //y luego con un "operador condicional".
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        byte primerNumero = teclado.nextByte();
        System.out.println("Introduce el segundo numero: ");
        byte segundoNumero = teclado.nextByte();


    }
}
