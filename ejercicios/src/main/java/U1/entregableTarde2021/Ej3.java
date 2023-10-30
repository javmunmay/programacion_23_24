package U1.entregableTarde2021;


import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        //Escribe un programa que sea capaz de insertar un dígito dentro de un número
        //indicando la posición. El nuevo dígito se colocará en la posición indicada y el
        //resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
        //izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
        //correctamente los datos. Se recomienda usar long en lugar de int ya que el
        //primero admite números más largos.
        //
        //Ejemplo:
        //Por favor, introduzca un número entero positivo: 406783
        //Introduzca la posición donde quiere insertar: 3
        //Introduzca el dígito que quiere insertar: 5
        //El número resultante es 4056783.

        Scanner scanner = new Scanner(System.in);

        //NO FUNCIONA COMO DEBE

        // Solicitar al usuario que introduzca un número entero positivo
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = scanner.nextLong();

        // Validar que el número sea positivo
        while (numero < 0) {
            System.out.println("Por favor, introduzca un número entero positivo.");
            System.out.print("Por favor, introduzca un número entero positivo: ");
            numero = scanner.nextLong();
        }

        // Solicitar al usuario que introduzca la posición de inserción
        System.out.print("Introduzca la posición donde quiere insertar: ");
        int posicion = scanner.nextInt();

        // Validar que la posición sea válida
        while (posicion < 1 || posicion > Long.toString(numero).length() + 1) {
            System.out.println("La posición de inserción no es válida.");
            System.out.print("Introduzca la posición donde quiere insertar: ");
            posicion = scanner.nextInt();
        }

        // Solicitar al usuario que introduzca el dígito a insertar
        System.out.print("Introduzca el dígito que quiere insertar: ");
        int digito = scanner.nextInt();

        // Insertar el dígito en la posición indicada utilizando bucles
        long resultado = 0;
        long factor = 1;

        while (numero > 0) {
            long digitoActual = numero % 10;

            resultado = resultado + digitoActual * factor;

            if (factor == Math.pow(10, Long.toString(numero).length() - posicion)) {
                resultado = resultado * 10 + digito;
            }

            factor *= 10;
            numero /= 10;
        }

        // Mostrar el resultado
        System.out.println("El número resultante es " + resultado);

        scanner.close();

    }
}
