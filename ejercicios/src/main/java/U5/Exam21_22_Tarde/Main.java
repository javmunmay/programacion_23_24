package U5.Exam21_22_Tarde;

public class Main {
    public static void main(String[] args) {

        Integrante I1 = new Integrante(1, "Javier", 21, "Cadiz");
        Integrante I2 = new Integrante(2, "Clara", 19, "Caceres");
        Integrante I3 = new Integrante(3, "Angel", 20, "Huelva");

        Integrante[] integrantes = {I1, I2, I3};

        COAC coac = new COAC();

        AgrupacionOficial A1 = new Coro("Los Saltarines", "Juan Manuel", "Alejandro Gomez", "Alejandro Gomez", "Disfraz de Canguros", 3.0, integrantes, 6, 4, 3);

        AgrupacionOficial A2 = new Chirigota("Los Jamoneros", "Miguel Hernandez", "Luis de Gongora", "Pablo Gomez", "Disfraz De charcuteros", 4.3, integrantes, 2, 3);

        AgrupacionOficial A3 = new Comparsa("Los Aleteo", "Jose", "Virtor", "Carmen", "Disfraz de Gaviotas", 5.3, integrantes, 3, "Empresa Nouva");

        AgrupacionOficial A4 = new Cuarteto("Los Cantantes", "David", "Hernandez", "Luis", "Disfraz de Cantantes famosos", 4.5, integrantes, 2, 3);
        //String nombre, String autor, String autorMusica, String autorLetras, String tipoDisfraz, int numeroDeMiembros, int puntosObtenidos) {
        //
        Agrupacion A5 = new Romancero("JulieAndRomeo ", "Sergio", "Hernand", "Hernand", "Disfraz de gala", 9.0, "Romeo y Julieta");

        //-----------------------------


        Cuarteto c1 = new Cuarteto("Bailando Voy", "Jaime ", "Jaime", "Juan", "Disfraz de Bailarines Modernos", 5.1, integrantes, 3, 4);
        Chirigota Ch1 = new Chirigota("Los Jamoneros", "Miguel Hernandez", "Luis de Gongora", "Pablo Gomez", "Disfraz De charcuteros", 4.9, integrantes, 2, 3);
        Romancero R1 = new Romancero("JulieAndRomeo ", "Sergio", "Hernand", "Hernand", "Disfraz de gala", 9.0, "Romeo y Julieta");

        A1.cantar_la_presentacion();
        A2.cantar_la_presentacion();
        A3.cantar_la_presentacion();
        A4.cantar_la_presentacion();
        A5.cantar_la_presentacion();

        System.out.println();

        A1.hacer_tipo();
        A2.hacer_tipo();
        A3.hacer_tipo();
        A4.hacer_tipo();
        A5.hacer_tipo();

        System.out.println();

        A1.caminitoDelFalla();
        A2.caminitoDelFalla();
        A3.caminitoDelFalla();
        A4.caminitoDelFalla();

        System.out.println();

        //A1.insertar_integrante(I1);
        //A1.insertar_integrante(I2);

        //A1.eliminar_integrante(I2);

        System.out.println();

        coac.inscribir_agrupacion(c1);

        //coac.eliminar_agrupacion(c1);

        //coac.ordenar_por_autor();
        //coac.ordenar_por_nombre();
        //coac.ordenar_por_puntos();

        System.out.println();

        c1.amo_a_escucha();
        Ch1.amo_a_escucha();
        R1.amo_a_escucha();
    }
}
