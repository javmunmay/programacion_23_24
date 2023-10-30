package U1.ExamenTarde;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a Carbonita Volando");

        // Solicitar al usuario que introduzca el peso de la figura en gramos
        System.out.print("Introduzca el peso de su figura en gramos: ");
        double peso = scanner.nextDouble();

        // Solicitar al usuario que introduzca el tipo de material
        System.out.print("Introduzca el tipo de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible): ");
        int tipoMaterial = scanner.nextInt();

        // Solicitar al usuario si quiere posprocesado
        System.out.print("¿Quiere posprocesado? (1=si, 2=no): ");
        int posprocesado = scanner.nextInt();

        // Solicitar al usuario si pertenece al programa de fidelización Enjuto3D Premium
        System.out.print("¿Pertenece a Enjuto3D Premium? (1=si, 2=no): ");
        int enjutoPremium = scanner.nextInt();

        // Calcular el coste total de la figura
        double precioPorGramo = 0.0;

        switch (tipoMaterial) {
            case 1: // ABS
                precioPorGramo = 0.2;
                break;
            case 2: // PLA
                precioPorGramo = 0.3;
                break;
            case 3: // Madera
                precioPorGramo = 0.5;
                break;
            case 4: // Flexible
                precioPorGramo = 0.7;
                break;
            default:
                System.out.println("Tipo de material no válido");
                System.exit(1);
        }

        double costeMaterial = peso * precioPorGramo;
        double costePosprocesado = (posprocesado == 1) ? 3.0 : 0.0;
        double costeEnvio = (enjutoPremium == 1) ? 0.0 : 2.0;

        double costeTotal = costeMaterial + costePosprocesado + costeEnvio;

        // Mostrar el coste total de la figura
        System.out.println("El coste total de la pieza es: " + costeTotal + " €");

        scanner.close();
    }
}
