package U7.Tarea3Map.ej1;

import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        // Crear HashMap para almacenar los nombres
        Map<Integer, String> nombresPorDni = new HashMap<>();

        // Agregar elementos al HashMap
        agregarNombrePorDni("46221877D", "Ejemplo1", nombresPorDni);
        agregarNombrePorDni("12345678A", "Ejemplo2", nombresPorDni);
        agregarNombrePorDni("98765432B", "Ejemplo3", nombresPorDni);

        // Mostrar todos los elementos del HashMap
        System.out.println("Elementos del HashMap:");
        for (Map.Entry<Integer, String> entry : nombresPorDni.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
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
