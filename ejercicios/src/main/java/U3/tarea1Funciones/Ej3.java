package U3.tarea1Funciones;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        //Realizar una función que calcule y muestre el área o el volumen π r² h de un cilindro, según se especifique.
        //Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen). Además, hemos
        //de pasarle a la función el radio de la base y la altura.


        calcularYMostrar(1, 5, 8); // Calcular y mostrar área con radio 5 y altura 8
        calcularYMostrar(2, 5, 8); // Calcular y mostrar volumen con radio 5 y altura 8
    }

    public static void calcularYMostrar(int opcion, double radio, double altura) {
        double resultado = 0;

        switch (opcion) {
            case 1:
                // Calcular área (π r² h)
                resultado = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("Área del cilindro: " + resultado);
                break;
            case 2:
                // Calcular volumen (π r² h)
                resultado = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("Volumen del cilindro: " + resultado);
                break;
            default:
                System.out.println("Opción no válida. Debe ser 1 para área o 2 para volumen.");
        }
    }
}
