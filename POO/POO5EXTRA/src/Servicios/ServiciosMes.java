/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Mes;
import java.util.Scanner;

/**
 *
 * @author ARTURO
 */
public class ServiciosMes {
    Mes meses = new Mes();
    Scanner leer = new Scanner(System.in);
    
    
    public String NumeroSecreto(){
        //Cambié el +1 porque la función ya te da un numero entre 0 y 11 que son las posiciones del array
        int numero = (int) (Math.random() * 12);
        //Tampoco es necesario el numero-1
        String mesSecreto = meses.getMes()[numero];
        return mesSecreto;
    }
    
    public void AdivinarNumero(){
        System.out.println("Adivina en que mes estoy pensando:");
        System.out.println("Ingresa el mes en minúsculas");
        //Albergué el valor de NumeroSecreto() en una variable de tipo String para poder utilizarla mas fácil.
        String secretMonth = NumeroSecreto();
        System.out.println(secretMonth);
        boolean aux = false;
              
          while(!aux){
                String usuario = leer.nextLine();
                if(usuario.equals(secretMonth)){
                System.out.println("Felicidades, adivinaste el numero!");
                aux = true;   
        }  else {
                System.out.println("Sigue intentando"); 
            }
          }
    }
}

