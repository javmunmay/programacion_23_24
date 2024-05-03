package U7.ExamenU6U7_2324;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Caseta implements Serializable {

    private String nombre;
    private String ubicacion;
    private double tamanom2;
    private double idCaseta;
    private static int contadorId = 1; // Contador estático para el IDCaseta





    //private static final long serialVersionUID = 1L;


    public Caseta(String nombre, String ubicacion, double tamanom2) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tamanom2 = tamanom2;
        this.idCaseta = contadorId++;

    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getTamanom2() {
        return tamanom2;
    }

    public void setTamanom2(double tamanom2) {
        this.tamanom2 = tamanom2;
    }

    public double getIdCaseta() {
        return idCaseta;
    }

    public void setIdCaseta(double idCaseta) {
        this.idCaseta = idCaseta;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Caseta.contadorId = contadorId;
    }

    @Override
    public String toString() {
        return "Caseta{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", tamanom2=" + tamanom2 +
                ", idCaseta=" + idCaseta +
                '}';
    }



}
