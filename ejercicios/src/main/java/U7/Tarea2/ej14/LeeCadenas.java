package U7.Tarea2.ej14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeeCadenas {

    public static void main(String[] args) {
        List<Character> caracteres = leeCadena();
        System.out.println("Lista de caracteres: " + caracteres);
    }

    public static List<Character> leeCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String input = scanner.nextLine();
        scanner.close();

        List<Character> listaCaracteres = new ArrayList<>();
        for (char c : input.toCharArray()) {
            listaCaracteres.add(c);
        }
        return listaCaracteres;
    }

}
