package U7.Preparacion3ExamenU6U7;

import java.io.*;
import java.util.*;

public class SAE implements Serializable {
    private Map<Integer, Oferta> ofertas;

    public SAE() {
        this.ofertas = new TreeMap<>();
    }

    public boolean addOferta(Oferta o) {
        if (ofertas.containsKey(o.getCodigo())) {
            return false;
        }
        ofertas.put(o.getCodigo(), o);
        return true;
    }

    public boolean addTrabajador(Integer codigo, Trabajador t) {
        Oferta o = ofertas.get(codigo);
        if (o == null || o.isCubierta() || o.addTrabajador(t)) {
            return false;
        }
        return true;
    }

    public boolean removeTrabajador(Integer codigo, Trabajador t) {
        Oferta o = ofertas.get(codigo);
        if (o == null || o.isCubierta() || !o.removeTrabajador(t)) {
            return false;
        }
        return true;
    }

    public void mostrarTrabajadores(Integer codigo) {
        Oferta o = ofertas.get(codigo);
        if (o != null) {
            o.mostrarTrabajadores();
        } else {
            System.out.println("No existen trabajadores inscritos en esta oferta.");
        }
    }

    public void mostrarTrabajadoresXEdad(Integer codigo) {
        Oferta o = ofertas.get(codigo);
        if (o != null) {
            o.mostrarTrabajadoresXEdad();
        } else {
            System.out.println("No existen trabajadores inscritos en esta oferta.");
        }
    }

    public int cantidadOfertas(String dni) {
        return (int) ofertas.values().stream().filter(o -> o.trabajadores.stream().anyMatch(t -> t.getDni().equals(dni))).count();
    }

    public void mostrarOfertas() {
        List<Oferta> ofertaList = new ArrayList<>(ofertas.values());
        ofertaList.sort(Comparator.comparingInt(o -> o.trabajadores.size()));
        Collections.reverse(ofertaList);
        ofertaList.forEach(o -> System.out.println("Código: " + o.getCodigo() + ", Descripción: " + o.descripcion + ", Cubierta: " + (o.isCubierta() ? "Sí" : "No")));
    }

    public void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sae.dat"))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sae.dat"))) {
            SAE sae = (SAE) ois.readObject();
            this.ofertas = sae.ofertas;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
