package U5.Examen2324U5Javier_MunozMayorga;

public class Main {
    public static void main(String[] args) {


        Capitulos cap1 = new Capitulos(22);
        Capitulos[] capitulos = {cap1};


        Multimedia Libro1 = new Libro(1,true, 2002, "Los Carnavales","Federico" ,"Editorial Las Magnificas" ,"123456" , 25 );
        Multimedia pelicula1 = new Pelicula(2,false, 2010, "Aventuras Con El Main", "Jose", 120,"Peliculas Las Magnificas", "España");
        Multimedia serie1 = new Serie(3,true, 2021, "Avanza en las aventuras de JAVA", "Manuel el peliculero", 10, capitulos);

        Multimedia[] multimedia ={Libro1, pelicula1, serie1};

        Pelicula pelicula2 = new Pelicula(4,false, 2012, "Aventuras Del aventurero", "Maria", 120,"Peliculas Las Magnificas", "España");

        Catalogo catalogo1 = new Catalogo(1, multimedia);

        System.out.println();

        pelicula2.play();
        pelicula2.pause();
        pelicula2.stop();

        System.out.println();

        Libro1.dar_por_finalizado();
        pelicula1.dar_por_finalizado();
        serie1.dar_por_finalizado();

        Libro1.toString();

        System.out.println();

        catalogo1.add_multimedia(pelicula1);
        catalogo1.eliminar_multimedia(pelicula1);


        catalogo1.toString();





    }
}
