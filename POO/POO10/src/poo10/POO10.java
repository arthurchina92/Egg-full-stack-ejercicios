/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo10;

import Entidades.Arreglo;
import Servicios.ServiciosArreglo;

/**
 *
 * @author ARTURO
 */
public class POO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosArreglo SA = new ServiciosArreglo();
        Arreglo A = new Arreglo();
        SA.llenarMatriz1(A.getArregloA());
        System.out.println("------------------------");
        SA.llenarMatriz1(A.getArregloB());
        System.out.println("------------------------");
        SA.ordenarMatriz(A.getArregloA());
        System.out.println("---------------------------");
        SA.ordenarMatriz(A.getArregloB());
        System.out.println("---------------------------");
        SA.primeros10Numeros(A.getArregloA());
        
        
        //System.out.println("Arreglo A " + A.getArregloA());
    } 
}
