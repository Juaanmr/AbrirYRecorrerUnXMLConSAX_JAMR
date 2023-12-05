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
public class TitulosSAXhandler extends DefaultHandler {

    private String etiqueta;

    public TitulosSAXhandler() {
        etiqueta = "";//también se puede hacer con int etiqueta
    }

    /**
     * sobrescribimos el metodo para mostrar por pantalla el System.out.println
     */
    @Override
    public void startDocument() {
        System.out.println("LISTADO DE TITULOS");
        System.out.println("==================");
    }

    /**
     * sobrescribimos el metodo que se ejectado para que nos impirma por pantalla lo que deseamos
     * @param uri
     * @param localName
     * @param qName
     * @param atts
     * @throws SAXException error al leer el xml
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (qName.equals("Libro")) {
            etiqueta = "Libro";
        } else if (qName.equals("Titulo")) {
            etiqueta = "Titulo";
        } else if (qName.equals("Autor")) {
            etiqueta = "Autor";
        }
    }

    /**
     * metodo que elimina tabulaciones y saltos de linea 
     * @param ch
     * @param start
     * @param length
     * @throws SAXException 
     */
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (etiqueta.equals("Titulo") || etiqueta.equals("Autor")) {
            String car = new String(ch, start, length);
            car = car.replaceAll("\t", "");//quita todos los tabuladores
            car = car.replaceAll("\n", "");
            if(etiqueta.equals("Titulo")){
                System.out.print(car + ", ");
            }else if(etiqueta.equals("Autor")){
                System.out.println(car + "\n");
            }
        }
    }
}