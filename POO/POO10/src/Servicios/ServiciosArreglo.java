/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Arreglo;
import java.util.Arrays;

/**
 *
 * @author ARTURO
 */
public class ServiciosArreglo {
    Arreglo arreglo1 = new Arreglo();
    
    
    /*public Arreglo llenarMatriz(){
        int matriz1 [][] = new int[5][10];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
              matriz1[i][j]=(int)(Math.random()*10); 
            }  
        }
        arreglo1.setArregloA(matriz1);
        System.out.println(matriz1[0][0]);
        System.out.println(Arrays.toString(arreglo1.getArregloA()));
        return arreglo1;
    }*/
    
    public void llenarMatriz1(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) { //
            for (int j = 0; j <matriz[i].length; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
    public void ordenarMatriz(){
        
    }
}

