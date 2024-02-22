package U5.Examen_2021_Turno_Manana;

public class Main {
    public static void main(String[] args) {
        Conductor conductor1 = new Conductor("Juan", "García", "12345");
        Conductor conductor2 = new Conductor("María", "López", "54321");

        Conductor[] conductor = {conductor1, conductor2};

        Prendas prenda1 = new Prendas(20, "Camiseta Scalpers", "228836", "Si", 20);

        PrendaColgada prendaColgada1 = new PrendaColgada(50.0, "Camisa", "CB123", "Si", 2, "30cm");
        PrendaColgada prendaColgada2 = new PrendaColgada(100.0, "Vestido", "CB456", "Si", 4, "40cm");

        Prendas[] prendas = {prenda1};

        PrendaColgada[] prendasColgadas = {prendaColgada1, prendaColgada2};

        Caja caja1 = new Caja(1, 20, prendas);
        Caja caja2 = new Caja(2, 30, prendas);

        Caja[] cajas = {caja1, caja2};


        CamionCajas camion1 = new CamionCajas("123ABC", 5000, conductor, cajas, 10, "28004");
        CamionPerchas camion2 = new CamionPerchas("456DEF", 7000, conductor, prendasColgadas, 10);


        camion1.addCaja(caja1);
        camion1.addCaja(caja2);
        camion2.addPrendaColgada(prendaColgada1);
        camion2.addPrendaColgada(prendaColgada2);

        camion1.descargar();
        camion2.descargar();
    }
}
