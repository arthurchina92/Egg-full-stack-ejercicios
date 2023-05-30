/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ARTURO
 */
public class Arreglo {
    private int arregloA [][] = new int [5][10];
    private int arregloB [][] = new int [2][10]; 

    public Arreglo() {
    }

    public int[][] getArregloA() {
        return arregloA;
    }

    public void setArregloA(int[][] arregloA) {
        this.arregloA = arregloA;
    }

    public int[][] getArregloB() {
        return arregloB;
    }

    public void setArregloB(int[][] arregloB) {
        this.arregloB = arregloB;
    }

    @Override
    public String toString() {
        return "Arreglo{" + "arregloA=" + arregloA + ", arregloB=" + arregloB + '}';
    }
  
}
