/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg1.pkg5.abriryrecorrerunxmlconsax;

import java.io.File;

/**
 *
 * @author Juan
 */
public class UsaAccesoXMLSAX {

    public static void main(String[] args) {
        File f = new File("Libros.xml");
        //primer apartado de la practica
        AccesoXMLSAX a = new AccesoXMLSAX();
        //a.parsearXMLconLibrosSAXhandler(f);
        
        //segunda parte de la practica 
        a.parsearXMLconTituloSAXhandler(f);
    }
}