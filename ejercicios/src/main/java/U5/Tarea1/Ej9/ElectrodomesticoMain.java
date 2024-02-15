package U5.Tarea1.Ej9;


import java.util.Arrays;

public class ElectrodomesticoMain {
    public static void main(String[] args) {
        // Crear un array de Electrodomesticos de 10 posiciones
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        // Asignar a cada posición un objeto de las clases anteriores con los valores que desees
        electrodomesticos[0] = new Lavadora(200, 50);
        electrodomesticos[1] = new Lavadora(300, 60);
        electrodomesticos[2] = new Television(50, 15);
        electrodomesticos[3] = new Television(100, 25);
        electrodomesticos[4] = new Electrodomestico(150, "negro", 'B', 20);
        electrodomesticos[5] = new Electrodomestico(250, "azul", 'C', 30);
        electrodomesticos[6] = new Electrodomestico(350, "rojo", 'D', 40);
        electrodomesticos[7] = new Lavadora(400, 70);
        electrodomesticos[8] = new Television(60, 40);
        electrodomesticos[9] = new Lavadora(500, 80);

        // Mostrar el contenido del array
        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println(electrodomestico.toString());
        }

        // Crear un array de objetos Lavadora y ordenarlo por carga
        Lavadora[] lavadoras = {new Lavadora(200, 50), new Lavadora(300, 60), new Lavadora(400, 70)};
        Arrays.sort(lavadoras, (lavadora1, lavadora2) -> Double.compare(lavadora1.getCarga(), lavadora2.getCarga()));

        // Crear otro array y ordenarlo por precioFinal
        Electrodomestico[] electrodomesticosOrdenados = Arrays.copyOf(electrodomesticos, electrodomesticos.length);
        Arrays.sort(electrodomesticosOrdenados, (electro1, electro2) -> Double.compare(electro1.getPrecioFinal(), electro2.getPrecioFinal()));

        // Mostrar el contenido del array de electrodomesticos ordenado por precioFinal
        System.out.println("\nElectrodomesticos ordenados por precio final:");
        for (Electrodomestico electrodomestico : electrodomesticosOrdenados) {
            System.out.println(electrodomestico.toString());
        }
    }
}
