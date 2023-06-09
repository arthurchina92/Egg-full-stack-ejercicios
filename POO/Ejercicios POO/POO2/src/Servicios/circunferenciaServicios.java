/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author ARTURO
 */
public class circunferenciaServicios {
    Circunferencia circunferencia = new Circunferencia();
    Scanner leer = new Scanner(System.in);
    
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio por favor");
        double radio =leer.nextDouble();
        circunferencia.setRadio(radio);
}
    public void area(){
        double radio = circunferencia.getRadio();
        double area = Math.PI*(radio*radio);
        System.out.println("El area del circulo es " + area);
    }
    public void perimetro(){
        double radio = circunferencia.getRadio();
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro del circulo es " + perimetro);
    }
}
