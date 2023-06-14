/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package poo6;

import Servicios.CafeteraServicios;

/**
 *
 * @author ARTURO
 */
public class POO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicios servicio1 = new CafeteraServicios();
        CafeteraServicios servicio2 = new CafeteraServicios();
        
        System.out.println("Cafetera 1");
        System.out.println(" ");
        servicio1.llenarCafetera();
        servicio1.servirTaza(500);
        servicio1.servirTaza(500);
        servicio1.vaciarCafetera();
        servicio1.servirTaza(500);
        servicio1.servirTaza(300);
        servicio1.servirTaza(300);
        servicio1.agregarCafe(100);
        System.out.println(" ");
        System.out.println("Cafetera 2");
        System.out.println(" ");
        servicio2.llenarCafetera();
        servicio2.agregarCafe(200);
        servicio2.servirTaza(250);
        servicio2.servirTaza(250);
        servicio2.servirTaza(250);
        servicio2.vaciarCafetera();
    }
    
}
