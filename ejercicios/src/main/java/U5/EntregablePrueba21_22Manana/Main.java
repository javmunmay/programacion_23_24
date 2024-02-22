package U5.EntregablePrueba21_22Manana;


public class Main {
    public static void main(String[] args) {

        Local L1 = new LocalIndustrial(2003, "C/Alfonso 12", 140, 205000, "Juan Miguel", 45.98);
        Local L2 = new LocalComercial(2005, "C/Clara Breuer", 320, 340000, "Aitana", "NULL");


        Personas P1 = new Personas("7543902F", "Juan", "Ortiz", "32441G");
        Personas[] persona = {P1};
        Vivienda V1 = new Vivienda(2002, "C/ninguna", 200, 180000, 3, 4, 4, persona);

        Propiedad PO1 = new Propiedad(2020, "C/null", 150, 150000);
        Propiedad[] propiedades = {PO1};
        Registro R1 = new Registro(3, propiedades);

        EquipamientoDeServicios E1 = new EquipamientoDeServicios(2015, "null", 200, 130000);

        E1.mostrarPropiedad();

        System.out.println();

        L1.mostrarPropiedad();
        System.out.println();
        L2.mostrarPropiedad();

        System.out.println();

        V1.annadirPersona(P1);

        System.out.println();

        //P1.quitar_persona(P1);

        System.out.println();

        //R1.addPropiedad(PO1);
        //R1.eliminarPropiedad(PO1);

        R1.informeAntiguedad();
        R1.informeSuperficie();


    }

}
