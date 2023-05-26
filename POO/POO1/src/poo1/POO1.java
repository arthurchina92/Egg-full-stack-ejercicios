/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

import Entidades.Libro;
import Servicios.libroServicios;

/**
 *
 * @author ARTURO
 */
public class POO1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        libroServicios ls = new libroServicios();
        Libro Libro1 = ls.crearLibro();
        Libro Libro2 =ls.crearLibro();
        
        System.out.println(Libro1);
        System.out.println(Libro2);      
    }
}
