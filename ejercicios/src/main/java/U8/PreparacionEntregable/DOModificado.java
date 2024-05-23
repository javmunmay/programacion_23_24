package U8.PreparacionEntregable;

import org.w3c.dom.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class DOModificado {
    public static void main(String[] args) {
        try {
            // Parsear el documento XML
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("alumnos.xml"));

            // Añadir nodo <instituto> a cada alumno
            NodeList nodeList = doc.getElementsByTagName("alumno");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element elem = (Element) nodeList.item(i);
                Element instituto = doc.createElement("instituto");
                instituto.setTextContent("IES VELÁZQUEZ");
                elem.appendChild(instituto);
            }

            // Crear nuevo alumno
            Element nuevoAlumno = doc.createElement("alumno");
            nuevoAlumno.setAttribute("dni", "8888888X");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Luis");
            nuevoAlumno.appendChild(nombre);

            Element apellido = doc.createElement("apellido");
            apellido.setTextContent("Ruiz");
            nuevoAlumno.appendChild(apellido);

            Element direccion = doc.createElement("direccion");
            direccion.setTextContent("Allí");
            nuevoAlumno.appendChild(direccion);

            Element instituto = doc.createElement("instituto");
            instituto.setTextContent("IES VELÁZQUEZ");
            nuevoAlumno.appendChild(instituto);

            // Insertar el nuevo alumno al inicio del elemento <alumnos>
            Node alumnos = doc.getDocumentElement();
            alumnos.insertBefore(nuevoAlumno, alumnos.getFirstChild());

            // Guardar los cambios en un nuevo archivo
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("alumnos_modificado.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

