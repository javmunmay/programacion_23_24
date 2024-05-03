package U7.ExamenU6U7_2324;

import java.io.*;
import java.util.*;

public class FeriaDeSevilla implements Serializable{
    private Map<String, List<Caseta>> casetasLista;
    public FeriaDeSevilla() {
        casetasLista = new HashMap<>();
    }

    public Map<Integer, Artista> artistasLista;

    public Map<String, List<Caseta>> getCasetasLista() {
        return casetasLista;
    }

    public void setCasetasLista(Map<String, List<Caseta>> casetasLista) {
        this.casetasLista = casetasLista;
    }


    public Map<Integer, Artista> getArtistasLista() {
        return artistasLista;
    }

    public void setArtistasLista(Map<Integer, Artista> artistasLista) {
        this.artistasLista = artistasLista;
    }

    //Metodos:


    //addActuacion
    public void addActuacion(Caseta c, Artista a) {
        List<Caseta> casetas = casetasLista.getOrDefault(c, new ArrayList<>());
        casetas.add(c);
        casetasLista.put(String.valueOf(a),casetas);
    }



    //getArtistas





    //getCasetas





    //getCaseta

    public Caseta getCaseta (String nombre) {
        List<Caseta> casetas = casetasLista.getOrDefault(nombre, new ArrayList<>());
        casetas.forEach(System.out::println);
        return (Caseta) casetas;
    }




    //removeCaseta
    public void removeCaseta(String nombre) {
        casetasLista.remove(nombre);

        System.out.println("Caseta eliminada correctamente");

    }




    //getArtista
//    public Artista getArtista(String nombreArtistico){
//        List<Artista> artistas = artistasLista.getOrDefault(nombreArtistico, new ArrayList<>());
//        artistas.forEach(System.out::println);
//        return (Artista) artistas;
//    }


    //guardarDatos

    public void guardarDatos(String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(casetasLista);
            System.out.println("Atletas guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los alumnos: " + e.getMessage());
        }
    }



    //cargarDatos

    public void cargarDatos(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            casetasLista = (Map<String, List<Caseta>>) ois.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar los Datos: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }




}
