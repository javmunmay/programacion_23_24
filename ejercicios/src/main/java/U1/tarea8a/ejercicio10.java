package U1.tarea8a;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        //Implementar una aplicación que pida un número al usuario entre el 1 y el 10, y calcule su tabla de multiplicar.
        //El código debe asegurarse de que el número introducido está entre 1 y 10, y si no es así, volver a pedirlo hasta que lo cumpla.


        Scanner teclado = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introduce un numero entre el 1 y el 10.");
            num = teclado.nextInt();

            if (num < 1 || num > 10) {

                System.out.println("ERROR: Valor fuera de rango, por favor introduzca un numero entre el 1 y el 10");

            }


        } while (num < 1 || num > 10);

        System.out.println("TABLA DE MULTIPLICAR DEL " + num);
        int resultado;

        do {


            resultado = num;
            System.out.println(num + " * 1 = " + resultado);

            resultado = num * 2;
            System.out.println(num + " * 2 = " + resultado);

            resultado = num * 3;
            System.out.println(num + " * 3 = " + resultado);

            resultado = num * 4;
            System.out.println(num + " * 4 = " + resultado);

            resultado = num * 5;
            System.out.println(num + " * 5 = " + resultado);

            resultado = num * 6;
            System.out.println(num + " * 6 = " + resultado);

            resultado = num * 7;
            System.out.println(num + " * 7 = " + resultado);

            resultado = num * 8;
            System.out.println(num + " * 8 = " + resultado);

            resultado = num * 9;
            System.out.println(num + " * 9 = " + resultado);

            resultado = num * 10;
            System.out.println(num + " * 10 = " + resultado);

        } while (true);


    }
}
