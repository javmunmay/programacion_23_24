package U1.entregableTarde2021;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        //Dada una cadena mostrar por pantalla la cantidad de espacios, haches y vocales
        //abiertas tiene, independientemente de que sean mayúsculas, minúsculas o acentuadas.
        //Las vocales abiertas son a, e, o.
        //
        //Ejemplo:
        //Entrada: cad = "Hipólito el Ánodo"
        //Salida: La cantidad de espacios, haches y vocales abiertas es 9

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca una cadena
        System.out.print("Por favor, introduzca una cadena: ");
        String cadena = scanner.nextLine();

        // Contar la cantidad de espacios, haches y vocales abiertas
        int espacios = 0;
        int haches = 0;
        int vocalesAbiertas = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            char caracterLowerCase = Character.toLowerCase(caracter); //LOWER CASE NO FUNCIONA

            if (caracter == ' ') {
                espacios++;
            } else if (caracterLowerCase == 'h') {
                haches++;
            } else if (caracter == 'a' || caracter == 'e' || caracter == 'o' ||
                    caracter == '\u00E1' || caracter == '\u00E9' || caracter == '\u00F3') { //ESTO NO FUNCIONA
                vocalesAbiertas++;
            }
        }

        // Mostrar el resultado
        System.out.println("La cantidad de espacios, haches y vocales abiertas es " + (espacios + haches + vocalesAbiertas));

        scanner.close();
    }
}
