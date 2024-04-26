package U7.U6U7_Entregable_2324;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        //Datos

        // Crear atletas
        Atleta atleta1 = new Atleta("Juan", "España", "SENIOR");
        Atleta atleta2 = new Atleta("María", "Italia", "JUNIOR");
        Atleta atleta3 = new Atleta("Pedro", "España", "VETERANO");
        Atleta atleta4 = new Atleta("Ana", "Colombia", "SENIOR");
        Atleta atleta5 = new Atleta("Luis", "Italia", "JUNIOR");
        Atleta atleta6 = new Atleta("Carlos", "Francia", "VETERANO");
        Atleta atleta7 = new Atleta("Laura", "Francia", "SENIOR");
        Atleta atleta8 = new Atleta("Fernando", "Uruguay", "JUNIOR");
        Atleta atleta9 = new Atleta("Patricia", "Paraguay", "VETERANO");
        Atleta atleta10 = new Atleta("Roberto", "España", "SENIOR");
        Atleta atleta11 = new Atleta("Sofía", "Ecuador", "JUNIOR");
        Atleta atleta12 = new Atleta("Jorge", "Italia", "VETERANO");
        Atleta atleta13 = new Atleta("Lucía", "Panamá", "SENIOR");
        Atleta atleta14 = new Atleta("Miguel", "Costa Rica", "JUNIOR");
        Atleta atleta15 = new Atleta("Daniela", "España", "VETERANO");

        // Crear maratón
        Maraton maraton = new Maraton();
//        maraton.cargarAtletas("maraton.dat");


        // Inscribir atletas
        maraton.inscribirAtleta(atleta1);
        maraton.inscribirAtleta(atleta2);
        maraton.inscribirAtleta(atleta3);
        maraton.inscribirAtleta(atleta4);
        maraton.inscribirAtleta(atleta5);
        maraton.inscribirAtleta(atleta6);
        maraton.inscribirAtleta(atleta7);
        maraton.inscribirAtleta(atleta8);
        maraton.inscribirAtleta(atleta9);
        maraton.inscribirAtleta(atleta10);
        maraton.inscribirAtleta(atleta11);
        maraton.inscribirAtleta(atleta12);
        maraton.inscribirAtleta(atleta13);
        maraton.inscribirAtleta(atleta14);
        maraton.inscribirAtleta(atleta15);

        // Guardar atletas
//        maraton.guardarAtletas("maraton.dat");

        // Mostrar lista de finishers
//        maraton.mostrarListaFinishers();

        // Mostrar lista de categoría
//        maraton.mostrarListaCategoria("SENIOR");

        // Participantes por país
//        System.out.println("Participantes de España: " + maraton.participantesPorPais("España"));




        //Menu

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Cargar Atletas");
            System.out.println("2. Guardar Atletas");
            System.out.println("3. Inscribir Atleta");
            System.out.println("4. Guardar Tiempo");
            System.out.println("5. Borrar Atleta");
            System.out.println("6. Mostrar Lista Finishers");
            System.out.println("7. Mostrar Lista Categoría");
            System.out.println("8. Participantes Por País");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    maraton.cargarAtletas("maraton.dat");
                    break;
                case 2:
                    // Guardar Atletas
                    maraton.guardarAtletas("maraton.dat");
                    break;
                case 3:
                    System.out.println("Nuevo Atleta:");
                    System.out.print("Nombre: ");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();
                    System.out.print("País: ");
                    String pais = scanner.nextLine();
                    System.out.print("Categoría (SENIOR, JUNIOR, VETERANO): ");
                    String categoria = scanner.nextLine();
                    maraton.inscribirAtleta(new Atleta(nombre, pais, categoria));
                    break;
                case 4:
                    System.out.print("Dorsal: ");
                    int dorsal = scanner.nextInt();
                    System.out.print("Tiempo: ");
                    int tiempo = scanner.nextInt();
                    maraton.guardarTiempo(dorsal, tiempo);
                    break;
                case 5:
                    System.out.print("Dorsal: ");
                    dorsal = scanner.nextInt();
                    maraton.borrarAtleta(dorsal);
                    break;
                case 6:
                    maraton.mostrarListaFinishers();
                    break;
                case 7:
                    scanner.nextLine(); // Consumir la línea en blanco
                    System.out.print("Categoria: ");
                    categoria = scanner.nextLine();
                    maraton.mostrarListaCategoria(categoria);
                    break;
                case 8:
                    scanner.nextLine(); // Consumir la línea en blanco
                    System.out.print("Pais: ");
                    pais = scanner.nextLine();
                    System.out.println("Número de participantes de " + pais + ": " + maraton.participantesPorPais(pais));
                    break;
            }
        } while (opcion != 9);

        scanner.close();
    }

}
