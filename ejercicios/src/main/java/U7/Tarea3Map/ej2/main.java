package U7.Tarea3Map.ej2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Crear HashMap para almacenar los nombres
        Map<Integer, String> nombresPorDni = new HashMap<>();

        // Agregar elementos al HashMap
        agregarNombrePorDni("46221877D", "Ejemplo1", nombresPorDni);
        agregarNombrePorDni("12345678A", "Ejemplo2", nombresPorDni);
        agregarNombrePorDni("98765432B", "Ejemplo3", nombresPorDni);

        // Pedir al usuario un DNI y mostrar el nombre asociado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un DNI para buscar el nombre asociado: ");
        String dni = scanner.nextLine();
        scanner.close();

        int clave = calcularSumaDigitos(dni);
        String nombre = nombresPorDni.get(clave);

        if (nombre != null) {
            System.out.println("El nombre asociado al DNI " + dni + " es: " + nombre);
        } else {
            System.out.println("No se encontró ningún nombre asociado al DNI ingresado.");
        }
    }

    public static void agregarNombrePorDni(String dni, String nombre, Map<Integer, String> map) {
        int sumaDigitos = calcularSumaDigitos(dni);
        map.put(sumaDigitos, nombre);
    }

    public static int calcularSumaDigitos(String dni) {
        int suma = 0;
        for (int i = 0; i < dni.length() - 1; i++) {
            char c = dni.charAt(i);
            if (Character.isDigit(c)) {
                suma += Character.getNumericValue(c);
            }
        }
        return suma;
    }

}
