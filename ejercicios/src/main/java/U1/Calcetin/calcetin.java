package U1.Calcetin;

import java.util.Scanner;

public class calcetin {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Introduzca la altura de los calcetines: ");
        int altura = key.nextInt();

        for (int i = 0; i < altura - 2; i++) {
            System.out.println("*     *");
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("**  **");
        }

    }
}
