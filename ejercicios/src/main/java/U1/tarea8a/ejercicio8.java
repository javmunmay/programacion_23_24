package U1.tarea8a;

import java.util.Scanner;

public class ejercicio8 {
    //Pedir un número y calcular su factorial.
    //
    //Ejemplo: Factorial de 5:
    //
    //5! = 5x4x3x2x1 = 120

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();


        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
            
        }


        System.out.println("Factorial del número: " + numero + "! = " + factorial);


    }


}
