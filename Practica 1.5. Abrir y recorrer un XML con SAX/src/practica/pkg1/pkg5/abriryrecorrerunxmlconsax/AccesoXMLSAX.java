/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg1.pkg5.abriryrecorrerunxmlconsax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 *
 * @author Juan
 */
public class AccesoXMLSAX {

    SAXParser parser;

    /**
     * metodo que recorre el xml con sax y utiliza el handler que muestra todos los valores de los libros
     * @param f archivo xml que queremso parsear
     * @return si devuelve un 0 esta todo correcto y si devuelve un 1 hay algun error al parsear
     */
    public int parsearXMLconLibrosSAXhandler(File f) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
            LibrosSAXhandler sh = new LibrosSAXhandler();
            parser.parse(f, sh);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    /**
     * metodo que recorre el xml con sax y utiliza el handler que muestra SOLO el valor de los titulos  de los librso
     * @param f archivoxml que queremso parsear
     * @return si devuelve un 0 esta todo correcto y si devuelve un 1 hay algun error al parsear
     */
    public int parsearXMLconTituloSAXhandler(File f){
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
            TitulosSAXhandler sh = new TitulosSAXhandler();
            parser.parse(f, sh);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
