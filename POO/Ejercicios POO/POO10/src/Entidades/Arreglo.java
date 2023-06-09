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
    private double arregloA [][] = new double [1][50];
    private double arregloB [][] = new double [1][20]; 

    public Arreglo() {
    }

    public double[][] getArregloA() {
        return arregloA;
    }

    public void setArregloA(double[][] arregloA) {
        this.arregloA = arregloA;
    }

    public double[][] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[][] arregloB) {
        this.arregloB = arregloB;
    }

    @Override
    public String toString() {
        return "Arreglo{" + "arregloA=" + arregloA + ", arregloB=" + arregloB + '}';
    }

    
}
