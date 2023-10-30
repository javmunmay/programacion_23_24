package U1.ExamenManana;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        //Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe introducir la altura.
        //En esa altura va incluida la estrella y el tronco. Suponemos que el usuario introduce una altura mayor
        //o igual a 4. Si la altura no es correcta se volverá a pedir hasta que el usuario introduzca una altura correcta.


        //MAL, NO SALE

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int altura = sc.nextInt();

        int parteSinBase = altura - 3;
        int estrella = altura;


        for (int a = estrella; a > 0; a--) {
            System.out.print(" ");
        }
        System.out.println("*");

        for (int a = estrella; a > 0; a--) {
            System.out.print(" ");
        }
        System.out.println("^");

        for (int j = parteSinBase; j > 0; j--) { //J es en que piso estamos

            // J pisos, en espacios
            for (int i = j; i > 0; i--) {
                System.out.print(" ");
            }
            System.out.print("^");

            // Cuantos putos pisos hemos bajado, de espacios
            for (int i = parteSinBase - j + 1; i > 0; i--) {
                System.out.print("  ");
            }

            System.out.print("^");

            System.out.println();
        }

        for (int base = parteSinBase * 2 + 1; base > 0; base--) {
            System.out.print("^");
        }


    }
}
