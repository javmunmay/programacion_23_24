package U7.PreparacionExamenU6U7;


import U7.U6U7_Entregable_2324.Atleta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creación de objetos
        Propietario propietario1 = new Propietario("Juan", "Pérez", 1234, "España");
        Propietario propietario2 = new Propietario("Ana", "Gómez", 5678, "Francia");
        Propietario propietario3 = new Propietario("Pedro", "López", 9012, "Italia");

        Perro perro1 = new Perro("Max", 3, 20.5, true, propietario1, "Pastor Alemán");
        Perro perro2 = new Perro("Bella", 2, 15.3, true, propietario2, "Golden Retriever");
        Perro perro3 = new Perro("Rocky", 4, 25.0, false, propietario1, "Pastor Alemán");
        Perro perro4 = new Perro("Luna", 1, 10.0, true, propietario3, "Yorkshire");
        Perro perro5 = new Perro("Duna", 5, 30.0, true, propietario2, "San Bernardo");

        Concurso concurso = new Concurso("Concurso Internacional de Perros", "París");

        concurso.addDog(perro1.getRaza(), perro1);
        concurso.addDog(perro2.getRaza(), perro2);
        concurso.addDog(perro3.getRaza(), perro3);
        concurso.addDog(perro4.getRaza(), perro4);
        concurso.addDog(perro5.getRaza(), perro5);

//        concurso.guardarPerros(); // Guardar los perros en el archivo
//
//        concurso.perrosPorPeso("Labrador"); // Mostrar perros de la raza Labrador ordenados por peso
//
//        concurso.cargarPerros(); // Cargar los perros desde el archivo
//
//        concurso.perrosPorEdad("Golden Retriever"); // Mostrar perros de la raza Golden Retriever ordenados por edad


        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Añadir Perro al Concurso");
            System.out.println("2. Descalificar Perro del Concurso");
            System.out.println("3. Mostrar Perros de un Dueño");
            System.out.println("4. Mostrar Perros por Peso (Orden Descendente)");
            System.out.println("5. Mostrar Perros por Edad (Orden Descendente)");
            System.out.println("6. Cargar Perros desde Archivo");
            System.out.println("7. Guardar Perros en Archivo");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.println("--- Añadir Perro al Concurso ---");
                    System.out.print("Nombre del Perro: ");
                    String nombrePerro = scanner.nextLine();
                    System.out.print("Edad del Perro: ");
                    int edadPerro = scanner.nextInt();
                    System.out.print("Peso del Perro: ");
                    double pesoPerro = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    System.out.print("¿Vacunas Completas? (true/false): ");
                    boolean vacunasCompletas = scanner.nextBoolean();
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    System.out.print("Nombre del Propietario: ");
                    String nombrePropietario = scanner.nextLine();
                    System.out.print("Apellidos del Propietario: ");
                    String apellidosPropietario = scanner.nextLine();
                    System.out.print("Número de Socio del Propietario: ");
                    int numSocioPropietario = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    System.out.print("País de Origen del Propietario: ");
                    String paisPropietario = scanner.nextLine();
                    System.out.print("Raza del Perro: ");
                    String razaPerro = scanner.nextLine();

                    Propietario propietario = new Propietario(nombrePropietario, apellidosPropietario, numSocioPropietario, paisPropietario);
                    Perro perro = new Perro(nombrePerro, edadPerro, pesoPerro, vacunasCompletas, propietario, razaPerro);
                    concurso.addDog(razaPerro, perro);

                    System.out.println("Perro añadido al concurso con éxito.");
                    break;
                case 2:
                    System.out.println("--- Descalificar Perro del Concurso ---");
                    System.out.print("Nombre del Perro a Descalificar: ");
                    String nombrePerroDescalificar = scanner.nextLine();
                    // Aquí podrías implementar la lógica para encontrar el perro por su nombre y luego descalificarlo
                    // Pero como no se ha implementado una búsqueda específica en esta versión, lo dejamos como ejemplo básico
                    // Solo se simula la descalificación mostrando un mensaje.
                    System.out.println("Perro descalificado del concurso.");
                    break;
                case 3:
                    System.out.println("--- Mostrar Perros de un Dueño ---");
                    System.out.print("Número de Socio del Propietario: ");
                    int numSocioPropietarioMostrar = scanner.nextInt();
                    concurso.ownerDogs(numSocioPropietarioMostrar);
                    break;
                case 4:
                    System.out.println("--- Mostrar Perros por Peso (Orden Descendente) ---");
                    System.out.print("Raza de los Perros a Mostrar: ");
                    String razaPerrosPeso = scanner.nextLine();
                    concurso.perrosPorPeso(razaPerrosPeso);
                    break;
                case 5:
                    System.out.println("--- Mostrar Perros por Edad (Orden Descendente) ---");
                    System.out.print("Raza de los Perros a Mostrar: ");
                    String razaPerrosEdad = scanner.nextLine();
                    concurso.perrosPorEdad(razaPerrosEdad);
                    break;
                case 6:
                    concurso.cargarPerros("perros.dat");
                    break;
                case 7:
                    concurso.guardarPerros("perros.dat");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }


}


