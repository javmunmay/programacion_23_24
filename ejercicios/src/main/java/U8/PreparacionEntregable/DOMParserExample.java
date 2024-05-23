package U8.PreparacionEntregable;

import org.w3c.dom.*;

import javax.xml.parsers.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

class Alumno implements Comparable<Alumno> {
    String dni;
    String nombre;
    String apellido;
    String direccion;

    Alumno(String dni, String nombre, String apellido, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    @Override
    public int compareTo(Alumno o) {
        return this.dni.compareTo(o.dni);
    }
}

public class DOMParserExample {
    public static void main(String[] args) {
        try {
            // Crear el ArrayList de Alumnos
            ArrayList<Alumno> alumnosList = new ArrayList<>();

            // Parsear el documento XML
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("alumnos.xml"));

            // Obtener todos los elementos "alumno"
            NodeList nodeList = doc.getElementsByTagName("alumno");

            // Recorrer los nodos y crear objetos Alumno
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element elem = (Element) nodeList.item(i);
                String dni = elem.getAttribute("dni");
                String nombre = elem.getElementsByTagName("nombre").item(0).getTextContent();
                String apellido = elem.getElementsByTagName("apellido").item(0).getTextContent();
                String direccion = elem.getElementsByTagName("direccion").item(0).getTextContent();
                alumnosList.add(new Alumno(dni, nombre, apellido, direccion));
            }

            // Ordenar los DNIs y mostrarlos
            Collections.sort(alumnosList);
            for (Alumno alumno : alumnosList) {
                System.out.println(alumno.dni);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

