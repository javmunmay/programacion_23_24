package U7.ExamenU6U7_2324;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Artista artista1 = new Artista("Paco el grande", "flameco", "Español");
        Artista artista2 = new Artista("Lucia la Flamenquita", "flameco", "Español");
        Artista artista3 = new Artista("Lola lolita", "Reggaeton", "Español");
        Artista artista4 = new Artista("Maria la portugesa", "flameco", "Portuguesa");
        Artista artista5 = new Artista("Cantante misterioso", "pop", "Español");


        Caseta caseta1 = new Caseta("Caseta Centro", "Calle nosedonde",80);
        Caseta caseta2 = new Caseta("Caseta Amate", "Calle arribadonde",65);
        Caseta caseta3 = new Caseta("Caseta Prado", "Calle abajodonde",70);
        Caseta caseta4 = new Caseta("Caseta 234", "Calle niidea",120);
        Caseta caseta5 = new Caseta("Caseta 789", "Calle yosedonde",90);

        FeriaDeSevilla feria = new FeriaDeSevilla(); //Crear Feria


        feria.addActuacion(caseta1, artista1);
        feria.addActuacion(caseta2, artista2);
        feria.addActuacion(caseta3, artista3);
        feria.addActuacion(caseta4, artista4);
        feria.addActuacion(caseta5, artista5);

        //feria.getCaseta("Caseta Centro");




        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Añadir actuacion ");
            System.out.println("2. Lista artistas de x caseta ");
            System.out.println("3. Lista de casetas donde el artista ha actuado ");
            System.out.println("4. Informacion de la caseta ");
            System.out.println("5. Eliminar caseta ");
            System.out.println("6. Informacion artista ");
            System.out.println("7. Guardar Datos desde Archivo");
            System.out.println("8. Cargar Datos en Archivo");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.println("Añadir una actuación:");
                    System.out.println("---------------------");
                    System.out.println("Introduce el nombre de la caseta: ");
                    String nombreCaseta = scanner.nextLine();
                    System.out.println("Introduce el nombre del artista: ");
                    String nombreArtista = scanner.nextLine();
//                    Caseta Buscarcaseta = new Caseta(nombreCaseta);
//                    Artista Buscarartista = new Artista(nombreArtista);
//                    feria.addActuacion(Buscarcaseta,Buscarartista);

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Introduce el nombre de la Caseta: ");
                    nombreCaseta = scanner.nextLine();
                    feria.getCaseta(nombreCaseta);

                    break;
                case 5:
                    System.out.println("Proceso de eliminacion de caseta:");
                    System.out.println("---------------------------------");
                    System.out.println("Introduzca el nombre de la caseta a eliminar: ");
                     nombreCaseta = scanner.nextLine();

                    feria.removeCaseta(nombreCaseta);

                    break;
                case 6:
                    System.out.println("Introduce el nombre artistico del artista: ");
                    String nombreArtistico = scanner.nextLine();

                    //feria.getArtista(nombreArtistico);

                    break;
                case 7:
                    feria.guardarDatos("feriasevilla.dat");
                    break;
                case 8:
                    System.out.println("Recuerda tener datos guardados para poder cargarlos perfectamente:");
                    feria.cargarDatos("feriasevilla.dat");
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


