package U1.tarea5b;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {

        //Escribe un programa que ordene tres números enteros introducidos por teclado.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = teclado.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int numero3 = teclado.nextInt();


        if (numero1 > numero2 && numero1 > numero3) {
            if (numero2 > numero3) {
                System.out.println(numero1 + " > " + numero2 + " > " + numero3);
            } else {
                System.out.println(numero1 + " > " + numero3 + " > " + numero2);
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            if (numero1 > numero3) {
                System.out.println(numero2 + " > " + numero1 + " > " + numero3);
            } else {
                System.out.println(numero2 + " > " + numero3 + " > " + numero1);
            }
        } else {
            if (numero1 > numero2) {
                System.out.println(numero3 + " > " + numero1 + " > " + numero2);
            } else {
                System.out.println(numero3 + " > " + numero2 + " > " + numero1);
            }
        }
    }
}

