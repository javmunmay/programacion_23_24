package U7.Tarea3Map.ej3;

import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        // Crear HashMap para almacenar los nombres
        Map<Integer, String> nombresPorDni = new HashMap<>();

        // Agregar elementos al HashMap
        agregarNombrePorDni("46221877D", "Pedro Gonzalez Jimenez", nombresPorDni);
        agregarNombrePorDni("12345678A", "María García López", nombresPorDni);
        agregarNombrePorDni("98765432B", "Juan Martínez Sánchez", nombresPorDni);

        // Mostrar cada pareja clave-valor del HashMap
        for (Map.Entry<Integer, String> entry : nombresPorDni.entrySet()) {
            int clave = entry.getKey();
            String nombre = entry.getValue();
            System.out.println("La clave " + clave + " está asociada al nombre \"" + nombre + "\".");
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
