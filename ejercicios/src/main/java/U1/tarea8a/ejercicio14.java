package U1.tarea8a;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        //Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado,
        //utilizando para ello asteriscos (*). Por ejemplo, para n=4:
        //****
        //***
        //**
        //*


        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura:");
        int n = teclado.nextInt();

        int filas;
        int col;


        for (filas = 1; filas <= n; filas++) {

            for (col = 0; col <= n; col++) {

                if (col <= n - filas) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


            }

            System.out.println();
        }


    }

}
