package U1.tarea5b;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        //Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso.
        // Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida.
        // Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
        // en las diferentes asignaturas del curso.


        Scanner teclado = new Scanner(System.in);

        System.out.println(" Cuestionario tipo test ");
        System.out.println(" Cada pregunta acertada sumará 1 punto. ");
        System.out.println(" IMPORTANTE: ESCRIBIR RESPUESTAS EN NUMEROS Ej: 2 ");
        int puntos = 0;


        //#1
        System.out.println("Pregunta 1: (Lenguaje de Marca) ¿Qué lenguaje es el que se dedica a la parte del diseño en una página web? ");
        System.out.println("1. HTML");
        System.out.println("2. XML ");
        System.out.println("3. CSS ");
        System.out.println("4. JAVASCRIPT ");

        String respuesta1 = teclado.nextLine();

        if (respuesta1.equals("3")) {
            System.out.println("Respuesta CORRECTA");
            puntos++;
            System.out.println("1 Punto añadido");
        } else {
            System.out.println("Respuesta INCORRECTA");

        }


        //#2
        System.out.println("Pregunta 2: (BD) ¿Qué forma geométrica tiene una entidad? ");
        System.out.println("1. REDONDA");
        System.out.println("2. RECTANGULAR ");
        System.out.println("3. TRIANGULAR ");
        System.out.println("4. ROMBO ");

        String respuesta2 = teclado.nextLine();

        if (respuesta2.equals("2")) {
            System.out.println("Respuesta CORRECTA");
            puntos++;
            System.out.println("1 Punto añadido");
        } else {
            System.out.println("Respuesta INCORRECTA");

        }


        //#3
        System.out.println("Pregunta 3: ¿Cuál es un lenguaje orientado a objetos? ");
        System.out.println("1. HTML");
        System.out.println("2. XML ");
        System.out.println("3. JAVA ");
        System.out.println("4. JAVASCRIPT ");

        String respuesta3 = teclado.nextLine();

        if (respuesta3.equals("3")) {
            System.out.println("Respuesta CORRECTA");
            puntos++;
            System.out.println("1 Punto añadido");
        } else {
            System.out.println("Respuesta INCORRECTA");

        }


        //#4
        System.out.println("Pregunta 4: ¿Cuál es el logotipo de JAVA? ");
        System.out.println("1. OSO");
        System.out.println("2. TENEDOR ");
        System.out.println("3. DELFIN ");
        System.out.println("4. TAZA CAFÉ ");

        String respuesta4 = teclado.nextLine();

        if (respuesta4.equals("4")) {
            System.out.println("Respuesta CORRECTA");
            puntos++;
            System.out.println("1 Punto añadido");
        } else {
            System.out.println("Respuesta INCORRECTA");

        }


        //#5
        System.out.println("Pregunta 5: ¿Qué significa FOL? ");
        System.out.println("1. Formación y Orientatividad profesional en el Lenguaje ");
        System.out.println("2. Formación y Orientación en el Lenguaje ");
        System.out.println("3. Formación y Orientatividad profesional Laboral ");
        System.out.println("4. Formación y Orientación Laboral ");

        String respuesta5 = teclado.nextLine();

        if (respuesta5.equals("4")) {
            System.out.println("Respuesta CORRECTA");
            puntos++;
            System.out.println("1 Punto añadido");
        } else {
            System.out.println("Respuesta INCORRECTA");

        }


        //CONTROL DE PUNTOS
        System.out.println("Llevas: " + puntos + " puntos de un mámimo de 10 Puntos.");
        System.out.println(" ");
        if (puntos == 5) {
            System.out.println("Wow has respondido correctamente las 5 primeras preguntas, enhorabuena.");

        } else if (puntos >= 3) {

            System.out.println("Buen comienzo, aunque ¡Puedes mejorar!");

        } else {

            System.out.println("Fatal, la primera parte ha ido mal aunque puedes remontar. ");
        }


        //#6
        System.out.println("Pregunta 6:¿De qué forma es el simbolo de INTELLIJ? ");
        System.out.println("1. CUADRADO");
        System.out.println("2. REDONDO ");
        System.out.println("3. OVALADO ");
        System.out.println("4. CUADRADO CON BORDES REDONDEADOS ");

        String respuesta6 = teclado.nextLine();

        if (respuesta6.equals("1")) {
            System.out.println("Respuesta CORRECTA");
            puntos++;
            System.out.println("1 Punto añadido");
        } else {
            System.out.println("Respuesta INCORRECTA");

        }


        //#7
        System.out.println("Pregunta 7: ¿Qué son los 0 y 1? ");
        System.out.println("1. OCTAL");
        System.out.println("2. BINARIO ");
        System.out.println("3. HEXADECIMAL ");
        System.out.println("4. DECIMAL ");

        String respuesta7 = teclado.nextLine();

        if (respuesta7.equals("2")) {
            System.out.println("Respuesta CORRECTA");
            puntos++;
            System.out.println("1 Punto añadido");
        } else {
            System.out.println("Respuesta INCORRECTA");

        }


        //#8
        System.out.println("Pregunta 8: ¿Cuál de todos es un lenguaje de Pseudocódigo? ");
        System.out.println("1. ORITMAL");
        System.out.println("2. ORACLE ");
        System.out.println("3. PSEINT ");
        System.out.println("4. JAVASCRIPT ");

        String respuesta8 = teclado.nextLine();

        if (respuesta8.equals("3")) {
            System.out.println("Respuesta CORRECTA");
            puntos++;
            System.out.println("1 Punto añadido");
        } else {
            System.out.println("Respuesta INCORRECTA");

        }


        //#9
        System.out.println("Pregunta 9: ¿Qué asignatura enseña los fundamentos de un Ordenador? ");
        System.out.println("1. BD");
        System.out.println("2. SI ");
        System.out.println("3. LM ");
        System.out.println("4. ED ");

        String respuesta9 = teclado.nextLine();

        if (respuesta9.equals("2")) {
            System.out.println("Respuesta CORRECTA");
            puntos++;
            System.out.println("1 Punto añadido");
        } else {
            System.out.println("Respuesta INCORRECTA");

        }


        //#10
        System.out.println("Pregunta 10: ¿Quién administra los servidores fisicos en una base de datos? ");
        System.out.println("1. USUARIOS");
        System.out.println("2. ADMINISTRADORES ");
        System.out.println("3. PROGRAMADORES ");
        System.out.println("4. CLIENTES ");

        String respuesta10 = teclado.nextLine();

        if (respuesta10.equals("2")) {
            System.out.println("Respuesta CORRECTA");
            puntos++;
            System.out.println("1 Punto añadido");
        } else {
            System.out.println("Respuesta INCORRECTA");

        }


        System.out.println("----------------------------------------");
        System.out.println("         TOTAL PUNTOS OBTENIDOS         ");
        System.out.println("----------------------------------------");
        System.out.println("Un total de: " + puntos + " de un máximo de 10 puntos");


    }
}
