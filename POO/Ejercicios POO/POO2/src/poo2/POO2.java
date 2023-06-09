/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import Servicios.circunferenciaServicios;

/**
 *
 * @author ARTURO
 */
public class POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circunferenciaServicios circunferencia1 = new circunferenciaServicios();
        circunferenciaServicios circunferencia2 = new circunferenciaServicios();
        
        System.out.println("Datos del circulo 1");
        circunferencia1.crearCircunferencia();
        circunferencia1.area();
        circunferencia1.perimetro(); 
        
        System.out.println(" ");
        
        System.out.println("Datos del ciruculo 2");
        circunferencia2.crearCircunferencia();
        circunferencia2.area();
        circunferencia2.perimetro();
    }
    
}
