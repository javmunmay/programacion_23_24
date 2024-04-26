package U7.U6U7_Entregable_2324;
import java.io.Serializable;

public class Atleta implements Serializable {
    private static int dorsalSucesivo = 1;
    private int dorsal;
    private String nombre;
    private String pais;
    private int marca;
    private String categoria;
    private boolean finisher;

    public Atleta(String nombre, String pais, String categoria) {
        this.dorsal = dorsalSucesivo++;
        this.nombre = nombre;
        this.pais = pais;
        this.categoria = categoria;
        this.finisher = false;
    }

    // Getters y setters

    public int getDorsal() {
        return dorsal;
    }

    public static int getDorsalSucesivo() {
        return dorsalSucesivo;
    }

    public static void setDorsalSucesivo(int dorsalSucesivo) {
        Atleta.dorsalSucesivo = dorsalSucesivo;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    public void setMarca(int marca) {
        this.marca = marca;
        this.finisher = true;
    }

    public boolean isFinisher() {
        return finisher;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", marca=" + marca +
                ", categoria='" + categoria + '\'' +
                ", finisher=" + finisher +
                '}';
    }
}