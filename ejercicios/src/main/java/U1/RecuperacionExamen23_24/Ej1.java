package U1.RecuperacionExamen23_24;

import java.util.Scanner;

public class Ej1 {

    //Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las tres notas que ha sacado el alumno en los tres primeros controles. Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media y la nota correspondiente. Atendiendo a esa media el alumno tendrá las siguientes notas:
    //
    //Suficiente si la media en mayor o igual que 5 y menor que 6.
    //Bien si la media es mayor o igual que 6 y menor que 7.
    //Notable si la media es mayor o igual que 7 y menor que 9.
    //Sobresaliente en culaquier otro caso.
    //En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se mantienela nota media anterior.
    //
    //Ejemplo 1:
    //
    //Nota del primer control: 7
    //Nota del segundo control: 10
    //Tu nota de Programación es 8.5 - Notable
    //Ejemplo 2:
    //
    //Nota del primer control: 6
    //Nota del segundo control: 3
    //¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
    //Tu nota de Programación es 5 - Suficiente
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota del primer control: ");
        int nota1 = sc.nextInt();
        System.out.println("Nota del segundo control: ");
        int nota2 = sc.nextInt();

        double media  = (double) (nota1 + nota2) /2;


        if (media<5){
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
            String recuperacion = sc.next();

             if (recuperacion.equals("apto")){
                media = 5;
            }



        }


        System.out.println();

        System.out.print("Tu nota de programación es: "+media);

        if (media <5){

            System.out.print(" - Suspenso");

        }else if (media <7) {
            System.out.print(" - Suficiente");

        }else if (media <8){
            System.out.print(" - Bien");
        }else if (media < 10){
            System.out.print(" - Notable");
        }else {
            System.out.print(" - Sobresaliente");
        }






    }





}
