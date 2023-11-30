package U3.tarea1Funciones;


public class Ej3 {

    public static void main(String[] args) {

        //Realizar una función que calcule y muestre el área o el volumen π r² h de un cilindro, según se especifique.
        //Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen). Además, hemos
        //de pasarle a la función el radio de la base y la altura.


        calcularYMostrar(1, 5, 8); // Calcular y mostrar área con radio 5 y altura 8
        calcularYMostrar(2, 5, 8); // Calcular y mostrar volumen con radio 5 y altura 8
    }

    public static void calcularYMostrar(int opcion, double radio, double altura) {
        double resultado;

        switch (opcion) {
            case 1:
                // Calcular área de su superficie es 2π r h + 2π r².
                resultado = 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
                System.out.println("Area del cilindro: " + resultado);
                break;
            case 2:
                // El volumen de un cilindro es π r² h
                resultado = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("Volumen del cilindro: " + resultado);
                break;
            default:
                System.out.println("Opcion no valida. Debe ser 1 para area o 2 para volumen.");
        }
    }
}
