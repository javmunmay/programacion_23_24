package U1.tarea3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        //Crea un programa que pida al usuario su año de nacimiento y
        // el año actual (usando datos de tipo short)
        // y halle la diferencia de ambos para obtener su edad.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce su año de nacimiento: ");
        short annonacimiento =teclado.nextShort();

        System.out.println("Introduce el año actual: ");
        short annoactual =teclado.nextShort();


        int edad = annoactual - annonacimiento;

        System.out.println("La edad es: " + edad);



    }
}