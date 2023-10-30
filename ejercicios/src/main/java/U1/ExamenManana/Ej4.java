package U1.ExamenManana;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca las dimensiones de la bandera
        System.out.print("Introduce el alto de la bandera en centímetros: ");
        double alto = scanner.nextDouble();

        System.out.print("Introduce el ancho de la bandera en centímetros: ");
        double ancho = scanner.nextDouble();

        // Calcular el área de la bandera en centímetros cuadrados
        double area = alto * ancho;

        // Precio base por centímetro cuadrado
        double precioBase = area * 0.01;

        // Verificar si el usuario quiere un escudo bordado
        System.out.print("¿Deseas un escudo bordado? (Sí/No): ");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String respuestaEscudo = scanner.nextLine();

        // Incremento de precio si hay escudo bordado
        double precioEscudo = 0;
        if (respuestaEscudo.equals("Sí")) {
            precioEscudo = 2.50;
        }


        // Calcular el precio total sin gastos de envío
        double precioTotal = precioBase + precioEscudo;

        // Gastos de envío
        double gastosEnvio = 3.25;

        // Calcular el precio final con gastos de envío
        double precioFinal = precioTotal + gastosEnvio;

        // Mostrar el resumen del pedido
        System.out.println("\nResumen del pedido:");
        System.out.println("Area de la bandera: " + area + " cm²");
        System.out.println("Precio base: " + precioBase + " €");
        System.out.println("Precio escudo bordado: " + precioEscudo + " €");
        System.out.println("Precio total: " + precioTotal + " €");
        System.out.println("Gastos de envío: " + gastosEnvio + " €");
        System.out.println("Precio final: " + precioFinal + " €");

        scanner.close();
    }
}
