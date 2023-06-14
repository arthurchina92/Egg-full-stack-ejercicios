/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;

/**
 *
 * @author ARTURO
 */
public class CafeteraServicios {
    Cafetera Cafe = new Cafetera();
    int capacidadActual;
    
    public void llenarCafetera(){
        int llenar = Cafe.getCapacidadMax();
        Cafe.setCapacidadActual(llenar);
        System.out.println("La cafetera está llena");
    }

    /**
     *
     * @param taza
     */
    public void servirTaza(int taza){
        int sobrante = Cafe.getCapacidadActual();
        int medida;
        if (taza > sobrante){
            medida = sobrante;
            System.out.println("No alcanza para llenar la taza, se sirvió: "
            + medida + "ml");
            Cafe.setCapacidadActual(0);
        } else if (taza < sobrante){
            medida = taza;
            System.out.println("Sí se llenó la taza");
            Cafe.setCapacidadActual(sobrante-taza);
        }
        capacidadActual = Cafe.getCapacidadActual();
        System.out.println("La cantidad actual de cafe en la cafetera es: " + capacidadActual);
    }
    public void vaciarCafetera(){
        capacidadActual = 0;
        Cafe.setCapacidadActual(capacidadActual);
        System.out.println("La cafetera esta vacia");
    }
    public void agregarCafe(int cafe){
        System.out.println("Se han agregado " + cafe + "gramos de cafe");
    }
}
