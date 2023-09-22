package U1.tarea3;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        //Crea un programa que calcule y muestre la suma de dos números de dos cifras (de tipo byte) que introduzca el usuario.

        System.out.println("Introduce el primer numero de dos cifras: ");
        Scanner teclado = new Scanner(System.in);
        byte numero1 =teclado.nextByte();

        System.out.println("Introduce el segundo numero de dos cifras: ");
        byte numero2 =teclado.nextByte();


        int solucion = numero1 + numero2;

        System.out.println("El resultado de la suma es: " + solucion);



    }
}
