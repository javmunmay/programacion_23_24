package U3.examenRecuperacionU3;

public class Ej1 {
    /*
    Implementa la función aleatorioDeArray con la cabecera que se muestra a continuación:

    public static int aleatorioDeArray(int[] a)
    Esta función debe devolver un número del array escogido al azar entre todos los disponibles.

    Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a) podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorioDeArray(b) podría devolver el 52 o el 37.

    Utiliza la función en un programa de prueba.

     */

    public static void main(String[] args) {

        int[] a = {111, 222, 333, 444};

        System.out.println("Array original:");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println("\n\nArray resultado:");
        int resultado = aleatorioDeArray(a);
        System.out.println(resultado);

        System.out.println();
    }

    public static int aleatorioDeArray(int[] a){

        int resultado =0;

        //(int) (Math.random() * 5) + 1 Elige un elemento dentro de
        //la array de forma aleatoria desde la posicion 0 a la 3 (los 4 elementos
        // dentro de la array)

        for (int i = 0; i < (int) (Math.random() * 5) + 1; i++) {
            resultado = a[i];
        }

        return resultado;
    }

}



