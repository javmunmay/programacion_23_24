package U3.Array;

public class NumeroCuadradoCubo {




    public static void main(String[] args) {
        // Definir arrays
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        // Llenar el array "numero" con valores aleatorios entre 0 y 100
        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = cuadrado[i] * numero[i];
        }

        // Mostrar los tres arrays en columnas
        System.out.println("Número | Cuadrado | Cubo");
        System.out.println("--------------------------");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%6d | %8d | %6d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}



