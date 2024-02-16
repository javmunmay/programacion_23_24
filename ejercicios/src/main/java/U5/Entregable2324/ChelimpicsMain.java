package U5.Entregable2324;

public class ChelimpicsMain {
    public static void main(String[] args) {
        //Creamos un juego
        Juegos olimpiadas24 = new Juegos(2024, "Sede1");

        Pais pais1 = new Pais("España",50);
        Pais pais2 = new Pais("Francia",50);
        Pais pais3 = new Pais("Italia",50);
        Pais pais4 = new Pais("Suiza",50);
        Pais pais5 = new Pais("Croacia",50);


        // Crear un deporte
        Deporte d1 = new Baloncesto("Baloncesto", "Pabellon1", TipoParticipante.JUGADOR_BALONCESTO);

        //añadePaises
        olimpiadas24.ayadirPais(pais1);


        //muestraPaisesOrdenados
        System.out.println("Paises Ordenados");
        //olimpiadas24.mostrarPaises

        // Crear participantes
        Participante jugador1 = new Baloncestista("Pedro Perez", 25, 1.85);
        Participante jugador2 = new Baloncestista("Jose Manuel", 26, 1.86);

        //quitarParticipante

        d1.quitarParticipante("jugador1");
        d1.quitarParticipante("jugador2");

        // Añadir participantes al deporte
        d1.ayadirParticipante(jugador1, TipoParticipante.JUGADOR_BALONCESTO);
        d1.ayadirParticipante(jugador2, TipoParticipante.PELADOR_GAMBAS);
        d1.ayadirParticipante(jugador2, TipoParticipante.LANZADOR_TRONCOS);

        // Mostrar participantes de baloncesto
        //deporte.mostrarParticipantes(TipoParticipante.JUGADOR_BALONCESTO);





    }


}


