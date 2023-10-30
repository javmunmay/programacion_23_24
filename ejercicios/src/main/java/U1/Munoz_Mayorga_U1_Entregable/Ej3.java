package U1;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        //Realiza un programa que calcule el precio de unas entradas de cine en función del número de personas y del día de la semana.
        // El precio base de una entrada son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los jueves son el
        // día de la pareja, por lo que la entrada para dos cuesta 11 euros.
        //
        //Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un grupo de 6 personas compran entradas, el precio total
        // sería de 33 euros ya que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más 1 individual
        // que son 41 euros (33 + 8).


        Scanner teclado = new Scanner(System.in);

        double precioNormal = 8.0;
        double descuento = 0.0;

        System.out.println("Venta de entradas CineCampa");
        System.out.println("Número de entradas: ");
        int numeroPersonas = teclado.nextInt();

        System.out.println("Día de la Semana: (1: Lunes, 2: Martes, 3: Miércoles, 4: Jueves, 5: Viernes, 6: Sábado, 7: Domingo)");
        int numeroSemana = teclado.nextInt();

        double precioTotal;
        double precioTemporada;


        switch (numeroSemana){

            case 3:
                precioTotal = (numeroPersonas) * (precioNormal - 3.0);
                //Los miercoles se descuenta 3€

                precioTemporada= 5.0;
                break;

            case 4:
                int pareja = numeroPersonas / 2;

                int individual = numeroPersonas % 2;

                precioTotal = (pareja * 11.0)+(individual * precioNormal);

                precioTemporada = 11;

                break;

            default:
                precioTotal = precioNormal * numeroPersonas;

                precioTemporada = 8.0;

            break;
        }

        System.out.println("¿Tienes tarjeta CineCampa? (s/n):");
        String tieneTarjeta = teclado.next();




        System.out.println("Aquí tiene sus entradas. Gracias por su compra");

        if (numeroPersonas==2){
            System.out.println("Entradas de parejas: "+numeroPersonas);

        }else{

            System.out.println("Entradas individuales: "+ numeroPersonas);

        }



        if (precioTemporada==11){

            System.out.println("Precio por entrada de pareja: "+ precioTemporada+ "€");

        }else {

            System.out.println("Precio por entrada individual: "+ precioTemporada +"€");

        }



        System.out.println("Total: "+ precioTotal+  " €");

        if (tieneTarjeta.equals("s")) {
            descuento = precioTotal * 0.1;
            precioTotal -= descuento;




        }

        System.out.println("Descuento: "+ descuento + "€");


        System.out.println("A pagar: " + precioTotal + "€");
    }
}






