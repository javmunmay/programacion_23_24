package U1.tarea5b;

import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {

        //Escribe un programa que calcule el precio final de un producto según su base imponible (precio antes de impuestos),
        //el tipo de IVA aplicado (general, reducido o superreducido) y el código promocional. Los tipos de IVA general,
        //reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos promocionales pueden ser nopro, mitad,
        //meno5 o 5porc que significan respectivamente que no se aplica promoción, el precio se reduce a la mitad, se descuentan
        //5 euros o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén
        //tabulados.
        //
        //
        //Ejemplo:
        //Introduzca la base imponible: 25
        //Introduzca el tipo de IVA (general, reducido o superreducido): reducido
        //Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
        //Base imponible
        //IVA (10%)
        //Precio con IVA
        //25.00
        //2.50
        //27.50
        //Cód. promo. (mitad): -13.75
        //TOTAL
        //13.75

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la base imponible: ");
        double baseImponible = teclado.nextDouble();

        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIva = teclado.next();

        double cantIva = 0;

        if (tipoIva.equals("general")) {
            cantIva = 21;
        } else if (tipoIva.equals("reducido")) {
            cantIva = 10;
        } else if (tipoIva.equals("superreducido")) {
            cantIva = 4;

            
        }


    }
}
