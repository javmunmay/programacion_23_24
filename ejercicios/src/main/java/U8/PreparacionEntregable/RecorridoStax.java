package U8.PreparacionEntregable;

import javax.xml.stream.*;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecorridoStax {
    public static void main(String[] args) {
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader eventReader = factory.createXMLEventReader(new FileInputStream("alumnos.xml"));

            int totalAlumnos = 0;
            int alumnosEnDireccion = 0;
            String direccionBuscada = "";

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la dirección para buscar alumnos: ");
            direccionBuscada = scanner.nextLine();

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();
                    if (startElement.getName().getLocalPart().equals("alumno")) {
                        totalAlumnos++;
                    }
                    if (startElement.getName().getLocalPart().equals("direccion")) {
                        event = eventReader.nextEvent();
                        if (event.isCharacters()) {
                            if (event.asCharacters().getData().equals(direccionBuscada)) {
                                alumnosEnDireccion++;
                            }
                        }
                    }
                }
            }
            System.out.println("Cantidad total de alumnos: " + totalAlumnos);
            System.out.println("Cantidad de alumnos que viven en " + direccionBuscada + ": " + alumnosEnDireccion);

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}

