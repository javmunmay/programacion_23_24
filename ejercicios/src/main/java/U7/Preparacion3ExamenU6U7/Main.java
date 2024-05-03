package U7.Preparacion3ExamenU6U7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SAE sae = new SAE(); // Crear una instancia del sistema de gestión de empleo

        // Añadir ofertas
        sae.addOferta(new Oferta(1, "Oferta 1"));
        sae.addOferta(new Oferta(2, "Oferta 2"));
        sae.addOferta(new Oferta(3, "Oferta 3"));
        sae.addOferta(new Oferta(4, "Oferta 4"));
        sae.addOferta(new Oferta(5, "Oferta 5"));

        // Añadir trabajadores a ofertas
        sae.addTrabajador(1, new Trabajador("12345678A", "Juan", "Pérez", 25, "Ingeniería"));
        sae.addTrabajador(1, new Trabajador("87654321B", "María", "López", 30, "Administración"));
        sae.addTrabajador(2, new Trabajador("11111111C", "Ana", "González", 22, "Comunicación"));
        sae.addTrabajador(4, new Trabajador("22222222D", "Pedro", "Martínez", 28, "Derecho"));
        sae.addTrabajador(4, new Trabajador("33333333E", "Laura", "Ruiz", 35, "Marketing"));
        sae.addTrabajador(2, new Trabajador("44444444F", "Javier", "García", 40, "Educación"));

        // Mostrar resultados
        sae.mostrarOfertas();

        Scanner scanner = new Scanner(System.in);


        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Dar de alta una oferta");
            System.out.println("2. Dar de alta a un trabajador en una oferta");
            System.out.println("3. Dar de baja a un trabajador en una oferta");
            System.out.println("4. Mostrar trabajadores de una oferta");
            System.out.println("5. Mostrar trabajadores de una oferta ordenados por edad");
            System.out.println("6. Mostrar cantidad de ofertas en las que se ha inscrito un trabajador");
            System.out.println("7. Mostrar ofertas de trabajo ordenadas por número de trabajadores solicitantes");
            System.out.println("8. Guardar datos");
            System.out.println("9. Cargar datos");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el codigo de la oferta: ");
                    int codigoOferta = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Descripcion de la oferta:");
                    String descripcionOferta = scanner.nextLine();
                    sae.addOferta(new Oferta(codigoOferta, descripcionOferta));
                    break;
                case 2:
                    System.out.println("Introduce el dni del nuevo trabajador: ");
                    String dniTrabajador = scanner.nextLine();

                    System.out.println("Nombre del Trabajador:");
                    String nombreTrabajador = scanner.nextLine();

                    System.out.println("Apellidos del Trabajador:");
                    String apellidosTrabajador = scanner.nextLine();

                    System.out.println("Edad del Trabajador:");
                    int edadTrabajador = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Formacion del Trabajador:");
                    String formacionAcademicaTrabajador = scanner.nextLine();

                    Trabajador nuevoTrabajador = new Trabajador(dniTrabajador, nombreTrabajador, apellidosTrabajador, edadTrabajador, formacionAcademicaTrabajador);

                    System.out.println("Introduce el codigo de la oferta de trabajo para este trabajador: ");
                    codigoOferta = scanner.nextInt();
                    scanner.nextLine();

                    sae.addTrabajador(codigoOferta, nuevoTrabajador);


                    break;
                case 3:
                    System.out.println("Introduzca el codigo de la oferta donde este el trabajador");
                    codigoOferta = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduzca el DNI del trabajador que quiera dar de baja:");
                    dniTrabajador = scanner.nextLine();

                    Trabajador bajaTrabajador = new Trabajador(dniTrabajador);

                    boolean booleanBaja = sae.removeTrabajador(codigoOferta, bajaTrabajador);
                    if (booleanBaja) {
                        System.out.println("Trabajador dado de baja correctamente");
                    } else {
                        System.out.println("El trabajador no estaba escrito o no se encontro");
                    }
                    break;
                case 4:
                    // Implementar la lógica para mostrar trabajadores de una oferta
                    System.out.println("Introduzca el codigo de la oferta: ");
                    codigoOferta = scanner.nextInt();
                    scanner.nextLine();
                    sae.mostrarTrabajadores(codigoOferta);
                    break;
                case 5:
                    // Implementar la lógica para mostrar trabajadores de una oferta ordenados por edad
                    System.out.println("Introduzca el codigo de la oferta: ");
                    codigoOferta = scanner.nextInt();
                    scanner.nextLine();
                    sae.mostrarTrabajadoresXEdad(codigoOferta);
                    break;
                case 6:
                    // Implementar la lógica para mostrar cantidad de ofertas en las que se ha inscrito un trabajador
                    System.out.println("Introduzca el DNI del trabajador:");
                    dniTrabajador = scanner.nextLine();
                    scanner.nextLine();

                    sae.cantidadOfertas(dniTrabajador);
                    break;
                case 7:
                    // Implementar la lógica para mostrar ofertas de trabajo ordenadas por número de trabajadores solicitantes
                    sae.mostrarOfertas();
                    break;
                case 8:
                    sae.guardarDatos(); // Guardar los datos en un archivo
                    System.out.println("Datos guardados en sae.dat");
                    break;
                case 9:
                    sae.cargarDatos(); // Cargar los datos desde un archivo
                    System.out.println("Datos cargados desde sae.dat");
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close(); // Cerrar el Scanner al salir del programa

    }
}
