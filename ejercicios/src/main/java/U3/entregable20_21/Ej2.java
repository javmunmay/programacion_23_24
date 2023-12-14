package U3.entregable20_21;

public class Ej2 {


    //Crea una función con la siguiente cabecera:
    //
    //public String convierteEnMorse(int n)
    //Esta función convierte el número n al sistema Morse y lo devuelve en una cadena de caracteres. Por ejemplo, el número 213 es:
    //
    //. . _ _ _ . _ _ _ _ . . . _ _
    //en Morse. Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe mostrar
    //nada por pantalla, solo se debe usar print desde el programa principal.


    public static void escribirLongCircunf(int radio) {
        double longCircunf = 2 * 3.1415926535 * radio;
        double longConDosDecimales =
                Math.round(longCircunf * 100) / 100.0;
        System.out.println("La longitud de la circunferencia " +
                "de radio " + radio + " es " + longConDosDecimales);
    }

    public static void main(String args[]) {
        escribirLongCircunf(4);
        escribirLongCircunf(6);
        escribirLongCircunf(8);
        escribirLongCircunf(10);
        escribirLongCircunf(111);
    }
}
