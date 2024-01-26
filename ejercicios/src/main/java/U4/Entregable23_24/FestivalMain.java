package U4.Entregable23_24;

public class FestivalMain {
    public static void main(String[] args) {

        // Crear Festival
        Festival festival = new Festival("Sevilla Festival", 3);

        // Crear Conciertos
        Concierto concierto1 = new Concierto("Marbella Festival", "Fecha 1", 3);
        Concierto concierto2 = new Concierto("Super Cadiz", "Fecha 2", 3);
        Concierto concierto3 = new Concierto("New Festy", "Fecha 3", 3);


        // programar Conciertos
        concierto1.programarConcierto("12 Febrero");
        concierto2.programarConcierto("18 Febrero");
        concierto3.programarConcierto("26 Febrero");

        System.out.println("----- ");

        // agregar Conciertos al festival
        festival.agregarConcierto(concierto1);
        festival.agregarConcierto(concierto2);
        festival.agregarConcierto(concierto3);


        // Crear Escenarios
        Escenario escenario1 = new Escenario("Escenario Principal", "Zona Principal", 1000, 2);
        Escenario escenario2 = new Escenario("Escenario Secundario", "Zona secundaria", 1500, 2);
        Escenario escenario3 = new Escenario("Escenario Extra", "zona exterior", 1200, 2);


        // Crear Cantantes
        Cantante cantante1 = new Cantante("Benito Antonio Martínez Ocasio", "Bad Bunny", 27, "San Juan, Puerto Rico", 2);
        Cantante cantante2 = new Cantante("Rosalía Vila Tobella", "Rosalia", 29, "Sant Esteve Sesrovires, España", 2);


        // Crear Canciones
        Cancion cancion1 = new Cancion("Canción 1", 180, "TRAP", cantante1);
        Cancion cancion2 = new Cancion("Canción 2", 200, "NEOPERREO", cantante1);
        Cancion cancion3 = new Cancion("Canción 3", 150, "EMORAP", cantante2);

        // Agregar Escenarios a los Conciertos
        concierto1.agregarEscenario(escenario1);
        concierto1.agregarEscenario(escenario2);
        concierto1.agregarEscenario(escenario3);

        concierto2.agregarEscenario(escenario1);
        concierto2.agregarEscenario(escenario2);
        concierto2.agregarEscenario(escenario3);

        concierto3.agregarEscenario(escenario1);
        concierto3.agregarEscenario(escenario2);
        concierto3.agregarEscenario(escenario3);

        //mostrar cartelera (Concierto)
        concierto1.mostrarCartelera();
        concierto2.mostrarCartelera();
        concierto3.mostrarCartelera();

        // Agregar Cantantes a los Escenarios
        escenario1.agregarCantante(cantante1);
        escenario1.agregarCantante(cantante2);

        escenario2.agregarCantante(cantante1);
        escenario2.agregarCantante(cantante2);

        escenario3.agregarCantante(cantante1);
        escenario3.agregarCantante(cantante2);

        //Mostrar Informacion escenario
        escenario1.mostrarDetalles();
        escenario2.mostrarDetalles();
        escenario3.mostrarDetalles();

        // Agregar Canciones a los Cantantes
        cantante1.agregarCancion(cancion1);
        cantante1.agregarCancion(cancion2);

        cantante2.agregarCancion(cancion3);

        // Mostrar información del Festival
        festival.mostrarInformacion();
    }
}




