package U1.tarea2;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        System.out.println("Introduce una temperatura en grados centígrados: ");
        Scanner teclado = new Scanner(System.in);
        int grados =teclado.nextInt();

        //Fahrenheit equivalen (F = 9*C/5 + 32).
        //(0 °C × 9 / 5) + 32 = 32F

        double solucionfah =  (double)(grados*9/5)+32;

        System.out.println(grados + " grados son: " + solucionfah + " fahrenheit");



    }
}
