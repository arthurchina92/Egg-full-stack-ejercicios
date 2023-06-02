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
    double matriz1[][]= new double [][];
    
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
    
    public void llenarMatriz1(double[][]matriz){
        for (int i = 0; i < matriz.length; i++) { //
            for (int j = 0; j <matriz[i].length; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]);
                System.out.print(", ");
            }
            System.out.println(" ");
        }
    }
    public double ordenarMatriz(double[][]matriz){
       double matrizB [][] = new double [1][20];
        for (int i = 0; i < matriz.length; i++) {
           Arrays.sort(matriz[i]);       
           System.out.println(Arrays.toString(matriz[i]));
           System.arraycopy(matriz, 0, matrizB , 0, 10);
          
        }  
        return double [][] matrizB;
    }
    public void primeros10Numeros(double[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
            
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}

