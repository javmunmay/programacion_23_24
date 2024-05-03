package U7.Preparacion3ExamenU6U7;

import java.io.Serializable;
import java.util.*;

public class Oferta implements Serializable {


    String descripcion;
    Set<Trabajador> trabajadores;
    private int codigo;
    private boolean cubierta;

    public Oferta(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cubierta = false; //por defecto sera falso
        this.trabajadores = new TreeSet<>(Comparator.comparing(Trabajador::getApellidos).thenComparing(Trabajador::getNombre));
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isCubierta() { //o getCubierta es lo mismo
        return cubierta;
    }

    public void setCubierta(boolean cubierta) {
        this.cubierta = cubierta;
    }

    public boolean addTrabajador(Trabajador t) {
        //return trabajadores.add(t);
        boolean agregado = trabajadores.add(t);

        // Si se pudo agregar al trabajador y la oferta no estaba cubierta, marcar como cubierta
        if (agregado && !isCubierta()) {
            setCubierta(true); // Marcar la oferta como cubierta
        }

        return agregado; // Devolver true si se agregó el trabajador, false si ya estaba en la oferta
    }


    public boolean removeTrabajador(Trabajador t) {
        return trabajadores.remove(t);
    }

    public void mostrarTrabajadores() {
        trabajadores.forEach(t -> System.out.println(t.getApellidos() + ", " + t.getNombre()));
    }

    public void mostrarTrabajadoresXEdad() {
        List<Trabajador> trabajadoresList = new ArrayList<>(trabajadores);
        trabajadoresList.sort(Comparator.comparingInt(Trabajador::getEdad).thenComparing(Trabajador::getNombre));
        trabajadoresList.forEach(t -> System.out.println(t.getNombre() + " " + t.getApellidos() + ", Edad: " + t.getEdad()));
    }
}
