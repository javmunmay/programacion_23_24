package org.velazquez;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Introduce un número entero: ");
        Scanner teclado = new Scanner(System.in);
        int numero =teclado.nextInt();
        System.out.println("El número introducido es: ");
        System.out.println(numero);


    }
}