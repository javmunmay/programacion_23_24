package U7.Entregable2021Tarde;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de uso
        Unidad unidadA = new Unidad("4ºA");
        Unidad unidadB = new Unidad("3ºB");

        Instituto instituto = new Instituto();

        instituto.addUnidad(unidadA);
        instituto.addUnidad(unidadB);

        Alumno alumno1 = new Alumno("Juan", "Pérez", "12345678A", unidadA);
        Alumno alumno2 = new Alumno("María", "López", "87654321B", unidadA);
        Alumno alumno3 = new Alumno("Javier", "Munoz", "65454545454", unidadB);
        Alumno alumno4 = new Alumno("Clara", "Breuer", "1212121254", unidadB);
        unidadA.agregarAlumno(alumno1);
        unidadA.agregarAlumno(alumno2);
        unidadB.agregarAlumno(alumno3);
        unidadB.agregarAlumno(alumno4);


        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Mostrar todos los Alumnos Ordenados");
            System.out.println("2. Obtener Unidad Alumno");
            System.out.println("3. Mostrar los Alumnos de la Unidad");
            System.out.println("4. Añadir Alumnos a la Unidad");
            System.out.println("5. Cargar Alumnos (alumnos.dat)");
            System.out.println("6. Guardar Alumnos (alumnos.dat)");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    instituto.mostrarTodosAlumnosOrdenados();
                    break;
                case 2:
                    System.out.print("Ingrese el ID del alumno: ");
                    int idAlumno = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    Unidad unidadAlumno = instituto.obtenerUnidadAlumno(idAlumno);
                    if (unidadAlumno != null) {
                        System.out.println("El alumno está en la unidad: " + unidadAlumno.getNombreUnidad());
                    } else {
                        System.out.println("No se encontró al alumno.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la unidad: ");
                    String nombreUnidad = scanner.nextLine();
                    instituto.mostrarAlumnosUnidad(nombreUnidad);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese los apellidos del alumno: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Ingrese el DNI del alumno: ");
                    String dni = scanner.nextLine();
                    System.out.print("Ingrese el nombre de la unidad: ");
                    String nombreUnidadNuevoAlumno = scanner.nextLine();
                    Unidad unidadNuevaAlumno = new Unidad(nombreUnidadNuevoAlumno);
                    Alumno nuevoAlumno = new Alumno(nombre, apellidos, dni, unidadNuevaAlumno);
                    instituto.addAlumnoUnidad(nuevoAlumno, nombreUnidadNuevoAlumno);
                    break;
                case 5:
                    instituto.cargarAlumnos();
                    break;
                case 6:
                    instituto.guardarAlumnos();
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

        System.out.println("¡Hasta luego!");
    }


}





