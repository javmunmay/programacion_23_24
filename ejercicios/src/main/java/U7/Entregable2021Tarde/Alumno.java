package U7.Entregable2021Tarde;

public class Alumno implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellidos;
    private String dni;
    private int idAlumno;
    private Unidad unidad;

    public Alumno(String nombre, String apellidos, String dni, int idAlumno, Unidad unidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.idAlumno = idAlumno;
        this.unidad = unidad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }
}
