/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg1.pkg5.abriryrecorrerunxmlconsax;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

/**
 *
 * @author Juan
 */
public class LibrosSAXhandler extends DefaultHandler {
    
    int contador = 0;

    public LibrosSAXhandler() {
    }
    
    @Override
    public void startDocument() {
        System.out.println("LISTADO DE LIBROS");
        System.out.println("==================");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (qName.equals("Libro")) {
            contador++;
            System.out.print("Libro nº " +contador + "\n");
            System.out.println(" Publicado en: " + atts.getValue(atts.getQName(0)));//extrae);//extrae el primer atributo
        } else if (qName.equals("Titulo")) {
            System.out.print("\n " + "El titulo es: ");//aún no sabemos cúal es el titulo, eso lo sabemos en el evento characters
        } else if (qName.equals("Autor")) {
            System.out.print("\n " + "El author es: ");
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("Libro")) {
            System.out.println("\n---------------------------");
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String car = new String(ch, start, length);
        car = car.replaceAll("\t", "");//quita todos los tabuladores
        car = car.replaceAll("\n", "");
        System.out.print(car);
    }
}
