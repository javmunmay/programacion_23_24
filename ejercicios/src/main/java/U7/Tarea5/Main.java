package U7.Tarea5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntroducirAspirantes introducirAspirantes = new IntroducirAspirantes();
        CalificacionPruebas calificacionPruebas = new CalificacionPruebas();
        Aprobados aprobados = new Aprobados();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Introducir datos de aspirantes");
            System.out.println("2. Calificar prueba");
            System.out.println("3. Aprobados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    introducirAspirantesMenu(introducirAspirantes, scanner);
                    break;
                case 2:
                    calificarPruebaMenu(calificacionPruebas);
                    break;
                case 3:
                    aprobadosMenu(aprobados);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

        System.out.println("¡Hasta luego!");
    }

    private static void introducirAspirantesMenu(IntroducirAspirantes introducirAspirantes, Scanner scanner) {
        boolean insertar = true;
        while (insertar) {
            System.out.print("Nombre del aspirante: ");
            String nombre = scanner.nextLine();
            System.out.print("DNI del aspirante: ");
            String dni = scanner.nextLine();
            System.out.print("Teléfono del aspirante: ");
            String telefono = scanner.nextLine();

            introducirAspirantes.insertaAspirante(nombre, dni, telefono);

            System.out.print("¿Desea insertar otro aspirante? (S/N): ");
            String respuesta = scanner.nextLine().toUpperCase();
            insertar = respuesta.equals("S");
        }

        introducirAspirantes.guardarFicheros();
    }

    private static void calificarPruebaMenu(CalificacionPruebas calificacionPruebas) {
        calificacionPruebas.leerIdsAspirantes();
        calificacionPruebas.guardarFichero();
    }

    private static void aprobadosMenu(Aprobados aprobados) {
        aprobados.leerFicheros();
        aprobados.generarInforme();
    }

}
