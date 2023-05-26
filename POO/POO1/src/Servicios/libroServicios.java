/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author ARTURO
 */
public class libroServicios {

    public Libro crearLibro() {
        Libro l1 = new Libro();
        Scanner leer = new Scanner(System.in);
        System.out.println("Inserte titulo del libro");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el ISBN");
        l1.setISBN(leer.next());
        System.out.println("Ingrese el autor");
        l1.setAutor(leer.next());
        System.out.println("Ingrese el numero de paginas");
        l1.setNumPag(leer.nextInt());
        return l1;
    }
}
