package U5.EntregablePrueba21_22Manana;

public class Personas {

    protected String NIF;
    protected String Nombre;
    protected String Apellidos;
    protected String ID_Unico; //que se debe generar automáticamente dentro de la clase, es decir,
    // no se puede pasar por parámetro, y que a su vez debe ser un atributo del objeto y no de la clase.


    public Personas(String NIF, String nombre, String apellidos, String ID_Unico) {
        this.NIF = NIF;
        Nombre = nombre;
        Apellidos = apellidos;
        this.ID_Unico = ID_Unico;

    }


}
