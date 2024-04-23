package U7.Tarea4;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Empleado> empleadosMap = new HashMap<>();

        // Cargar datos desde archivo binario o insertar desde consola
        cargarDatos(scanner, empleadosMap);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n1. Visualizar listado");
            System.out.println("2. Borrar empleado/s");
            System.out.println("3. Visualizar empleado");
            System.out.println("4. Modificar empleado");
            System.out.println("5. Insertar empleado/s");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    visualizarListado(empleadosMap);
                    break;
                case 2:
                    borrarEmpleado(scanner, empleadosMap);
                    break;
                case 3:
                    visualizarEmpleado(scanner, empleadosMap);
                    break;
                case 4:
                    modificarEmpleado(scanner, empleadosMap);
                    break;
                case 5:
                    insertarEmpleado(scanner, empleadosMap);
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

        // Guardar datos en archivo binario al salir
        guardarDatos(empleadosMap);
        System.out.println("Programa finalizado. Datos guardados.");
    }

    // Método para cargar datos desde archivo binario o insertar desde consola
    private static void cargarDatos(Scanner scanner, Map<String, Empleado> empleadosMap) {
        System.out.print("¿Desea cargar datos desde un fichero binario? (S/N): ");
        String opcion = scanner.nextLine().toUpperCase();
        if (opcion.equals("S")) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("empleados.dat"))) {
                empleadosMap.putAll((Map<String, Empleado>) inputStream.readObject());
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al cargar los datos del archivo.");
            }
        } else {
            insertarDesdeConsola(scanner, empleadosMap);
        }
    }

    // Método para insertar datos de empleados desde consola
    private static void insertarDesdeConsola(Scanner scanner, Map<String, Empleado> empleadosMap) {
        boolean insertar = true;
        while (insertar) {
            System.out.print("Ingrese nombre del empleado: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese DNI del empleado: ");
            String dni = scanner.nextLine();
            System.out.print("Ingrese edad del empleado: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.print("Ingrese estatura del empleado: ");
            double estatura = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.print("Ingrese sueldo del empleado: ");
            double sueldo = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer de entrada

            Empleado empleado = new Empleado(nombre, dni, edad, estatura, sueldo);
            empleadosMap.put(dni, empleado);

            System.out.print("¿Desea insertar otro empleado? (S/N): ");
            String respuesta = scanner.nextLine().toUpperCase();
            insertar = respuesta.equals("S");
        }
    }

    // Método para visualizar el listado de empleados
    private static void visualizarListado(Map<String, Empleado> empleadosMap) {
        System.out.println("\nListado de empleados:");
        empleadosMap.forEach((dni, empleado) -> System.out.println(empleado));
    }

    // Método para borrar empleado/s
    private static void borrarEmpleado(Scanner scanner, Map<String, Empleado> empleadosMap) {
        boolean borrar = true;
        while (borrar) {
            System.out.print("Ingrese el DNI del empleado a borrar: ");
            String dniBorrar = scanner.nextLine();
            Empleado empleadoBorrado = empleadosMap.remove(dniBorrar);
            if (empleadoBorrado != null) {
                System.out.println("Empleado borrado: " + empleadoBorrado);
            } else {
                System.out.println("No se encontró ningún empleado con ese DNI.");
            }

            System.out.print("¿Desea borrar otro empleado? (S/N): ");
            String respuesta = scanner.nextLine().toUpperCase();
            borrar = respuesta.equals("S");
        }
    }

    // Método para visualizar un empleado por su DNI
    private static void visualizarEmpleado(Scanner scanner, Map<String, Empleado> empleadosMap) {
        System.out.print("Ingrese el DNI del empleado a visualizar: ");
        String dniVisualizar = scanner.nextLine();
        Empleado empleado = empleadosMap.get(dniVisualizar);
        if (empleado != null) {
            System.out.println("Datos del empleado:");
            System.out.println(empleado);
        } else {
            System.out.println("No se encontró ningún empleado con ese DNI.");
        }
    }

    // Método para modificar datos de un empleado por su DNI
    private static void modificarEmpleado(Scanner scanner, Map<String, Empleado> empleadosMap) {
        System.out.print("Ingrese el DNI del empleado a modificar: ");
        String dniModificar = scanner.nextLine();
        Empleado empleado = empleadosMap.get(dniModificar);
        if (empleado != null) {
            System.out.println("Datos actuales del empleado:");
            System.out.println(empleado);

            // Pedir nuevos datos para modificar
            System.out.print("Ingrese nombre del empleado: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese edad del empleado: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.print("Ingrese estatura del empleado: ");
            double estatura = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.print("Ingrese sueldo del empleado: ");
            double sueldo = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer de entrada

            // Actualizar los datos del empleado
            empleado.nombre = nombre;
            empleado.edad = edad;
            empleado.estatura = estatura;
            empleado.sueldo = sueldo;

            System.out.println("Empleado modificado correctamente.");
        } else {
            System.out.println("No se encontró ningún empleado con ese DNI.");
        }
    }

    // Método para insertar nuevo/s empleado/s
    private static void insertarEmpleado(Scanner scanner, Map<String, Empleado> empleadosMap) {
        insertarDesdeConsola(scanner, empleadosMap);
    }

    // Método para guardar los datos en un archivo binario
    private static void guardarDatos(Map<String, Empleado> empleadosMap) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("empleados.dat"))) {
            outputStream.writeObject(empleadosMap);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en el archivo.");
        }
    }
}


