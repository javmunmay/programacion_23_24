package U1.tarea3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        // Crea un programa que calcule y muestre la división de dos números
        // reales de doble precisión introducidos por el usuario.

        System.out.println("Introduce un numero: ");
        Scanner teclado = new Scanner(System.in);
        double numero1 =teclado.nextDouble();

        System.out.println("Introduce otro numero: ");
        double numero2 =teclado.nextDouble();


        double solucion = numero1 / numero2;

        System.out.println("La solucion de la división es: " + solucion);



    }
}