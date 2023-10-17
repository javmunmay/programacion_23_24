package U1.tarea8a;

public class ejercicio11 {
    public static void main(String[] args) {
        //Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10


        int num = 0;
        int resultado;

        for (num = 1; num <= 10; num++) {


            System.out.println("TABLA DE MULTIPLICAR DEL " + num);

            resultado = num;
            System.out.println(num + " * 1 = " + resultado);

            resultado = num * 2;
            System.out.println(num + " * 2 = " + resultado);

            resultado = num * 3;
            System.out.println(num + " * 3 = " + resultado);

            resultado = num * 4;
            System.out.println(num + " * 4 = " + resultado);

            resultado = num * 5;
            System.out.println(num + " * 5 = " + resultado);

            resultado = num * 6;
            System.out.println(num + " * 6 = " + resultado);

            resultado = num * 7;
            System.out.println(num + " * 7 = " + resultado);

            resultado = num * 8;
            System.out.println(num + " * 8 = " + resultado);

            resultado = num * 9;
            System.out.println(num + " * 9 = " + resultado);

            resultado = num * 10;
            System.out.println(num + " * 10 = " + resultado);


        }
        while (true) ;


    }
}
