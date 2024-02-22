package U5.EntregablePrueba21_22Mañana;

import java.util.Arrays;

public class Personas {

    protected String NIF;
    protected String Nombre;
    protected String Apellidos;
    protected String ID_Unico; //que se debe generar automáticamente dentro de la clase, es decir,
    // no se puede pasar por parámetro, y que a su vez debe ser un atributo del objeto y no de la clase.

    protected Personas[] personas;
    protected int indice_integrantes; //Llevar el numero actual de integrantes en las agrupaciones

    public Personas(String NIF, String nombre, String apellidos, String ID_Unico, int indice_integrantes) {
        this.NIF = NIF;
        Nombre = nombre;
        Apellidos = apellidos;
        this.ID_Unico = ID_Unico;
        this.indice_integrantes = indice_integrantes;
    }

    //Metodo añadir_persona

    public void annadirPersona(Personas i) {
        if (indice_integrantes == personas.length) {
            personas = Arrays.copyOf(personas, personas.length + 1);
        }
        personas[indice_integrantes] = i;
        indice_integrantes++;

    }

    //Metodo quitar_persona

    public boolean quitar_persona(Personas i) {

        Personas[] copia = new Personas[personas.length - 1];
        int contador_copia = 0;
        for (int j = 0; j < personas.length; j++) {
            if (!personas[j].equals(i)) {
                copia[contador_copia] = personas[j];
                contador_copia++;
                return true;
            }
        }
        personas = copia;
        return false;

    }

}
