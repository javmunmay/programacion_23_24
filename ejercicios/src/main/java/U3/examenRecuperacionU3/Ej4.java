package U3.examenRecuperacionU3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej4 {

    /*
    Implementa una función con nombre nEsimo que busque el número que hay dentro de un array bidimensional en la posición
    n-ésima contando de izquierda a derecha y de arriba abajo, como si se estuviera leyendo. El primer elemento es el 0.

    Si la posición donde se busca no existe en el array, la función debe devolver -1.

    Se debe entregar tanto el código de la función como el código de prueba que la usa. Rellenaremos los arrays de manera aleatoria con números entre 10 y 100 (ambos incluidos).

    La cabecera de la función es la siguiente:

    public static int nEsimo(int[][] n, int posicion)
     */



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] n = new int[4][4];

        // Genera el array y lo muestra
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                n[i][j] = (int) (Math.random() * 91) + 10; //aleatorios desde el 10 incluido hasta el 100 incluido
                System.out.printf("%5d", n[i][j]);
            }
            System.out.println();
        }

        System.out.println("Introduce la posicion (Fila) a buscar en el array: Del 0 al "+n.length);
        int posFila = sc.nextInt();

        System.out.println("Introduce la posicion (columna) a buscar en el array: Del 0 al "+n.length);
        int posColumna = sc.nextInt();


        int resultado = nEsimo(n, posFila, posColumna);
        System.out.println(resultado);

    }

    public static int nEsimo(int[][] n, int posFila, int posColumna){

        int resultado = 0;

        for (int i = 0; i <= posFila; i++) {
            for (int j = 0; j <= posColumna; j++) {
                resultado= n[i][j];
            }
        }

        if (resultado == 0){
            resultado = -1;
        }

        return resultado;

    }



}
