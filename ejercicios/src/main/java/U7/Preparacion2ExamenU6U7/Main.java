package U7.Preparacion2ExamenU6U7;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coronavirus coronavirus = new Coronavirus("COVID-19", "Wuhan");

        // Crear médicos
        Medico medico1 = new Medico("Juan", "García", 1234, "Hospital A");
        Medico medico2 = new Medico("María", "López", 5678, "Hospital B");
        Medico medico3 = new Medico("Pedro", "Martínez", 91011, "Hospital C");

        // Crear pacientes

        Paciente paciente1 = new Paciente("Ana", 30, 65.5, true, medico1, 'A');
        Paciente paciente2 = new Paciente("Carlos", 45, 80.2, false, medico2, 'B');
        Paciente paciente3 = new Paciente("Elena", 25, 55.8, true, medico1, 'A');


        // Agregar pacientes al coronavirus
        coronavirus.addPaciente('A', paciente1);
        coronavirus.addPaciente('B', paciente2);
        coronavirus.addPaciente('A', paciente3);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir paciente");
            System.out.println("2. Dar de alta paciente");
            System.out.println("3. Mostrar pacientes de un médico");
            System.out.println("4. Mostrar pacientes por peso");
            System.out.println("5. Mostrar pacientes por edad");
            System.out.println("6. Cargar pacientes desde fichero");
            System.out.println("7. Guardar pacientes en fichero");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el nombre del paciente: ");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();
                    System.out.print("Introduzca la edad del paciente: ");
                    int edad = scanner.nextInt();
                    System.out.print("Introduzca el peso del paciente: ");
                    double peso = scanner.nextDouble();
                    System.out.print("¿Tiene todas las vacunas requeridas? (true/false): ");
                    boolean vacunas = scanner.nextBoolean();
                    System.out.print("Introduzca el nombre del médico: ");
                    scanner.nextLine();
                    String medicoNombre = scanner.nextLine();
                    System.out.print("Introduzca el número de colegiado del médico: ");
                    int medicoNumeroColegiado = scanner.nextInt();
                    System.out.print("Introduzca la cepa del virus: ");
                    char cepa = scanner.next().charAt(0);
                    Medico medico = new Medico(medicoNombre, "", medicoNumeroColegiado, "");
                    Paciente newPaciente = new Paciente(nombre, edad, peso, vacunas, medico, cepa);
                    coronavirus.addPaciente(cepa, newPaciente);
                    break;
                case 2:
                    System.out.print("Introduzca el nombre del paciente a dar de alta: ");
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    String nombreDarAlta = scanner.nextLine();
                    System.out.print("Introduzca la edad del paciente a dar de alta: ");
                    int edadDarAlta = scanner.nextInt();
                    System.out.print("Introduzca el peso del paciente a dar de alta: ");
                    double pesoDarAlta = scanner.nextDouble();
                    System.out.print("Vacunas (true o false): ");
                    boolean vacunasDarAlta = scanner.nextBoolean();
                    System.out.print("Indique el nombre del médico: ");
                    String nombreMedico = scanner.next();
                    System.out.print("Indique el número de colegiado del médico: ");
                    int numColegiado = scanner.nextInt();
                    System.out.print("Indique la cepa: ");
                    char cepaDarAlta = scanner.next().charAt(0);

                    Medico medicoPaciente = null;
                    switch (numColegiado) {
                        case 1234:
                            medicoPaciente = medico1;
                            break;
                        case 5678:
                            medicoPaciente = medico2;
                            break;
                        case 91011:
                            medicoPaciente = medico3;
                            break;
                        default:
                            System.out.println("Médico no encontrado.");
                            break;
                    }

                    if (medicoPaciente != null) {
                        Paciente pacienteDarAlta = new Paciente(nombreDarAlta, edadDarAlta, pesoDarAlta, vacunasDarAlta, medicoPaciente, cepaDarAlta);
                        coronavirus.darDeAltaPaciente(pacienteDarAlta);
                    }
                    break;
                case 3:
                    System.out.print("Introduzca el número de colegiado del médico: ");
                    int medicoColegiado = scanner.nextInt();
                    coronavirus.pacientesDeUnDoctor(medicoColegiado);
                    break;
                case 4:
                    System.out.print("Introduzca la cepa del virus: ");
                    cepa = scanner.next().charAt(0);
                    coronavirus.pacientesporPeso(cepa);
                    break;
                case 5:
                    System.out.print("Introduzca la cepa del virus: ");
                    cepa = scanner.next().charAt(0);
                    coronavirus.pacientesporEdad(cepa);
                    break;
                case 6:
                    coronavirus.cargarPacientes("pacientes.dat");
                    break;
                case 7:
                    coronavirus.guardarPacientes("pacientes.dat");
                    break;
            }
        } while (opcion != 8);

        scanner.close();
    }
}

