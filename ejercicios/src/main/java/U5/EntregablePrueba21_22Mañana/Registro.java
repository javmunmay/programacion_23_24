package U5.EntregablePrueba21_22Mañana;


import java.util.Arrays;

public class Registro {
    private static final int TAMANIO_MAXIMO = 100;
    protected int indice_propiedad;
    private Propiedad[] propiedades = new Propiedad[TAMANIO_MAXIMO];


    public Registro(int indice_propiedad, Propiedad[] propiedades) {
        this.indice_propiedad = indice_propiedad;
        this.propiedades = propiedades;
    }

    //setEnergia(energia) {
    //if () {
    //this.energia= energia  y en el constructor le paso la energia

    //METODO addPropiedad(Propiedad propiedad)

    public void addPropiedad(Propiedad propiedad) {
        if (indice_propiedad == propiedades.length) {
            propiedades = Arrays.copyOf(propiedades, propiedades.length + 1);
        }
        propiedades[indice_propiedad] = propiedad;
        indice_propiedad++;

    }


// eliminarPropiedad(Propiedad propiedad)


    public boolean eliminarPropiedad(Propiedad propiedad) {
        Propiedad[] copia = new Propiedad[propiedades.length - 1];
        int contador_copia = 0;
        for (int i = 0; i < propiedades.length; i++) {
            if (!propiedades[i].equals(propiedad)) {
                copia[contador_copia] = propiedades[i];
                contador_copia++;
                //return true;
            }
        }
        propiedades = copia;
        return true; //antes era false

    }


    //Informaes dicho registro
//informeSuperficie()
    public void informeSuperficie() {
        Arrays.sort(propiedades, new informeSuperficie());
    }


//informeAntiguedad()

    public void informeAntiguedad() {
        Arrays.sort(propiedades, new informeAntiguedad());
    }


}